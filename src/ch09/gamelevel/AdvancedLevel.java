package src.ch09.gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("level2의 달리기!");
    }

    @Override
    public void jump() {
        System.out.println("level2의 점프!");
    }

    @Override
    public void turn() {
        System.out.println("level2는 못돌아요.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========[level 2]==========");
    }
}
