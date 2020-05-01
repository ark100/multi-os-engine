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

package mac.devtools.xcode6;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier extends
		DTiPhoneSimulatorApplicationSpecifier {
	static {
		NatJ.register();
	}

	@Generated
	protected DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier(
			Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier alloc();

	@Generated
	@Selector("bundleID")
	public native String bundleID();

	@Selector("specifierWithApplicationBundleIdentifier:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier specifierWithApplicationBundleIdentifier(
			@Mapped(ObjCObjectMapper.class) Object arg1);

	@Generated
	@Selector("specifierWithApplicationPath:")
	public static native DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier specifierWithApplicationPath(
			@Mapped(ObjCObjectMapper.class) Object arg1);

	@Generated
	@Selector("specifierWithToolPath:")
	public static native DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier specifierWithToolPath(
			String arg1);

	@Generated
	@Selector("init")
	public native DTiPhoneSimulatorApplicationSpecifier_BundleIdentifier init();
}
