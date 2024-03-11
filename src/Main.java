import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
        //ex1(axisSystem);
        //ex2(axisSystem);
        //ex3(axisSystem);
        //ex4(axisSystem);
        //ex5(axisSystem);
        //ex6(axisSystem);
        //ex7(axisSystem);
        ex8(axisSystem);
    }


    public static void ex1(AxisSystem board) {
        board.addSinglePoint(100, 150, "blue");
    }

    public static void ex2(AxisSystem board) {
        board.addSinglePoint(-200, 200, "red");
    }

    public static void ex3(AxisSystem board) {
        board.addSinglePoint(50, 50, "blue");
        board.addSinglePoint(60, 60, "blue");
        board.addSinglePoint(70, 70, "blue");
    }

    public static void ex4(AxisSystem board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        board.addSinglePoint(scanner.nextInt(), scanner.nextInt(), "blue");
    }

    public static void ex5(AxisSystem board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much point you want to draw?");
        int num = scanner.nextInt();
        System.out.println("which color?");
        String color = scanner.nextLine();
        Random random = new Random();
        int[] drawPoint = new int[num * 2];
        for (int i = 0; i < drawPoint.length; i++) {
            drawPoint[i] = random.nextInt(-250, 250);
            drawPoint[i + 1] = random.nextInt(-250, 250);
            i++;
        }
        board.addMultiplePoints(drawPoint, color);
    }


    public static void ex6(AxisSystem board) {
        for (int i = -250; i < 250; i++) {
            board.addSinglePoint(i, i * 2 + 100, "red");
        }
    }

    public static void ex7(AxisSystem board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("for y = mx+n , enter m , n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(" Y = " + m + "x + " + n);
        for (int i = -250; i < 250; i++) {
            board.addSinglePoint(i, i * m + n, "black");
        }
    }

    public static void ex8(AxisSystem board) {
        int[] points = new int[1000];
        int x = -250;
        int y = 0;

        for (int i = 0; i < points.length; i+=2) {
            points[i] = x;
            points[i + 1] = 2 * x * x - 3 * x + 50;
            x++;
        }
        board.addMultiplePoints(points, "red");
    }

}






