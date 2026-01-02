package main.java.mobs.end;

import main.java.mobs.NeutralMob;

/**
 * Вымышленный класс Хорус-Корова для Энда.
 */
public class ChorusCow extends NeutralMob {

    public ChorusCow() {
        this.name = "Хорус-Корова";
    }

    @Override
    public void spawn() {
        System.out.println("Спавнится " + name + " в Энде");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Телепортирующее мууу!");
    }

    @Override
    public void dropResource() {
        System.out.println(name + " дропает хорус-фрукт и эндер-кожу");
    }
}