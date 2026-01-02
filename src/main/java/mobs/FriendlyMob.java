package main.java.mobs;

/**
 * Абстрактный класс для дружелюбных мобов.
 */
public abstract class FriendlyMob {
    protected String name;

    public abstract void spawn();
    public abstract void makeSound();

    public String getName() {
        return name;
    }
}