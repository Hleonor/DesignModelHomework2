package org.example.map;


import org.example.block.Block;

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
