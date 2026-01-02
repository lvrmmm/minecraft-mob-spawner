package main.java.mobs.nether;


import main.java.mobs.NeutralMob;

/**
 * Класс Хоглин для Незера.
 */
public class Hoglin extends NeutralMob {

    public Hoglin() {
        this.name = "Хоглин";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Хрюкает грозно!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает свинину Незера");
    }
}