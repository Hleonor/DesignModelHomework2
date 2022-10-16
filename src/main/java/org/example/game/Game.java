package org.example.game;

import org.example.Menu.MainMenu;
import org.example.Menu.Menu;
import org.example.Menu.MenuFactory;

public class Game
{
    private static MainMenu mainMenu;
    private Menu menu;
    private static int player = 2;

    public static void setPlayer(int player)
    {
        Game.player = player;
    }

    public void init()
    {
        // 读取游戏文件内容至内存...
        mainMenu = MenuFactory.getMainMenuInstance();
    }

    public void run()
    {
        int order = mainMenu.display();
        while (order != 0)
        {
            Menu newMenu = MenuFactory.getNewMenuInstance();
            newMenu.setNewMenu_order(order);
            System.out.println();
            newMenu.display();
            order = mainMenu.display();
        }
        System.out.println();
    }

    public void term()
    {
        System.out.println("**Game terminated**");
        // 保存游戏相关内容至文件...
        mainMenu = null;
    }

    private Game()
    {
    }

    private static Game game;

    public static Game getGameInstance()
    {
        if (null == game)
        {
            synchronized (Game.class)
            {
                if (null == game)
                {
                    return new Game();
                }
            }
        }
        return game;
    }

}
