package main.java.abstractfactory;

import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;
import main.java.mobs.FriendlyMob;
import main.java.mobs.overworld.*;

/**
 * Конкретная фабрика для создания мобов обычного мира (Overworld).
 */
public class OverworldMobFactory implements MobFactory {

    @Override
    public HostileMob createHostileMob() {
        // Можно варьировать создание разных враждебных мобов
        return new Zombie();
    }

    @Override
    public NeutralMob createNeutralMob() {
        return new Pig();
    }

    @Override
    public FriendlyMob createFriendlyMob() {
        return new Villager();
    }
}