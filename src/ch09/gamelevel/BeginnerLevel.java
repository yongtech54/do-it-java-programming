package src.ch09.gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("level1의 달리기!");
    }

    @Override
    public void jump() {
        System.out.println("level1은 못 뛰어요.");
    }

    @Override
    public void turn() {
        System.out.println("level1은 못돌아요.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========[level 1]==========");
    }
}
