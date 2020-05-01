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

package org.moe.samples.elements.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.elements.common.AtomicElement;

import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSString;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import apple.uikit.UIImage;
import apple.uikit.UIView;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AtomicElementTileView")
@RegisterOnStartup
public class AtomicElementTileView extends UIView {

    private AtomicElement element = null;

    @Selector("alloc")
    public static native AtomicElementTileView alloc();

    @Selector("init")
    public native AtomicElementTileView init();

    protected AtomicElementTileView(Pointer peer) {
        super(peer);
    }

    public void setElement(AtomicElement element) {
        this.element = element;
    }

    @Override
    public void drawRect(CGRect cgRect) {
        CGPoint point;

        // Get the image that represents the element physical state and draw it
        UIImage backgroundImage = PeriodicElements.stateImageForAtomicElementTileView(element.getState());
        CGRect elementSymbolRectangle = CoreGraphics.CGRectMake(0, 0, backgroundImage.size().width(), backgroundImage.size().height());
        backgroundImage.drawInRect(elementSymbolRectangle);

        UIColor.whiteColor().set();

        // Draw the element number
        UIFont font = UIFont.boldSystemFontOfSize(11);
        point = CoreGraphics.CGPointMake(3, 2);
        int n = element.getAtomicNumber();
        NSString atomicNumber = NSString.stringWithString(Integer.toString(n));
        atomicNumber.drawAtPointWithFont(point, font);

        // Draw the element symbol
        font = UIFont.boldSystemFontOfSize(18);
        NSString symbol =  NSString.stringWithString(element.getSymbol());
        CGSize stringSize = symbol.sizeWithFont(font);
        point = CoreGraphics.CGPointMake((elementSymbolRectangle.size().width() - stringSize.width()) / 2, 14.0);
        symbol.drawAtPointWithFont(point, font);
    }
}
