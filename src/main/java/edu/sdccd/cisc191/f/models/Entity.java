package edu.sdccd.cisc191.f.models;

public abstract class Entity {

    protected int health;
    protected int block;
    protected boolean dead = false;

    public Entity(int health, int block) {
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
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
