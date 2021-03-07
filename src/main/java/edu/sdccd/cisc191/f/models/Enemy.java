package edu.sdccd.cisc191.f.models;

import java.util.List;

public class Enemy extends Entity {

    protected int strength;

    public Enemy(int health, int block, int strength) {
        super(health, block);
        this.strength = strength;
    }

    public void attack() {

    }

    public void block() {

    }

}
