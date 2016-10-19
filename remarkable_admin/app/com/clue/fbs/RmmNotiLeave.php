<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmmNotiLeave extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return RmmNotiLeave
     */
    public static function getRootAsRmmNotiLeave(ByteBuffer $bb)
    {
        $obj = new RmmNotiLeave();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmmNotiLeave
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    /**
     * @return sbyte
     */
    public function getPlayerNo()
    {
        $o = $this->__offset(4);
        return $o != 0 ? $this->bb->getSbyte($o + $this->bb_pos) : 0;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startRmmNotiLeave(FlatBufferBuilder $builder)
    {
        $builder->StartObject(1);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return RmmNotiLeave
     */
    public static function createRmmNotiLeave(FlatBufferBuilder $builder, $playerNo)
    {
        $builder->startObject(1);
        self::addPlayerNo($builder, $playerNo);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param sbyte
     * @return void
     */
    public static function addPlayerNo(FlatBufferBuilder $builder, $playerNo)
    {
        $builder->addSbyteX(0, $playerNo, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endRmmNotiLeave(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}
