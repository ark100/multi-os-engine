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

package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVAudio3DPoint extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AVAudio3DPoint() {
        super(AVAudio3DPoint.class);
    }

    @Generated
    protected AVAudio3DPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVAudio3DPoint(float x, float y, float z) {
        super(AVAudio3DPoint.class);
        setX(x);
        setY(y);
        setZ(z);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float z();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setZ(float value);
}
