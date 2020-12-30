public class Driver {

    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        int C = 0;
        System.out.println("Below are multiples of 3" + '\n' + A);

        while (A < 999)
            System.out.println(A += 3);

        if (A > 998)
            System.out.println("Below are multiples of 5" + '\n' + B);

        while (B < 999)
            System.out.println(B += 5);

        if (B > 999)
            System.out.println("Below are multiples of 15" + '\n' + C);

        while (C < 990)
            System.out.println(C += 15);

    }
}
