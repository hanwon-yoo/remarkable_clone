<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace com\clue\fbs;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class RmsAnimationInfo extends Struct
{
    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return RmsAnimationInfo
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
     * @return float
     */
    public function GetAttackLength()
    {
        return $this->bb->getFloat($this->bb_pos + 4);
    }

    /**
     * @return float
     */
    public function GetSkill1Length()
    {
        return $this->bb->getFloat($this->bb_pos + 8);
    }

    /**
     * @return float
     */
    public function GetSkill2Length()
    {
        return $this->bb->getFloat($this->bb_pos + 12);
    }

    /**
     * @return float
     */
    public function GetSkill3Length()
    {
        return $this->bb->getFloat($this->bb_pos + 16);
    }

    /**
     * @return sbyte
     */
    public function GetAttackCount()
    {
        return $this->bb->getSbyte($this->bb_pos + 20);
    }

    /**
     * @return sbyte
     */
    public function GetSkill1Count()
    {
        return $this->bb->getSbyte($this->bb_pos + 21);
    }

    /**
     * @return sbyte
     */
    public function GetSkill2Count()
    {
        return $this->bb->getSbyte($this->bb_pos + 22);
    }

    /**
     * @return sbyte
     */
    public function GetSkill3Count()
    {
        return $this->bb->getSbyte($this->bb_pos + 23);
    }


    /**
     * @return int offset
     */
    public static function createRmsAnimationInfo(FlatBufferBuilder $builder, $name, $attackLength, $skill1Length, $skill2Length, $skill3Length, $attackCount, $skill1Count, $skill2Count, $skill3Count)
    {
        $builder->prep(4, 24);
        $builder->putSbyte($skill3Count);
        $builder->putSbyte($skill2Count);
        $builder->putSbyte($skill1Count);
        $builder->putSbyte($attackCount);
        $builder->putFloat($skill3Length);
        $builder->putFloat($skill2Length);
        $builder->putFloat($skill1Length);
        $builder->putFloat($attackLength);
        $builder->pad(2);
        $builder->putShort($name);
        return $builder->offset();
    }
}
