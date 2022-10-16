package org.example.homework1and2.Player;

import java.util.ArrayList;
import java.util.Random;

public class HumanPlayer implements Player
{
    public String name;

    private static final int maxNumberofConn = 100;

    // 定义连接池
    private static ArrayList connnectionList = new ArrayList(maxNumberofConn);

    private static int countConnection = 0;

    public static int getCountConnection()
    {
        return countConnection;
    }

    static
    {
        for (int i = 0; i < maxNumberofConn; i++)
        {
            connnectionList.add(new HumanPlayer());
        }
    }

    private HumanPlayer(){};

    public static HumanPlayer getInstance(int num)
    {
        countConnection = num;
        if (0 == num || num > maxNumberofConn)
        {
            System.out.println("Error");
        }
        return (HumanPlayer) connnectionList.get(num);
    }

    public static HumanPlayer getInstance()
    {
        // 随机获取一个连接
        Random random = new Random();
        countConnection = random.nextInt(maxNumberofConn);
        return (HumanPlayer) connnectionList.get(countConnection);
    }
}
