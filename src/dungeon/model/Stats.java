package dungeon.model;

public class Stats {
    private int maxHp;
    private int hp;
    private float spd;
    private float str;
    private float mag;
    private float luck;

    public Stats(int maxHp, int hp, float spd, float str, float mag, float luck) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.spd = spd;
        this.str = str;
        this.mag = mag;
        this.luck = luck;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public float getSpd() {
        return spd;
    }

    public float getStr() {
        return str;
    }

    public float getMag() {
        return mag;
    }

    public float getLuck() {
        return luck;
    }
}
