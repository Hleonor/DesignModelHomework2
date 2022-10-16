package org.example.homework1and2;

import org.example.homework1and2.game.Game;

public class Main
{
    public static void main(String[] args)
    {
        Game game = Game.getGameInstance();
        game.init();
        game.run();
        game.term();
    }
}