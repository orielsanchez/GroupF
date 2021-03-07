package edu.sdccd.cisc191.f.models.cards;

import edu.sdccd.cisc191.f.models.Card;
import edu.sdccd.cisc191.f.models.CardType;

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

    @Override
    public void upgradeCard() {
        damage += 1;
        isUpgraded = true;
    }
}
