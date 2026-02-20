package dungeon.model;

public class Enemy {
    
    private EnemyType enemyType;
    private Stats stats;

    public Enemy(EnemyType type) {
        this.enemyType = type;
        this.stats = new Stats(
            type.getEnemyMaxHp(),
            type.getEnemyMaxHp(), // current hp set equal to max
            type.getEnemySpd(),
            type.getEnemyStr(),
            type.getEnemyMag(),
            0.0f //enemies don't have luck (for now)
        );
    }

    public EnemyType getType() {
        return enemyType;
    }

    public Stats getStats() {
        return stats;
    }
}
