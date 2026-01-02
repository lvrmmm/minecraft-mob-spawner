package main.java.mobs;

/**
 * Абстрактный класс для нейтральных мобов.
 */
public abstract class NeutralMob {
    protected String name;

    public abstract void spawn();
    public abstract void makeSound();
    public abstract void dropResource();

    public String getName() {
        return name;
    }
}