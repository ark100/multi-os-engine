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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.modelio.protocol.MDLNamed;
import apple.modelio.protocol.MDLObjectContainerComponent;
import apple.modelio.protocol.MDLTransformComponent;
import apple.scenekit.SCNNode;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLObject extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLObject alloc();

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
    @Selector("objectWithSCNNode:")
    public static native MDLObject objectWithSCNNode(SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLObject objectWithSCNNodeBufferAllocator(SCNNode scnNode,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
    @Selector("addChild:")
    public native void addChild(MDLObject child);

    @Generated
    @Selector("children")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent children();

    @Generated
    @Selector("enumerateChildObjectsOfClass:root:usingBlock:stopPointer:")
    public native void enumerateChildObjectsOfClassRootUsingBlockStopPointer(Class objectClass, MDLObject root,
            @ObjCBlock(name = "call_enumerateChildObjectsOfClassRootUsingBlockStopPointer") Block_enumerateChildObjectsOfClassRootUsingBlockStopPointer block,
            BoolPtr stopPointer);

    @Generated
    @Selector("hidden")
    public native boolean hidden();

    @Generated
    @Selector("init")
    public native MDLObject init();

    @Generated
    @Selector("instance")
    public native MDLObject instance();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("objectAtPath:")
    public native MDLObject objectAtPath(String path);

    @Generated
    @Selector("parent")
    public native MDLObject parent();

    @Generated
    @Selector("path")
    public native String path();

    @Generated
    @Selector("setChildren:")
    public native void setChildren(@Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    @Generated
    @Selector("setInstance:")
    public native void setInstance(MDLObject value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setParent:")
    public native void setParent_unsafe(MDLObject value);

    @Generated
    public void setParent(MDLObject value) {
        Object __old = parent();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setParent_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@Mapped(ObjCObjectMapper.class) MDLTransformComponent value);

    @Generated
    @Selector("transform")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLTransformComponent transform();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildObjectsOfClassRootUsingBlockStopPointer {
        @Generated
        void call_enumerateChildObjectsOfClassRootUsingBlockStopPointer(MDLObject arg0, BoolPtr arg1);
    }

    @Generated
    @Selector("components")
    public native NSArray<?> components();
}