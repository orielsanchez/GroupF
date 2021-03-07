package edu.sdccd.cisc191.f;

import edu.sdccd.cisc191.f.models.*;

public class MainApplication {
    public static void main(String[] args) {
        Player player = new Warrior(100, 5, 10, 10);
        Enemy ogre = new OgreEnemy(50, 10, 10);


        player.setDeck(WarriorStarterDeckBuilder.build());


        System.out.println(player.getHealth());
        System.out.println(ogre.isDead());
    }
}
