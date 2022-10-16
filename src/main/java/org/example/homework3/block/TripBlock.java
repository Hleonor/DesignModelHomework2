package org.example.homework3.block;

public class TripBlock implements Block
{
    @Override
    public void beShown(String mapType, String BlockDemensions)
    {
        System.out.println("地图类型是: " + mapType + ", 街道类型是: " + "TripBlock" + ", 街道维度是: " + BlockDemensions);
    }
}

