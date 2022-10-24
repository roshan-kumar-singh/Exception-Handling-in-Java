public class thows_throw {
    public static void main(String[] args) {
        try {
            int b = meth1();
            System.out.println("Area of the rectangle " + b);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

     static int meth1() throws Exception {

            int a = area(-10, 20);
            return a;

    }


   static int area(int l, int b)throws Exception {
       if (l < 0 || b < 0) {
           throw new Exception("length and breath of the rectangle should not be negative");
       }
        int a=l*b;
        return a;
    }
}
