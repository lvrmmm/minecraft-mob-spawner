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

        int totalMobsFromFactories = 0;

        // Демонстрация спавна мобов в разных измерениях

        // 1. Обычный мир (Overworld)
        System.out.println("1. Обычный мир (Overworld):");
        MobFactory overworldFactory = new OverworldMobFactory();
        MobSpawner overworldSpawner = new MobSpawner(overworldFactory);
        overworldSpawner.spawnMobGroup();
        totalMobsFromFactories += overworldSpawner.getMobsCreated();

        // 2. Незер (Nether)
        System.out.println("2. Незер (Nether):");
        MobFactory netherFactory = new NetherMobFactory();
        MobSpawner netherSpawner = new MobSpawner(netherFactory);
        netherSpawner.spawnMobGroup();
        totalMobsFromFactories += netherSpawner.getMobsCreated();

        // 3. Энд (The End)
        System.out.println("3. Энд (The End):");
        MobFactory endFactory = new EndMobFactory();
        MobSpawner endSpawner = new MobSpawner(endFactory);
        endSpawner.spawnMobGroup();
        totalMobsFromFactories += endSpawner.getMobsCreated();

        System.out.println("\n=== Статистика создания мобов ===");
        System.out.println("Всего создано мобов через фабрики: " + totalMobsFromFactories);
        System.out.println("Из них:");
        System.out.println("  - Враждебных: " + (totalMobsFromFactories / 3));
        System.out.println("  - Нейтральных: " + (totalMobsFromFactories / 3));
        System.out.println("  - Дружелюбных: " + (totalMobsFromFactories / 3));

        System.out.println("\n=== Программа завершена ===");
    }
}