package edu.sdccd.cisc191.f.client;
//Comment
public abstract class Actor {

    protected int health;
    protected int block;
    protected double attackMultiplier = 1.0;
    protected double blockMultiplier = 1.0;
    protected boolean isDead = false;

    public Actor(int health, int block) {
        this.health = health;
        this.block = block;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        this.isDead = dead;
    }
}
