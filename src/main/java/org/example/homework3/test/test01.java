package org.example.homework3.test;

import org.example.homework3.block.Block;
import org.example.homework3.block.MoneyBlock;
import org.example.homework3.map.EasyMap;
import org.example.homework3.map.Map;
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
