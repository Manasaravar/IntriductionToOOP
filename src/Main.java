import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello class!!!");
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();
        Random random = new Random(0);// создание объекта класса А класса Point
        A.x = 2;
        A.y = 3;
        B.x = random.nextDouble(1,5);
        B.y = random.nextDouble(1,5);
        C.x = random.nextDouble(1,5);
        C.y = random.nextDouble(1,5);

        System.out.println("X1 = " + A.x);
        System.out.println("Y1 = " + A.y);
        System.out.println("X2 = " + B.x);
        System.out.println("Y2 = " + B.y);
        System.out.println("X3 = " + C.x);
        System.out.println("Y3 = " + C.y);
        System.out.println("Расстояние между А и В = " + Point.distance(B,A));
        System.out.println("Расстояние до точки С = " + Point.distance(C));
    }
}
class Point {
    double x;
    double y;

    static double distance (Point B, Point A) {
        return Math.sqrt(Math.pow((B.x - A.x),2) + Math.pow((B.y - A.y),2));
    }
    static double distance (Point C) {
        Point start = new Point();
        return Math.sqrt(Math.pow((C.x - start.x),2) + Math.pow((C.y - start.y),2));
    }

}