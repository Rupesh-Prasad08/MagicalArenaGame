package com.magicalarena;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1; // 1 to 6
    }

    public int calculateAttackDamage(int diceRoll) {
        return diceRoll * attack;
    }

    public int calculateDefenseStrength(int diceRoll) {
        return diceRoll * strength;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
