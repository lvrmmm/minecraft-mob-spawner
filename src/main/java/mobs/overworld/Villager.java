package main.java.mobs.overworld;

import main.java.mobs.FriendlyMob;

/**
 * Класс Житель для обычного мира.
 */
public class Villager extends FriendlyMob {

    public Villager() {
        this.name = "Житель";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Хмммм...");
    }
}