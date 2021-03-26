package edu.sdccd.cisc191.f.client;

public abstract class Room {
    protected Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
