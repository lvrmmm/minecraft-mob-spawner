package main.java.mobs.nether;

import main.java.mobs.HostileMob;

/**
 * Класс Зомби-Пиглин для Незера.
 */
public class ZombiePiglin extends HostileMob {

    public ZombiePiglin() {
        this.name = "Зомби-Пиглин";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Гррр-хрю!");
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует золотым мечом!");
    }
}