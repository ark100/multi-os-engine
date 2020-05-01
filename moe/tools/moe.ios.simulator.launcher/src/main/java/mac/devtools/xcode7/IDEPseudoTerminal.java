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

package mac.devtools.xcode7;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.foundation.NSError;
import mac.foundation.NSFileHandle;


@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class IDEPseudoTerminal extends NSObject {

    static {
        NatJ.register();
    }

    protected IDEPseudoTerminal(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native IDEPseudoTerminal alloc();

    @Selector("initWithAccessMode:ownsSlaveFileDescriptor:error:")
    public native IDEPseudoTerminal initWithAccessModeOwnsSlaveFileDescriptorError(int mode, boolean owns, Ptr<NSError> err);

    @Selector("slaveFileHandle")
    public native NSFileHandle slaveFileHandle();

    @Selector("masterFileHandle")
    public native IDEMasterPtyFileHandle masterFileHandle();

    @Selector("slaveName")
    public native String slaveName();

}
