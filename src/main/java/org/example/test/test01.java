package org.example.test;

import org.example.block.Block;
import org.example.block.MoneyBlock;
import org.example.map.EasyMap;
import org.example.map.Map;
import org.testng.annotations.Test;

public class test01
{
    @Test
    public void testMap()
    {
        Block block = new MoneyBlock();
        Map map = new EasyMap();
        map.setBlock(block);
        map.show("3");
    }
}
