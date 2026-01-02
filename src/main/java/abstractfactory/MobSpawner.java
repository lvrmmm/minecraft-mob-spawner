package main.java.abstractfactory;

import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;
import main.java.mobs.FriendlyMob;

/**
 * Класс для спавна групп мобов с использованием фабрики.
 * Демонстрирует работу паттерна Абстрактная Фабрика.
 */
public class MobSpawner {
    private MobFactory factory;

    /**
     * Конструктор принимает конкретную фабрику
     */
    public MobSpawner(MobFactory factory) {
        this.factory = factory;
    }

    /**
     * Спавнит группу мобов для текущего измерения
     */
    public void spawnMobGroup() {
        System.out.println("=== Спавн группы мобов ===");

        HostileMob hostileMob = factory.createHostileMob();
        NeutralMob neutralMob = factory.createNeutralMob();
        FriendlyMob friendlyMob = factory.createFriendlyMob();

        hostileMob.spawn();
        hostileMob.makeSound();
        hostileMob.attack();

        neutralMob.spawn();
        neutralMob.makeSound();
        neutralMob.dropResource();

        friendlyMob.spawn();
        friendlyMob.makeSound();

        System.out.println();
    }
}