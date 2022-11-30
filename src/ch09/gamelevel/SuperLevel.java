package src.ch09.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("level3의 달리기!");
    }

    @Override
    public void jump() {
        System.out.println("level3의 점프!");
    }

    @Override
    public void turn() {
        System.out.println("level3의 턴!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========[level 3]==========");
    }
}
