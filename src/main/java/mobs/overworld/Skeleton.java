package main.java.mobs.overworld;

import main.java.mobs.HostileMob;

/**
 * Класс Скелет для обычного мира.
 */
public class Skeleton extends HostileMob {

    public Skeleton() {
        this.name = "Скелет";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Скрип-скрип...");
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет из лука!");
    }
}