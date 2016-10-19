// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmReqSync extends Table {
  public static RmmReqSync getRootAsRmmReqSync(ByteBuffer _bb) { return getRootAsRmmReqSync(_bb, new RmmReqSync()); }
  public static RmmReqSync getRootAsRmmReqSync(ByteBuffer _bb, RmmReqSync obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RmmReqSync __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte playerNo() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public RmmUnitOrder orders(int j) { return orders(new RmmUnitOrder(), j); }
  public RmmUnitOrder orders(RmmUnitOrder obj, int j) { int o = __offset(6); return o != 0 ? obj.__init(__vector(o) + j * 16, bb) : null; }
  public int ordersLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public RmmUnitHit hits(int j) { return hits(new RmmUnitHit(), j); }
  public RmmUnitHit hits(RmmUnitHit obj, int j) { int o = __offset(8); return o != 0 ? obj.__init(__vector(o) + j * 12, bb) : null; }
  public int hitsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createRmmReqSync(FlatBufferBuilder builder,
      byte playerNo,
      int ordersOffset,
      int hitsOffset) {
    builder.startObject(3);
    RmmReqSync.addHits(builder, hitsOffset);
    RmmReqSync.addOrders(builder, ordersOffset);
    RmmReqSync.addPlayerNo(builder, playerNo);
    return RmmReqSync.endRmmReqSync(builder);
  }

  public static void startRmmReqSync(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addPlayerNo(FlatBufferBuilder builder, byte playerNo) { builder.addByte(0, playerNo, 0); }
  public static void addOrders(FlatBufferBuilder builder, int ordersOffset) { builder.addOffset(1, ordersOffset, 0); }
  public static void startOrdersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(16, numElems, 2); }
  public static void addHits(FlatBufferBuilder builder, int hitsOffset) { builder.addOffset(2, hitsOffset, 0); }
  public static void startHitsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(12, numElems, 2); }
  public static int endRmmReqSync(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

