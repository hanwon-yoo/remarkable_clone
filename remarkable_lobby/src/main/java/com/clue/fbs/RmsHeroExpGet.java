// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmsHeroExpGet extends Struct {
  public RmsHeroExpGet __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte type() { return bb.get(bb_pos + 0); }
  public int exp() { return bb.getInt(bb_pos + 4); }

  public static int createRmsHeroExpGet(FlatBufferBuilder builder, byte type, int exp) {
    builder.prep(4, 8);
    builder.putInt(exp);
    builder.pad(3);
    builder.putByte(type);
    return builder.offset();
  }
}

