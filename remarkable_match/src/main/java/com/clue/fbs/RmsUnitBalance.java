// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmsUnitBalance extends Struct {
  public RmsUnitBalance __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public short name() { return bb.getShort(bb_pos + 0); }
  public int level() { return bb.getInt(bb_pos + 4); }
  public float health() { return bb.getFloat(bb_pos + 8); }
  public float physicalAttack() { return bb.getFloat(bb_pos + 12); }
  public float magicalAttack() { return bb.getFloat(bb_pos + 16); }
  public float physicalDefense() { return bb.getFloat(bb_pos + 20); }
  public float magicalDefense() { return bb.getFloat(bb_pos + 24); }

  public static int createRmsUnitBalance(FlatBufferBuilder builder, short name, int level, float health, float physicalAttack, float magicalAttack, float physicalDefense, float magicalDefense) {
    builder.prep(4, 28);
    builder.putFloat(magicalDefense);
    builder.putFloat(physicalDefense);
    builder.putFloat(magicalAttack);
    builder.putFloat(physicalAttack);
    builder.putFloat(health);
    builder.putInt(level);
    builder.pad(2);
    builder.putShort(name);
    return builder.offset();
  }
}

