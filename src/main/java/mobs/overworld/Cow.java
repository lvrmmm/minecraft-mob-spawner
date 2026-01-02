package main.java.mobs.overworld;

import main.java.mobs.NeutralMob;

/**
 * Класс Корова для обычного мира.
 */
public class Cow extends NeutralMob {

    public Cow() {
        this.name = "Корова";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Мууу!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает говядину и кожу");
    }
}