package org.example.homework3.block;

public class SlideBlock implements Block
{
    @Override
    public void beShown(String mapType, String BlockDemensions)
    {
        System.out.println("地图类型是: " + mapType + ", 街道类型是: " + "SlideBlock" + ", 街道维度是: " + BlockDemensions);
    }
}