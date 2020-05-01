/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import ios.uikit.protocol.UITabBarDelegate;
import ios.uikit.protocol.UITabBarControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarController extends UIViewController implements
		UITabBarDelegate, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected UITabBarController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UITabBarController alloc();

	/**
	 * customizableViewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/customizableViewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("customizableViewControllers")
	public native NSArray<? extends UIViewController> customizableViewControllers();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UITabBarControllerDelegate delegate();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native UITabBarController init();

	@Generated
	@Selector("initWithCoder:")
	public native UITabBarController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UITabBarController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	/**
	 * moreNavigationController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/moreNavigationController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("moreNavigationController")
	public native UINavigationController moreNavigationController();

	/**
	 * selectedIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/selectedIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("selectedIndex")
	@NUInt
	public native long selectedIndex();

	/**
	 * selectedViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/selectedViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("selectedViewController")
	public native UIViewController selectedViewController();

	/**
	 * customizableViewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/customizableViewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCustomizableViewControllers:")
	public native void setCustomizableViewControllers(NSArray<? extends UIViewController> value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UITabBarControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UITabBarControllerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * selectedIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/selectedIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSelectedIndex:")
	public native void setSelectedIndex(@NUInt long value);

	/**
	 * selectedViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/selectedViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSelectedViewController:")
	public native void setSelectedViewController_unsafe(UIViewController value);

	/**
	 * selectedViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/selectedViewController">iOS Dev Center</a>
	 */
	@Generated
	public void setSelectedViewController(UIViewController value) {
		Object __old = selectedViewController();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setSelectedViewController_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * viewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/viewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewControllers:")
	public native void setViewControllers(NSArray<? extends UIViewController> value);

	/**
	 * setViewControllers:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instm/UITabBarController/setViewControllers:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewControllers:animated:")
	public native void setViewControllersAnimated(NSArray<? extends UIViewController> viewControllers,
			boolean animated);

	/**
	 * tabBar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/tabBar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tabBar")
	public native UITabBar tabBar();

	@Generated
	@IsOptional
	@Selector("tabBar:didBeginCustomizingItems:")
	public native void tabBarDidBeginCustomizingItems(UITabBar tabBar,
			NSArray<? extends UITabBarItem> items);

	@Generated
	@IsOptional
	@Selector("tabBar:didEndCustomizingItems:changed:")
	public native void tabBarDidEndCustomizingItemsChanged(UITabBar tabBar,
			NSArray<? extends UITabBarItem> items, boolean changed);

	@Generated
	@IsOptional
	@Selector("tabBar:didSelectItem:")
	public native void tabBarDidSelectItem(UITabBar tabBar, UITabBarItem item);

	@Generated
	@IsOptional
	@Selector("tabBar:willBeginCustomizingItems:")
	public native void tabBarWillBeginCustomizingItems(UITabBar tabBar,
			NSArray<? extends UITabBarItem> items);

	@Generated
	@IsOptional
	@Selector("tabBar:willEndCustomizingItems:changed:")
	public native void tabBarWillEndCustomizingItemsChanged(UITabBar tabBar,
			NSArray<? extends UITabBarItem> items, boolean changed);

	/**
	 * viewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITabBarController_Class/index.html#//apple_ref/occ/instp/UITabBarController/viewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllers")
	public native NSArray<? extends UIViewController> viewControllers();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("prepareInterstitialAds")
	public static native void prepareInterstitialAds();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}