// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmVector2 extends Struct {
  public RmmVector2 __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public short x() { return bb.getShort(bb_pos + 0); }
  public short z() { return bb.getShort(bb_pos + 2); }

  public static int createRmmVector2(FlatBufferBuilder builder, short x, short z) {
    builder.prep(2, 4);
    builder.putShort(z);
    builder.putShort(x);
    return builder.offset();
  }
}

