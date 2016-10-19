<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmbReqBuyHero extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return RmbReqBuyHero
     */
    public static function getRootAsRmbReqBuyHero(ByteBuffer $bb)
    {
        $obj = new RmbReqBuyHero();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmbReqBuyHero
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    /**
     * @return short
     */
    public function getName()
    {
        $o = $this->__offset(4);
        return $o != 0 ? $this->bb->getShort($o + $this->bb_pos) : \com\clue\fbs\RmUnitName::None;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startRmbReqBuyHero(FlatBufferBuilder $builder)
    {
        $builder->StartObject(1);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return RmbReqBuyHero
     */
    public static function createRmbReqBuyHero(FlatBufferBuilder $builder, $name)
    {
        $builder->startObject(1);
        self::addName($builder, $name);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param short
     * @return void
     */
    public static function addName(FlatBufferBuilder $builder, $name)
    {
        $builder->addShortX(0, $name, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endRmbReqBuyHero(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}