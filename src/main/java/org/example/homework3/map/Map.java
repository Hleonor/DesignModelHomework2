package org.example.homework3.map;

import org.example.homework3.block.Block;

public abstract class Map
{
    /**
     * 桥接模式的主要思想是通过使用组合的方式替代继承
     * 抽象出变化的维度，将变化的维度和不变的维度分离开来
     */
    public abstract void  show(String blockDimensions);
    public abstract void  setBlock(Block block);
    public Block getBlock()
    {
        return block;
    }
    Block block;
}
