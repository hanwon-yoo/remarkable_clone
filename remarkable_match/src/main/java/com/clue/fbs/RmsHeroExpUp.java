// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmsHeroExpUp extends Struct {
  public RmsHeroExpUp __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int level() { return bb.getInt(bb_pos + 0); }
  public int exp() { return bb.getInt(bb_pos + 4); }

  public static int createRmsHeroExpUp(FlatBufferBuilder builder, int level, int exp) {
    builder.prep(4, 8);
    builder.putInt(exp);
    builder.putInt(level);
    return builder.offset();
  }
}

