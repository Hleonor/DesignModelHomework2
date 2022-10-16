package org.example;

import org.example.game.Game;

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