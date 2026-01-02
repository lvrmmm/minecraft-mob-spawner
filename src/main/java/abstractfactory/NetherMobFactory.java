package main.java.abstractfactory;

import main.java.mobs.HostileMob;
import main.java.mobs.NeutralMob;
import main.java.mobs.FriendlyMob;
import main.java.mobs.nether.*;

/**
 * Конкретная фабрика для создания адских мобов (Nether).
 */
public class NetherMobFactory implements MobFactory {

    @Override
    public HostileMob createHostileMob() {
        return new ZombiePiglin();
    }

    @Override
    public NeutralMob createNeutralMob() {
        return new Hoglin();
    }

    @Override
    public FriendlyMob createFriendlyMob() {
        return new Piglins();
    }
}