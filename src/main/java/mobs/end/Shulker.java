package main.java.mobs.end;

import main.java.mobs.HostileMob;

/**
*Класс Шалкер для Энда.
*/
public class Shulker extends HostileMob {

    public Shulker() {
        this.name = "Шалкер";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Энде");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Щелк-щелк!");
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет снарядом левитации!");
    }
}