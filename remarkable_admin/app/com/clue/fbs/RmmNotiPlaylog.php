<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmmNotiPlaylog extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return RmmNotiPlaylog
     */
    public static function getRootAsRmmNotiPlaylog(ByteBuffer $bb)
    {
        $obj = new RmmNotiPlaylog();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmmNotiPlaylog
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    public function getLogs()
    {
        $obj = new RmPlaylog();
        $o = $this->__offset(4);
        return $o != 0 ? $obj->init($this->__indirect($o + $this->bb_pos), $this->bb) : 0;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startRmmNotiPlaylog(FlatBufferBuilder $builder)
    {
        $builder->StartObject(1);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return RmmNotiPlaylog
     */
    public static function createRmmNotiPlaylog(FlatBufferBuilder $builder, $logs)
    {
        $builder->startObject(1);
        self::addLogs($builder, $logs);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param int
     * @return void
     */
    public static function addLogs(FlatBufferBuilder $builder, $logs)
    {
        $builder->addOffsetX(0, $logs, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endRmmNotiPlaylog(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}
