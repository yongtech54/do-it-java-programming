package src.ch09.gamelevel;

public class Player {
    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int n) {
        level.showLevelMessage();
        level.go(n);
    }
}
