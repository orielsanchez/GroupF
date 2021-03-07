package edu.sdccd.cisc191.f.models;

public class Player extends Entity {
    protected int energy;
    protected int gold;
    protected Deck<Card> deck;

    public Player(int health, int block, int energy, int gold) {
        super(health, block);
        this.energy = energy;
        this.gold = gold;
    }


    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Deck<Card> getDeck() {
        return deck;
    }

    public void setDeck(Deck<Card> deck) {
        this.deck = deck;
    }
}
