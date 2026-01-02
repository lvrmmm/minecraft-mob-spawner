package main.java.mobs.nether;

import main.java.mobs.HostileMob;

/**
 * Класс Гаст для Незера.
 */
public class Ghast extends HostileMob {

    public Ghast() {
        this.name = "Гаст";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Плачет...");
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет огненным шаром!");
    }
}