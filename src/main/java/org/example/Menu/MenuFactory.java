package org.example.Menu;

public class MenuFactory
{
    private volatile static MainMenu mainMenu;
    private volatile static NewMenu newMenu;
    public static MainMenu getMainMenuInstance()
    {
        if (null == mainMenu)
        {
            synchronized (MainMenu.class)
            {
                if (null == mainMenu)
                {
                    mainMenu = new MainMenu();
                }
            }
        }
        return mainMenu;
    }

    public static NewMenu getNewMenuInstance()
    {
        if (null == newMenu)
        {
            synchronized (NewMenu.class)
            {
                if (null == newMenu)
                {
                    newMenu = new NewMenu();
                }
            }
        }
        return newMenu;
    }
}

