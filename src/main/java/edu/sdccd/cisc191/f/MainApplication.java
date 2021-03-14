package edu.sdccd.cisc191.f;

public class MainApplication {
    public static void main(String[] args) {
        Player player = new Warrior(100, 5, 10, 10);
        Enemy ogre = new OgreEnemy(50, 10);

        Map map = new Map();
        map.generateListOfRooms();



        System.out.println(player.getHealth());
        System.out.println(ogre.isDead());
    }
}
