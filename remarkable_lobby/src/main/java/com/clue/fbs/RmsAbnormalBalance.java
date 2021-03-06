// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmsAbnormalBalance extends Struct {
  public RmsAbnormalBalance __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int key() { return bb.getInt(bb_pos + 0); }
  public byte type() { return bb.get(bb_pos + 4); }
  public float duration() { return bb.getFloat(bb_pos + 8); }
  public float value() { return bb.getFloat(bb_pos + 12); }

  public static int createRmsAbnormalBalance(FlatBufferBuilder builder, int key, byte type, float duration, float value) {
    builder.prep(4, 16);
    builder.putFloat(value);
    builder.putFloat(duration);
    builder.pad(3);
    builder.putByte(type);
    builder.putInt(key);
    return builder.offset();
  }
}

