package edu.sdccd.cisc191.f.cards;

import edu.sdccd.cisc191.f.Card;
import edu.sdccd.cisc191.f.CardType;

public class StrikeCard extends Card {
    private int damage = 5;
    private int cost = 1;
    private CardType cardType =  CardType.ATTACK;
    private boolean isUpgraded = false;

    public String getName() {
        return super.name;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    public boolean isUpgraded() {
        return isUpgraded;
    }

}
