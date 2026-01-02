package main.java.mobs.nether;

import main.java.mobs.NeutralMob;

/**
 * Класс Страйдер для Незера.
 */
public class Strider extends NeutralMob {

    public Strider() {
        this.name = "Страйдер";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Бу-бу-бу!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает грибную нить");
    }
}