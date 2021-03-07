package edu.sdccd.cisc191.f.models;

import edu.sdccd.cisc191.f.models.CardType;

public abstract class Card implements Upgradeable {
    protected String name;
    protected int cost;
    protected String description;
    protected CardType cardType;

}
