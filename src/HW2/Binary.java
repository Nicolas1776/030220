package HW2;

public class Binary {

    public static void main(String args[]) {
        int a = 42;	/* 42 = 0010 1010 */
        int b = 15;	/* 15 = 0000 1111 */
        int a2 = -42;	/* -42 = 1101 10110 */
        int b2 = -15;	/* -15 = 1111 10000 */
        int c = 0;
        int c2 = 0;

        c = a & b;       /* 10 = 0000 1010 */
        c2 = a2 & b2;       /* -48 = 1111 10110 */
        System.out.println("a & b = " + c );
        System.out.println("a2 & b2 = " + c2 );

        c = a | b;       /* 47 = 0010 1111 */
        c2 = a2 | b2;       /* -9 = 1111 1011 */
        System.out.println("a | b = " + c );
        System.out.println("a2 | b2 = " + c2 );

        c = a ^ b;       /* 37 = 0010 0101 */
        c2 = a2 ^ b2;       /* 39 = 0010 00110 */
        System.out.println("a ^ b = " + c );
        System.out.println("a2 ^ b2 = " + c2 );

        c = ~ a; /* -43 = 1101 0101 */
        c2 = ~ a2; /* 41 = 0010 1001 */
        System.out.println("~a = " + c );
        System.out.println("~a2 = " + c2 );

        c = a << 2;     /* 168 = 1010 1000 */
        c2 = a2 << 2;     /* -168 = 0110 11000 */
        System.out.println("a << 2 = " + c );
        System.out.println("a2 << 2 = " + c2 );

        c = a >> 2;     /* 10 = 1010 */
        c2 = a2 >> 2;     /* -11 = 0011 01101 */
        System.out.println("a >> 2  = " + c );
        System.out.println("a2 >> 2  = " + c2 );

        c = a >>> 2;     /* 10 = 0000 1010 */
        c2 = a2 >>> 2;     /* 1073741813 = ?????????? */
        System.out.println("a >>> 2 = " + c );
        System.out.println("a2 >>> 2 = " + c2 );
    }
}

