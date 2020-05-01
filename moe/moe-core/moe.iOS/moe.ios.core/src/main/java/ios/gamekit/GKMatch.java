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

package ios.gamekit;


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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.gamekit.protocol.GKMatchDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatch extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GKMatch(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GKMatch alloc();

	/**
	 * chooseBestHostPlayerWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/chooseBestHostPlayerWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("chooseBestHostPlayerWithCompletionHandler:")
	public native void chooseBestHostPlayerWithCompletionHandler(
			@ObjCBlock(name = "call_chooseBestHostPlayerWithCompletionHandler") Block_chooseBestHostPlayerWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_chooseBestHostPlayerWithCompletionHandler {
		@Generated
		void call_chooseBestHostPlayerWithCompletionHandler(String arg0);
	}

	/**
	 * chooseBestHostingPlayerWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/chooseBestHostingPlayerWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chooseBestHostingPlayerWithCompletionHandler:")
	public native void chooseBestHostingPlayerWithCompletionHandler(
			@ObjCBlock(name = "call_chooseBestHostingPlayerWithCompletionHandler") Block_chooseBestHostingPlayerWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_chooseBestHostingPlayerWithCompletionHandler {
		@Generated
		void call_chooseBestHostingPlayerWithCompletionHandler(
				GKPlayer arg0);
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native GKMatchDelegate delegate();

	/**
	 * disconnect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/disconnect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disconnect")
	public native void disconnect();

	/**
	 * expectedPlayerCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/expectedPlayerCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("expectedPlayerCount")
	@NUInt
	public native long expectedPlayerCount();

	@Generated
	@Selector("init")
	public native GKMatch init();

	/**
	 * playerIDs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/playerIDs">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("playerIDs")
	public native NSArray<String> playerIDs();

	/**
	 * players</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/players">iOS Dev Center</a>
	 */
	@Generated
	@Selector("players")
	public native NSArray<? extends GKPlayer> players();

	/**
	 * rematchWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/rematchWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rematchWithCompletionHandler:")
	public native void rematchWithCompletionHandler(
			@ObjCBlock(name = "call_rematchWithCompletionHandler") Block_rematchWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_rematchWithCompletionHandler {
		@Generated
		void call_rematchWithCompletionHandler(GKMatch arg0, NSError arg1);
	}

	/**
	 * sendData:toPlayers:dataMode:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/sendData:toPlayers:dataMode:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendData:toPlayers:dataMode:error:")
	public native boolean sendDataToPlayersDataModeError(NSData data,
			NSArray<? extends GKPlayer> players, @NInt long mode, Ptr<NSError> error);

	/**
	 * sendData:toPlayers:withDataMode:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/sendData:toPlayers:withDataMode:error:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("sendData:toPlayers:withDataMode:error:")
	public native boolean sendDataToPlayersWithDataModeError(NSData data,
			NSArray<String> playerIDs, @NInt long mode, Ptr<NSError> error);

	/**
	 * sendDataToAllPlayers:withDataMode:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/sendDataToAllPlayers:withDataMode:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendDataToAllPlayers:withDataMode:error:")
	public native boolean sendDataToAllPlayersWithDataModeError(NSData data,
			@NInt long mode, Ptr<NSError> error);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) GKMatchDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instp/GKMatch/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) GKMatchDelegate value) {
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
	 * voiceChatWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKMatch_Ref/index.html#//apple_ref/occ/instm/GKMatch/voiceChatWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("voiceChatWithName:")
	public native GKVoiceChat voiceChatWithName(String name);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

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