package main.java.abstractfactory;

import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;
import main.java.mobs.FriendlyMob;
import main.java.mobs.end.*;

/**
 * Конкретная фабрика для создания мобов Энда (The End).
 */
public class EndMobFactory implements MobFactory {

    @Override
    public HostileMob createHostileMob() {
        return new Enderman();
    }

    @Override
    public NeutralMob createNeutralMob() {
        return new ChorusCow();
    }

    @Override
    public FriendlyMob createFriendlyMob() {
        return new EndVillager();
    }
}