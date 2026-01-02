package main.java.mobs.overworld;

import main.java.mobs.FriendlyMob;

/**
 * Класс Торговец для обычного мира.
 */
public class Trader extends FriendlyMob {

    public Trader() {
        this.name = "Торговец";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Посмотрите мой товар!");
    }
}