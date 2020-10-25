package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasPacMan {

    public static int l = 0, k = 0, width, height;
    public static String select;

    public static void moveLeft() {
        l -= 1;
    }
    public static void moveRight() {
        l += 1;
    }
    public static void moveUp() {
        k -= 1;
    }
    public static void moveDown() {
        k += 1;
    }
    public static void cetakPosisi() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if (i == k && j == l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
