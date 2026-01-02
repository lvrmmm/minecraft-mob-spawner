package main.java.mobs;

/**
 * Абстрактный класс для враждебных мобов.
 */
public abstract class HostileMob {
    protected String name;

    public abstract void spawn();
    public abstract void makeSound();
    public abstract void attack();

    public String getName() {
        return name;
    }
}