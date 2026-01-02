package main.java;

import main.java.abstractfactory.*;
import main.java.mobs.FriendlyMob;
import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;

/**
 * Главный класс для демонстрации работы паттерна "Абстрактная фабрика".
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Minecraft Mob Spawner Demo ===\n");

        // Демонстрация спавна мобов в разных измерениях

        // 1. Обычный мир (Overworld)
        System.out.println("1. Обычный мир (Overworld):");
        MobFactory overworldFactory = new OverworldMobFactory();
        MobSpawner overworldSpawner = new MobSpawner(overworldFactory);
        overworldSpawner.spawnMobGroup();

        // 2. Незер (Nether)
        System.out.println("2. Незер (Nether):");
        MobFactory netherFactory = new NetherMobFactory();
        MobSpawner netherSpawner = new MobSpawner(netherFactory);
        netherSpawner.spawnMobGroup();

        // 3. Энд (The End)
        System.out.println("3. Энд (The End):");
        MobFactory endFactory = new EndMobFactory();
        MobSpawner endSpawner = new MobSpawner(endFactory);
        endSpawner.spawnMobGroup();

        // Дополнительная демонстрация создания конкретных мобов
        System.out.println("=== Дополнительные мобы ===");

        // Создание других мобов из Overworld
        System.out.println("\nДругие мобы Overworld:");
        HostileMob skeleton = new main.java.mobs.overworld.Skeleton();
        skeleton.spawn();
        skeleton.makeSound();
        skeleton.attack();

        NeutralMob cow = new main.java.mobs.overworld.Cow();
        cow.spawn();
        cow.makeSound();
        cow.dropResource();

        FriendlyMob trader = new main.java.mobs.overworld.Trader();
        trader.spawn();
        trader.makeSound();

        // Создание других мобов из Nether
        System.out.println("\nДругие мобы Nether:");
        HostileMob ghast = new main.java.mobs.nether.Ghast();
        ghast.spawn();
        ghast.makeSound();
        ghast.attack();

        // Создание других мобов из End
        System.out.println("\nДругие мобы End:");
        HostileMob shulker = new main.java.mobs.end.Shulker();
        shulker.spawn();
        shulker.makeSound();
        shulker.attack();

        System.out.println("\n=== Программа завершена ===");
    }
}