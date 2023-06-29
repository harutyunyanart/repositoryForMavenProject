package name_surname.lesson1;


public class FigurePainter {

    public static void main ( String[] args){
	  // drawLeftUpTriangle(5);
	   drawRightUpTriangle(5);
	  // drawLeftBottomTriangle(5);
	   drawRightBottomTriangle(5);
	   drawRhombus(5);
	}

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
//    public static void drawLeftUpTriangle(int length){
//        for (int i = 0; i <= length; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        // TODO : complete the method
//    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        for (int i = length; i >0; i--) {
            for (int j =1 ; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println( );
        }
        // TODO : complete the method
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
//    public static void drawLeftBottomTriangle(int length){
//        for (int i = length; i >0; i--) {
//            for (int j =1 ; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println( );
//        }
//        // TODO : complete the method
//    }

     /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
      *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        // TODO : complete the method
    }

     /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
      *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length){
        // TODO : complete the method
    }


}
