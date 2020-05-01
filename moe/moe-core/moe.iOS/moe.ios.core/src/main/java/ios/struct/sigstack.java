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

package ios.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class sigstack extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sigstack() {
		super(sigstack.class);
	}

	@Generated
	protected sigstack(Pointer peer) {
		super(peer);
	}

	@Generated
	public sigstack(BytePtr ss_sp, int ss_onstack) {
		super(sigstack.class);
		setSs_sp(ss_sp);
		setSs_onstack(ss_onstack);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native BytePtr ss_sp();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSs_sp(BytePtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ss_onstack();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSs_onstack(int value);
}
