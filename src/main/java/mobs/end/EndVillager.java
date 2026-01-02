package main.java.mobs.end;

import main.java.mobs.FriendlyMob;

/**
 * Вымышленный класс Житель Энда.
 */
public class EndVillager extends FriendlyMob {

    public EndVillager() {
        this.name = "Житель Энда";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Энде");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Говорит на языке Энда...");
    }
}