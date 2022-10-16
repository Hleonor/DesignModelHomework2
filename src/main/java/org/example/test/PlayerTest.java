package org.example.test;

import org.example.Player.HumanPlayer;
import org.testng.annotations.Test;

public class PlayerTest extends Thread
{
    private int operationType;

    public void setOperationType(int operationType)
    {
        this.operationType = operationType;
    }

    public void run()
    {
        if (operationType == 1)
        {
            applyForPlayerWithNumber();
        }
        else if (operationType == 2)
        {
            randomApplyForPlayer();
        }
    }

    private void applyForPlayerWithNumber()
    {
        for (int i = 1; i < 5; i++)
        {
            HumanPlayer humanPlayer = HumanPlayer.getInstance(i);
            humanPlayer.name = "HumanPlayer" + i;
            System.out.println("为玩家 " + humanPlayer.name + "申请了第 " + HumanPlayer.getCountConnection() +
            " 个连接");
            try
            {
                System.out.println(humanPlayer.name + " 正在游玩....");
                Thread.sleep(1);
                System.out.println(humanPlayer.name + " 下线\n");
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    private void randomApplyForPlayer()
    {
        for (int i = 0; i < 5; i++)
        {
            HumanPlayer humanPlayer = HumanPlayer.getInstance();
            humanPlayer.name = "RandomPlayer" + i;

            System.out.println("为玩家 " + humanPlayer.name + " 随机申请了第 " + humanPlayer.getCountConnection() + " 个连接");
            try
            {
                System.out.println(humanPlayer.name + " 正在游玩....");
                Thread.sleep(1);
                System.out.println(humanPlayer.name + " 下线\n");
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void testHumanPlayer()
    {
        PlayerTest test1 = new PlayerTest();
        PlayerTest test2 = new PlayerTest();
        test1.setOperationType(1);
        test2.setOperationType(2);
        test2.run();
        test1.run();
    }
}
