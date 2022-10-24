public class nexted_catch_block {
    public static void main(String[] args) {
        try {
            int a[] = {10, 0, 8, 3, 5};
            int r;
            r = a[0] / a[2];
            System.out.println(r);
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Zero exception");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        catch (Exception roshan) {
            System.out.println("Array limit exception");

        }
        finally {
            System.out.println("roshan kumar singh");
        }


    }
}
