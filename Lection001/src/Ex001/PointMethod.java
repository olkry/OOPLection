package Lesson_07.Ex001;



public class PointMethod {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        int ax = 6;
        int ay = 2;
        int bx = 2;
        int by = 1;
        System.out.println(distance(ax, ay, bx, by));
        // Создать точку 
        // Печать точки
    }

}
