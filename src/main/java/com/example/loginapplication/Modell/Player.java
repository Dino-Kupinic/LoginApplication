package com.example.loginapplication.Modell;

public class Player {
    private int health;
    private int energy;
    private int level;

    public Player() {
        setHealth(5);
        setEnergy(0);
        setLevel(1);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
