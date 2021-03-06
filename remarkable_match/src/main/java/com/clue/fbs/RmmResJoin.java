// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmResJoin extends Table {
  public static RmmResJoin getRootAsRmmResJoin(ByteBuffer _bb) { return getRootAsRmmResJoin(_bb, new RmmResJoin()); }
  public static RmmResJoin getRootAsRmmResJoin(ByteBuffer _bb, RmmResJoin obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RmmResJoin __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String roomId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer roomIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public byte playerNo() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public long timestamp() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public int resultCode() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createRmmResJoin(FlatBufferBuilder builder,
      int roomIdOffset,
      byte playerNo,
      long timestamp,
      int resultCode) {
    builder.startObject(4);
    RmmResJoin.addTimestamp(builder, timestamp);
    RmmResJoin.addResultCode(builder, resultCode);
    RmmResJoin.addRoomId(builder, roomIdOffset);
    RmmResJoin.addPlayerNo(builder, playerNo);
    return RmmResJoin.endRmmResJoin(builder);
  }

  public static void startRmmResJoin(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addRoomId(FlatBufferBuilder builder, int roomIdOffset) { builder.addOffset(0, roomIdOffset, 0); }
  public static void addPlayerNo(FlatBufferBuilder builder, byte playerNo) { builder.addByte(1, playerNo, 0); }
  public static void addTimestamp(FlatBufferBuilder builder, long timestamp) { builder.addLong(2, timestamp, 0); }
  public static void addResultCode(FlatBufferBuilder builder, int resultCode) { builder.addInt(3, resultCode, 0); }
  public static int endRmmResJoin(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

