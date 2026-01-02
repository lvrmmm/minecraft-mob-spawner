package main.java.mobs.end;

import main.java.mobs.NeutralMob;

/**
 * Класс Эндермит для Энда.
 */
public class Endermite extends NeutralMob {

    public Endermite() {
        this.name = "Эндермит";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Энде");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Писк-писк!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает жемчуг Энда");
    }
}