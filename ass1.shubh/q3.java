public class Point {
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    // Getter and setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// Test the Point class
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(point1);

        System.out.println("Point1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point2: (" + point2.getX() + ", " + point2.getY() + ")");

        point1.setX(30);
        point1.setY(40);

        System.out.println("After modifying point1:");
        System.out.println("Point1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point2: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}