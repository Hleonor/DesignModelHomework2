package org.example.Menu;

import java.util.Scanner;

public class MainMenu implements Menu
{
    // private volatile static MainMenu mainMenu;

    private void show_mainMenu()
    {
        System.out.println("        Main Menu");
        System.out.println("1. new");
        System.out.println("2. load");
        System.out.println("3. Save");
        System.out.println("4. Option");
        System.out.println("5. Play");
        System.out.println("0. Exit");
        System.out.printf("You selected: ");
    }
    public int display()
    {
        show_mainMenu();

        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();
        System.out.println("Choice = " + order);

        return order;
    }

    public void setNewMenu_order(int order)
    {
        // do nothing
    }
}

