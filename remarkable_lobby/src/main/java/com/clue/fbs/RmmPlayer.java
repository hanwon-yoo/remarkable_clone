// automatically generated by the FlatBuffers compiler, do not modify

package com.clue.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class RmmPlayer extends Table {
  public static RmmPlayer getRootAsRmmPlayer(ByteBuffer _bb) { return getRootAsRmmPlayer(_bb, new RmmPlayer()); }
  public static RmmPlayer getRootAsRmmPlayer(ByteBuffer _bb, RmmPlayer obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public RmmPlayer __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte playerNo() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public String uid() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer uidAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public boolean ai() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String name() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String country() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer countryAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public short leaguePoint() { int o = __offset(14); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public byte level() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public short hero() { int o = __offset(18); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public short heroDeadTime() { int o = __offset(20); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public RmmUnit units(int j) { return units(new RmmUnit(), j); }
  public RmmUnit units(RmmUnit obj, int j) { int o = __offset(22); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int unitsLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public short killHeroCount() { int o = __offset(24); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public short killPetCount() { int o = __offset(26); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public byte deadCount() { int o = __offset(28); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int dealToHero() { int o = __offset(30); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int dealToPet() { int o = __offset(32); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int damageFromHero() { int o = __offset(34); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int damageFromPet() { int o = __offset(36); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createRmmPlayer(FlatBufferBuilder builder,
      byte playerNo,
      int uidOffset,
      boolean ai,
      int nameOffset,
      int countryOffset,
      short leaguePoint,
      byte level,
      short hero,
      short heroDeadTime,
      int unitsOffset,
      short killHeroCount,
      short killPetCount,
      byte deadCount,
      int dealToHero,
      int dealToPet,
      int damageFromHero,
      int damageFromPet) {
    builder.startObject(17);
    RmmPlayer.addDamageFromPet(builder, damageFromPet);
    RmmPlayer.addDamageFromHero(builder, damageFromHero);
    RmmPlayer.addDealToPet(builder, dealToPet);
    RmmPlayer.addDealToHero(builder, dealToHero);
    RmmPlayer.addUnits(builder, unitsOffset);
    RmmPlayer.addCountry(builder, countryOffset);
    RmmPlayer.addName(builder, nameOffset);
    RmmPlayer.addUid(builder, uidOffset);
    RmmPlayer.addKillPetCount(builder, killPetCount);
    RmmPlayer.addKillHeroCount(builder, killHeroCount);
    RmmPlayer.addHeroDeadTime(builder, heroDeadTime);
    RmmPlayer.addHero(builder, hero);
    RmmPlayer.addLeaguePoint(builder, leaguePoint);
    RmmPlayer.addDeadCount(builder, deadCount);
    RmmPlayer.addLevel(builder, level);
    RmmPlayer.addAi(builder, ai);
    RmmPlayer.addPlayerNo(builder, playerNo);
    return RmmPlayer.endRmmPlayer(builder);
  }

  public static void startRmmPlayer(FlatBufferBuilder builder) { builder.startObject(17); }
  public static void addPlayerNo(FlatBufferBuilder builder, byte playerNo) { builder.addByte(0, playerNo, 0); }
  public static void addUid(FlatBufferBuilder builder, int uidOffset) { builder.addOffset(1, uidOffset, 0); }
  public static void addAi(FlatBufferBuilder builder, boolean ai) { builder.addBoolean(2, ai, false); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(3, nameOffset, 0); }
  public static void addCountry(FlatBufferBuilder builder, int countryOffset) { builder.addOffset(4, countryOffset, 0); }
  public static void addLeaguePoint(FlatBufferBuilder builder, short leaguePoint) { builder.addShort(5, leaguePoint, 0); }
  public static void addLevel(FlatBufferBuilder builder, byte level) { builder.addByte(6, level, 0); }
  public static void addHero(FlatBufferBuilder builder, short hero) { builder.addShort(7, hero, 0); }
  public static void addHeroDeadTime(FlatBufferBuilder builder, short heroDeadTime) { builder.addShort(8, heroDeadTime, 0); }
  public static void addUnits(FlatBufferBuilder builder, int unitsOffset) { builder.addOffset(9, unitsOffset, 0); }
  public static int createUnitsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnitsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addKillHeroCount(FlatBufferBuilder builder, short killHeroCount) { builder.addShort(10, killHeroCount, 0); }
  public static void addKillPetCount(FlatBufferBuilder builder, short killPetCount) { builder.addShort(11, killPetCount, 0); }
  public static void addDeadCount(FlatBufferBuilder builder, byte deadCount) { builder.addByte(12, deadCount, 0); }
  public static void addDealToHero(FlatBufferBuilder builder, int dealToHero) { builder.addInt(13, dealToHero, 0); }
  public static void addDealToPet(FlatBufferBuilder builder, int dealToPet) { builder.addInt(14, dealToPet, 0); }
  public static void addDamageFromHero(FlatBufferBuilder builder, int damageFromHero) { builder.addInt(15, damageFromHero, 0); }
  public static void addDamageFromPet(FlatBufferBuilder builder, int damageFromPet) { builder.addInt(16, damageFromPet, 0); }
  public static int endRmmPlayer(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

