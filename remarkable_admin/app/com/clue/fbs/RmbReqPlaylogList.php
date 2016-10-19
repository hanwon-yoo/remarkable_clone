<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmbReqPlaylogList extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return RmbReqPlaylogList
     */
    public static function getRootAsRmbReqPlaylogList(ByteBuffer $bb)
    {
        $obj = new RmbReqPlaylogList();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmbReqPlaylogList
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    /**
     * @return long
     */
    public function getFrom()
    {
        $o = $this->__offset(4);
        return $o != 0 ? $this->bb->getLong($o + $this->bb_pos) : 0;
    }

    /**
     * @return int
     */
    public function getCount()
    {
        $o = $this->__offset(6);
        return $o != 0 ? $this->bb->getInt($o + $this->bb_pos) : 0;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startRmbReqPlaylogList(FlatBufferBuilder $builder)
    {
        $builder->StartObject(2);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return RmbReqPlaylogList
     */
    public static function createRmbReqPlaylogList(FlatBufferBuilder $builder, $from, $count)
    {
        $builder->startObject(2);
        self::addFrom($builder, $from);
        self::addCount($builder, $count);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param long
     * @return void
     */
    public static function addFrom(FlatBufferBuilder $builder, $from)
    {
        $builder->addLongX(0, $from, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param int
     * @return void
     */
    public static function addCount(FlatBufferBuilder $builder, $count)
    {
        $builder->addIntX(1, $count, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endRmbReqPlaylogList(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}
