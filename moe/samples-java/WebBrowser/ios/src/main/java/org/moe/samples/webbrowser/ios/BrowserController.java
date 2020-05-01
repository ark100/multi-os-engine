// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.webbrowser.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.webbrowser.common.Bookmarks;

import ios.foundation.NSError;
import ios.foundation.NSMutableArray;
import ios.foundation.NSMutableDictionary;
import ios.foundation.NSURL;
import ios.foundation.NSURLRequest;
import ios.uikit.NSLayoutConstraint;
import ios.uikit.UIBarButtonItem;
import ios.uikit.UIColor;
import ios.uikit.UIDevice;
import ios.uikit.UIPopoverController;
import ios.uikit.UITableView;
import ios.uikit.UITextField;
import ios.uikit.UIViewController;
import ios.uikit.UIWebView;
import ios.uikit.enums.UIBarButtonItemStyle;
import ios.uikit.enums.UIKeyboardType;
import ios.uikit.enums.UIPopoverArrowDirection;
import ios.uikit.enums.UIRectEdge;
import ios.uikit.enums.UIReturnKeyType;
import ios.uikit.enums.UITextAutocorrectionType;
import ios.uikit.enums.UITextBorderStyle;
import ios.uikit.enums.UIUserInterfaceIdiom;
import ios.uikit.protocol.UITextFieldDelegate;
import ios.uikit.protocol.UIWebViewDelegate;

public class BrowserController extends UIViewController implements
		UIWebViewDelegate, UITextFieldDelegate {

	private UIWebView webview;
	private UITextField addressBar;

	private final NSMutableDictionary views = NSMutableDictionary.alloc().init();
	private final NSMutableArray constraints = NSMutableArray.alloc().init();

	public static native BrowserController alloc();

	protected BrowserController(Pointer peer) {
		super(peer);
	}

	private void loadURL(String string) {
		if (string != null) {
			string = Bookmarks.prepareUrlAddress(string);
			addressBar.setText(string);
			NSURL url = NSURL.URLWithString(string);
			NSURLRequest req = NSURLRequest.requestWithURL(url);
			webview.loadRequest(req);
		}
	}

	@Override
	public void viewDidLoad() {
		super.viewDidLoad();

		setTitle("Web Browser");

		setEdgesForExtendedLayout(UIRectEdge.None);
		view().setBackgroundColor(UIColor.whiteColor());

		UIBarButtonItem bmbutton = UIBarButtonItem.alloc()
				.initWithTitleStyleTargetAction("Bookmarks",
						UIBarButtonItemStyle.Plain, this,
						new SEL("showBookmarks"));

		navigationItem().setRightBarButtonItem(bmbutton);


		views.put("bottomGuide", this.bottomLayoutGuide());
		views.put("topGuide", this.topLayoutGuide());

		webview = UIWebView.alloc().init();
		webview.setTranslatesAutoresizingMaskIntoConstraints(false);
		view().addSubview(webview);
		views.put("web", webview);

		webview.setDelegate_unsafe(this);
		webview.setScalesPageToFit(true);

		addressBar = UITextField.alloc().init();
		addressBar.setTranslatesAutoresizingMaskIntoConstraints(false);
		view().addSubview(addressBar);
		views.put("address", addressBar);

		addressBar.setDelegate_unsafe(this);
		addressBar.setKeyboardType(UIKeyboardType.URL);
		addressBar.setReturnKeyType(UIReturnKeyType.Go);
		addressBar.setAutocorrectionType(UITextAutocorrectionType.No);
		addressBar.setBorderStyle(UITextBorderStyle.RoundedRect);

		constraints.addObjectsFromArray(NSLayoutConstraint
				.constraintsWithVisualFormatOptionsMetricsViews("H:|-[address]-|",
						0, null, views));
		constraints.addObjectsFromArray(NSLayoutConstraint
				.constraintsWithVisualFormatOptionsMetricsViews("H:|-0-[web]-0-|",
						0, null, views));
		constraints.addObjectsFromArray(NSLayoutConstraint
				.constraintsWithVisualFormatOptionsMetricsViews("V:[topGuide]-[address]-[web]-0-[bottomGuide]",
						0, null, views));

		view().addConstraints(constraints);
		view().layoutSubviews();
	}

	@Override
	public void viewWillAppear(boolean animated) {
		super.viewWillAppear(animated);

		if (addressBar.text().length() == 0) {
			loadURL(Bookmarks.bookmarks[0]);
		}
	}

	@Override
	public void viewDidDisappear(boolean animated) {
		if (webview != null) {
			loadURL(null);
		}

		super.viewDidDisappear(animated);
	}

	@Selector("showBookmarks")
	public void showBookmarks() {
		SimpleTableController bms = SimpleTableController.alloc().init();
		bms.setTitle("Bookmarks");
		for (String bm : Bookmarks.bookmarks) {
			bms.add(bm);
		}
		if (UIDevice.currentDevice().userInterfaceIdiom() == UIUserInterfaceIdiom.Phone) {
			bms.setListener(new SimpleTableController.EventListener() {
				@Override
				public void tableViewDidSelectRow(UITableView tableView,
						String row) {
					loadURL(row);
					navigationController().popViewControllerAnimated(true);
				}
			});
			navigationController().pushViewControllerAnimated(bms, true);
		} else {
			final UIPopoverController ctrl = UIPopoverController.alloc()
					.initWithContentViewController(bms);
			bms.setListener(new SimpleTableController.EventListener() {
				@Override
				public void tableViewDidSelectRow(UITableView tableView,
						String row) {
					loadURL(row);
					ctrl.dismissPopoverAnimated(true);
				}
			});
			ctrl.presentPopoverFromBarButtonItemPermittedArrowDirectionsAnimated(
					navigationItem().rightBarButtonItem(),
					UIPopoverArrowDirection.Any, true);
		}
	}

	@Override
	public void webViewDidFailLoadWithError(UIWebView webView, NSError error) {
		System.out.println(error.toString());
	}

	@Override
	public boolean webViewShouldStartLoadWithRequestNavigationType(
			UIWebView webView, NSURLRequest request, long navigationType) {
		addressBar.setText(request.mainDocumentURL().absoluteString());
		return true;
	}

	@Override
	public boolean textFieldShouldReturn(UITextField textField) {
		loadURL(textField.text());
		textField.resignFirstResponder();
		return true;
	}

}
