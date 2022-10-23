public class intro {
    public static void main(String[] args) {
        int a,b,c;
        try {
            a = 5;
            b = 0;
            c = a / b;
            System.out.println("Result is "+c);
        } catch (ArithmeticException roshan) {
            System.out.println("Division by zero "+roshan);
        }
    }
}
