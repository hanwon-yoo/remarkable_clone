// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmVector2b extends Struct {
  public RmmVector2b __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte x() { return bb.get(bb_pos + 0); }
  public byte z() { return bb.get(bb_pos + 1); }

  public static int createRmmVector2b(FlatBufferBuilder builder, byte x, byte z) {
    builder.prep(1, 2);
    builder.putByte(z);
    builder.putByte(x);
    return builder.offset();
  }
}

