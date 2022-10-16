package org.example.homework3.map;


import org.example.homework3.block.Block;

public class EasyMap extends Map
{
    @Override
    public void show(String blockDimensions)
    {
        blockDimensions = "3维";
        block.beShown("简单地图", blockDimensions);
    }
    @Override
    public void setBlock(Block block)
    {
        this.block = block;
    }
}
