package org.example.block;

public interface Block
{
    /**
     * 桥接模式的主要思想是通过使用组合的方式替代继承
     * 抽象出变化的维度，将变化的维度和不变的维度分离开来
     */
    void beShown(String mapType , String BlockDemensions);
}
