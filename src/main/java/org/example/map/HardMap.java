package org.example.map;

import org.example.block.Block;

public class HardMap extends Map
{
    @Override
    public void show(String blockDimensions)
    {
        blockDimensions = "2维";
        block.beShown("难地图", blockDimensions);
    }
    @Override
    public void setBlock(Block block)
    {
        this.block = block;
    }
}
