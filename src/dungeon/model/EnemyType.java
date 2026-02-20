package dungeon.model;

public enum EnemyType {
    
    // Slime - Weak, slow, does minimal damage
    SLIME("Slime", 5, 2.0f, 2.0f, 0.0f),
    // Goblin - Standard enemy, slower but can do some damage
    GOBLIN("Goblin", 8, 3.0f, 5.0f, 0.0f),
    // Ghoul - Standard enemy, fast but not strong, can use some magic
    GHOUL("Ghoul", 10, 8.0f, 2.5f, 2.5f),
    // Vampire - Stronger enemy, fast and uses lots of magic
    VAMPIRE("Vampire", 12, 8.0f, 3.0f, 10.0f),
    // Orc - Stronger enemy, tank, but very slow, no magic
    ORC("Orc", 20, 2.0f, 10.0f, 0.0f);

    private final String enemyName;
    private final int baseMaxHp;
    private final float baseSpd;
    private final float baseStr;
    private final float baseMag;

    EnemyType(String enemyName, int baseMaxHp, float baseSpd, float baseStr, float baseMag) {
        this.enemyName = enemyName;
        this.baseMaxHp = baseMaxHp;
        this.baseSpd = baseSpd;
        this.baseStr = baseStr;
        this.baseMag = baseMag;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getEnemyMaxHp() {
        return baseMaxHp;
    }

    public float getEnemySpd() {
        return baseSpd;
    }

    public float getEnemyStr() {
        return baseStr;
    }

    public float getEnemyMag() {
        return baseMag;
    }

}
