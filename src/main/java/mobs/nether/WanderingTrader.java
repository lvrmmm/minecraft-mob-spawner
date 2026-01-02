package main.java.mobs.nether;

import main.java.mobs.FriendlyMob;

/**
 * Класс Странствующий торговец для Незера.
 */
public class WanderingTrader extends FriendlyMob {

    public WanderingTrader() {
        this.name = "Странствующий торговец";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Незере");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": У меня есть редкие товары!");
    }
}