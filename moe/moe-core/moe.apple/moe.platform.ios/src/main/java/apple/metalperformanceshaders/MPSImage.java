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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import apple.metalperformanceshaders.struct.MPSImageReadWriteParams;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImage alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("featureChannels")
    @NUInt
    public native long featureChannels();

    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MPSImage init();

    @Generated
    @Selector("initWithDevice:imageDescriptor:")
    public native MPSImage initWithDeviceImageDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSImageDescriptor imageDescriptor);

    @Generated
    @Selector("initWithTexture:featureChannels:")
    public native MPSImage initWithTextureFeatureChannels(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long featureChannels);

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Selector("numberOfImages")
    @NUInt
    public native long numberOfImages();

    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    @Generated
    @Selector("pixelSize")
    @NUInt
    public native long pixelSize();

    @Generated
    @Selector("precision")
    @NUInt
    public native long precision();

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    public native long setPurgeableState(@NUInt long state);

    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture texture();

    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    @Generated
    @Selector("width")
    @NUInt
    public native long width();

    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSImageAllocator defaultAllocator();

    @Generated
    @Selector("readBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void readBytesDataLayoutBytesPerRowRegionFeatureChannelInfoImageIndex(VoidPtr dataBytes,
            @NUInt long dataLayout, @NUInt long bytesPerRow, @ByValue MTLRegion region,
            @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);

    @Generated
    @Selector("readBytes:dataLayout:imageIndex:")
    public native void readBytesDataLayoutImageIndex(VoidPtr dataBytes, @NUInt long dataLayout, @NUInt long imageIndex);

    @Generated
    @Selector("writeBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void writeBytesDataLayoutBytesPerRowRegionFeatureChannelInfoImageIndex(ConstVoidPtr dataBytes,
            @NUInt long dataLayout, @NUInt long bytesPerRow, @ByValue MTLRegion region,
            @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);

    @Generated
    @Selector("writeBytes:dataLayout:imageIndex:")
    public native void writeBytesDataLayoutImageIndex(ConstVoidPtr dataBytes, @NUInt long dataLayout,
            @NUInt long imageIndex);
}