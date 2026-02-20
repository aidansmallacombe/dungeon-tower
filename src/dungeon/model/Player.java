package dungeon.model;

public class Player {
    private String name;
    private Stats stats;
    // may add more variables later (items, classes, abilities, etc)

    public Player(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }
}


