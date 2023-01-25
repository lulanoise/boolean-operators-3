package it.develhope.booleanoperators;
public class Start {
    public static void main(String[] args) {

        boolean A = !(!(!(false ^ false) || (true && true)));

        int x = 3;
        int y = 2;

        boolean B = !((x * y) <= 6) && (x - y != 1);

        System.out.println("A: "+ A);
        System.out.println("B: "+ B);

    }
}

/*

A: !(!(!(false ^ false) || (true && true)))
   !(!(!(false) || (true)))
   !(!(true || true))
   !(!true)
   !false
   true

B: !((x * y) <= 6) && (x - y != 1)
   !(6 <= 6) && (1 != 1)
   !true && (false)
   false && false
   false
 */