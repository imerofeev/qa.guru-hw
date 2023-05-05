public class Main {
    public static void main(String args[]) {
        int a = 20;
        int b = 5;
        System.out.println("a = " + a + "\n" + "b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b) + "\n");

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a) + "\n");

        boolean c = true;
        boolean d = false;
        System.out.println("Logical 'and': " + (c && d));
        System.out.println("Logical 'or': " + (d || c));
        System.out.println("Logical 'not': " + !c + "\n");

        int e = Integer.MAX_VALUE;
        System.out.println("Max value of int: " + e);
        int f = 1;
        System.out.println("Overflow result: " + (e + f) + "\n");
    }
}
