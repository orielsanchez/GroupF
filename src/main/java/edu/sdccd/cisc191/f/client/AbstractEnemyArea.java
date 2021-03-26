package edu.sdccd.cisc191.f.client;

public abstract class AbstractEnemyArea extends Room {
    protected Enemy enemy;
    protected boolean battleWon;

    public abstract void generateEnemy();
}
