package main.java.mobs.overworld;

import main.java.mobs.NeutralMob;

/**
 * Класс Свинья для обычного мира.
 */
public class Pig extends NeutralMob {

    public Pig() {
        this.name = "Свинья";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Хрю-хрю!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает свинину");
    }
}