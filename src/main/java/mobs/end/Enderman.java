package main.java.mobs.end;

import main.java.mobs.HostileMob;

/**
 * Класс Эндермен для Энда.
 */
public class Enderman extends HostileMob {

    public Enderman() {
        this.name = "Эндермен";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Энде");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ... (зловещее молчание)");
    }

    @Override
    public void attack() {
        System.out.println(name + " телепортируется и атакует!");
    }
}