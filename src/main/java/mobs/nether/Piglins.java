package main.java.mobs.nether;

import main.java.mobs.FriendlyMob;

/**
 * Класс Пиглины для Незера.
 */
public class Piglins extends FriendlyMob {

    public Piglins() {
        this.name = "Пиглин";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Хрю-хрю (золото?)");
    }
}