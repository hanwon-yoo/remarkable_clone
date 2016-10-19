<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmHero extends Struct
{
    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmHero
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
    public function GetName()
    {
        return $this->bb->getShort($this->bb_pos + 0);
    }

    /**
     * @return int
     */
    public function GetSkin()
    {
        return $this->bb->getInt($this->bb_pos + 4);
    }

    /**
     * @return long
     */
    public function GetBirth()
    {
        return $this->bb->getLong($this->bb_pos + 8);
    }


    /**
     * @return int offset
     */
    public static function createRmHero(FlatBufferBuilder $builder, $name, $skin, $birth)
    {
        $builder->prep(8, 16);
        $builder->putLong($birth);
        $builder->putInt($skin);
        $builder->pad(2);
        $builder->putShort($name);
        return $builder->offset();
    }
}