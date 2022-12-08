package src.ch11;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

}

class Circle implements Cloneable{
    Point point;
    int radius;

    Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("원점: (%d, %d), 반지름: %d", point.x, point.y, radius);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle circleCopy = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(circleCopy);

        System.out.println(circle.point);
        System.out.println(circleCopy.point);

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(circleCopy));
    }
}
