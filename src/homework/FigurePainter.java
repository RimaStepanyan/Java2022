package homework;

public class FigurePainter {

    public static void main(String[] args) {

        // Figure 1
        /**
         *
         * *
         * * *
         * * * *
         * * * * *
         */

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Figure 2


//        for (int i = 0; i < 5; i++) {
//            for (int j = 4; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Figure 3
        /**
         * * * * *
         * * * *
         * * *
         * *
         *

         */


//        for (int i = 4; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
