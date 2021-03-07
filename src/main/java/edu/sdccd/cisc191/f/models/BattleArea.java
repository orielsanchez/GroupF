package edu.sdccd.cisc191.f.models;

import java.util.Random;

public class BattleArea implements Runnable {
    Player player;
    Enemy enemy;
    private Random random;
    private boolean playerTurn = true;
    private Thread thread;


    public BattleArea() {
    }

    public BattleArea(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    @Override
    public void run() {
        while (true) {
            if (playerTurn == false) {
                System.out.println("Enemy's turn!");
                playerTurn = true;
            } else {
                System.out.println("Player's turn!");
                playerTurn = false;
            }
        }
    }
}
