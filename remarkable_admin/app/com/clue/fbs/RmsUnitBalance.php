<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmsUnitBalance extends Struct
{
    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmsUnitBalance
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
    public function GetLevel()
    {
        return $this->bb->getInt($this->bb_pos + 4);
    }

    /**
     * @return float
     */
    public function GetHealth()
    {
        return $this->bb->getFloat($this->bb_pos + 8);
    }

    /**
     * @return float
     */
    public function GetPhysicalAttack()
    {
        return $this->bb->getFloat($this->bb_pos + 12);
    }

    /**
     * @return float
     */
    public function GetMagicalAttack()
    {
        return $this->bb->getFloat($this->bb_pos + 16);
    }

    /**
     * @return float
     */
    public function GetPhysicalDefense()
    {
        return $this->bb->getFloat($this->bb_pos + 20);
    }

    /**
     * @return float
     */
    public function GetMagicalDefense()
    {
        return $this->bb->getFloat($this->bb_pos + 24);
    }


    /**
     * @return int offset
     */
    public static function createRmsUnitBalance(FlatBufferBuilder $builder, $name, $level, $health, $physicalAttack, $magicalAttack, $physicalDefense, $magicalDefense)
    {
        $builder->prep(4, 28);
        $builder->putFloat($magicalDefense);
        $builder->putFloat($physicalDefense);
        $builder->putFloat($magicalAttack);
        $builder->putFloat($physicalAttack);
        $builder->putFloat($health);
        $builder->putInt($level);
        $builder->pad(2);
        $builder->putShort($name);
        return $builder->offset();
    }
}
