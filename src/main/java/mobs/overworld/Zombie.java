package main.java.mobs.overworld;


import main.java.mobs.HostileMob;

/**
 * Класс Зомби для обычного мира.
 */
public class Zombie extends HostileMob {

    public Zombie() {
        this.name = "Зомби";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в обычном мире");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Урррр...");
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует игрока!");
    }
}