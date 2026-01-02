package main.java.abstractfactory;

import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;
import main.java.mobs.FriendlyMob;

/**
 * Абстрактная фабрика для создания мобов.
 * Определяет интерфейс для создания семейств связанных мобов.
 */
public interface MobFactory {
    /**
     * Создает враждебного моба
     */
    HostileMob createHostileMob();

    /**
     * Создает нейтрального моба
     */
    NeutralMob createNeutralMob();

    /**
     * Создает дружелюбного моба
     */
    FriendlyMob createFriendlyMob();
}