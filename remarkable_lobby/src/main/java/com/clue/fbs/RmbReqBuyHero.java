// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmbReqBuyHero extends Table {
  public static RmbReqBuyHero getRootAsRmbReqBuyHero(ByteBuffer _bb) { return getRootAsRmbReqBuyHero(_bb, new RmbReqBuyHero()); }
  public static RmbReqBuyHero getRootAsRmbReqBuyHero(ByteBuffer _bb, RmbReqBuyHero obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RmbReqBuyHero __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public short name() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) : 0; }

  public static int createRmbReqBuyHero(FlatBufferBuilder builder,
      short name) {
    builder.startObject(1);
    RmbReqBuyHero.addName(builder, name);
    return RmbReqBuyHero.endRmbReqBuyHero(builder);
  }

  public static void startRmbReqBuyHero(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addName(FlatBufferBuilder builder, short name) { builder.addShort(0, name, 0); }
  public static int endRmbReqBuyHero(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

