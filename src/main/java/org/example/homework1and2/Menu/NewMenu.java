package org.example.homework1and2.Menu;

import org.example.homework1and2.game.Game;

import java.util.Scanner;

public class NewMenu implements Menu
{
    private int newMenu_order;
    private int volume = 50;
    private int resolution = 3;

    public void setNewMenu_order(int newMenu_order)
    {
        this.newMenu_order = newMenu_order;
    }

    private void show_new()
    {
        System.out.println("    Set number of players(2-8)");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        System.out.println("5. 5");
        System.out.println("6. 6");
        System.out.println("7. 7");
        System.out.println("8. 8");
        System.out.println("0. Back");
        System.out.print("You selected: ");
    }

    private void show_load()
    {
        System.out.println("    Select the Record to be loaded(1-5)");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        System.out.println("5. 5");
        System.out.println("0. Back");
        System.out.print("You selected: ");
    }

    private void show_save()
    {
        System.out.println("    Select the Record to save(1-5)");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        System.out.println("5. 5");
        System.out.println("0. Back");
        System.out.print("You selected: ");
    }

    private void show_option()
    {
        System.out.println("    Set options :");
        System.out.println("1. Set the value of Volume(0-100)");
        System.out.println("2. Set the resolution");
        System.out.println("0. Back");
        System.out.print("You selected: ");
    }

    private void setVolume()
    {
        System.out.println("    Set Volume");
        System.out.print("input value(0-100): ");
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
        this.volume = volume;
        System.out.println();
    }

    private void setResolution()
    {
        System.out.println("    Set Resolution");
        System.out.println("1. 640*320");
        System.out.println("2. 800*600");
        System.out.println("3. 1024*768");

        System.out.print("Your selection: ");
        Scanner sc = new Scanner(System.in);
        int resolution = sc.nextInt();
        this.resolution = resolution;
        System.out.println();
    }

    public int display()
    {
        if (newMenu_order == 1)
        {
            show_new();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("Choice = " + choice);
            System.out.println("Set number of players: " + choice);
            Game.setPlayer(choice);
            System.out.println();
        }
        else if (newMenu_order == 2)
        {
            show_load();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("Choice = " + choice);
            System.out.println("Loading record with id = " + choice);
            System.out.println();
        }
        else if (newMenu_order == 3)
        {
            show_save();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("Choice = " + choice);
            System.out.println("Saving record with id = " + choice);
            System.out.println();
        }
        else if (newMenu_order == 4)
        {
            show_option();

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            while (choice != 0)
            {
                System.out.println("Choice = " + choice);
                System.out.println();

                if (choice == 1)
                {
                    setVolume();
                }
                else if (choice == 2)
                {
                    setResolution();
                }

                show_option();
                choice = sc.nextInt();
            }
            System.out.println();
        }
        else if (newMenu_order == 5)
        {
            System.out.println("Now is playing...\n");
        }
        else if (newMenu_order == 0)
        {
            System.out.println("Exit");
        }
        else
        {
            System.out.println("Wrong input");
        }
        return 0;
    }
}

