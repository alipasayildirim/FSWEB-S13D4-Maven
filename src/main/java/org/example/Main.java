package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("-----------------------------------------------------");

        Player p1 = new Player("Aragorn", 100, Weapon.SWORD);

        System.out.println(p1.healthRemaining()); // 100

        p1.loseHealth(80);
        System.out.println(p1.healthRemaining()); // 20

        p1.loseHealth(50);

        System.out.println(p1.healthRemaining()); // 0

        Player p2 = new Player("Gimli", 50, Weapon.AXE);
        p2.restoreHealth(70);
        System.out.println(p2.healthRemaining());
    }
}