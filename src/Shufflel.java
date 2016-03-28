/**
 * Created by Dmytro_Kapeliukh on 3/26/2016.
 */
public class Shufflel {
    public static void main (String[] args) {
        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }
        while (x > 0) {
            x = x - 1;
            System.out.print ("-");
         if (x == 2) {
             System.out.print ("b c");
         }
         if (x == 1) {
             System.out.print ("d");
             x = x - 1;
         }
        }
    }
}
