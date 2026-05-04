package org.example;

public enum Weapon {
    SWORD(85,1.5),
    AXE(100,0.5);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage,double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
