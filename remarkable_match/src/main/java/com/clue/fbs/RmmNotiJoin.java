// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmNotiJoin extends Table {
  public static RmmNotiJoin getRootAsRmmNotiJoin(ByteBuffer _bb) { return getRootAsRmmNotiJoin(_bb, new RmmNotiJoin()); }
  public static RmmNotiJoin getRootAsRmmNotiJoin(ByteBuffer _bb, RmmNotiJoin obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RmmNotiJoin __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public RmmPlayer player0() { return player0(new RmmPlayer()); }
  public RmmPlayer player0(RmmPlayer obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public RmmPlayer player1() { return player1(new RmmPlayer()); }
  public RmmPlayer player1(RmmPlayer obj) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createRmmNotiJoin(FlatBufferBuilder builder,
      int player0Offset,
      int player1Offset) {
    builder.startObject(2);
    RmmNotiJoin.addPlayer1(builder, player1Offset);
    RmmNotiJoin.addPlayer0(builder, player0Offset);
    return RmmNotiJoin.endRmmNotiJoin(builder);
  }

  public static void startRmmNotiJoin(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addPlayer0(FlatBufferBuilder builder, int player0Offset) { builder.addOffset(0, player0Offset, 0); }
  public static void addPlayer1(FlatBufferBuilder builder, int player1Offset) { builder.addOffset(1, player1Offset, 0); }
  public static int endRmmNotiJoin(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

