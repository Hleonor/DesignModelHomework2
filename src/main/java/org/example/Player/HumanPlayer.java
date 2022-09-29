package org.example.Player;

import java.util.ArrayList;
import java.util.Random;

public class HumanPlayer implements Player
{
    private static final int maxNumberofConn = 100;
    private static ArrayList connnectionList = new ArrayList(maxNumberofConn);

    private static int countConnection = 0;

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
