class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Add (int, int): " + calculator.add(7, 10));
        System.out.println("Add (double, double): " + calculator.add(5.5, 10.5));
        System.out.println("Add (int, int, int): " + calculator.add(7, 10, 15));
    }
}