package ensure;

import ensure.configstore.ConfigStore;
import java.util.Scanner;
import ensure.configstore.Utility;

/**
 * @brief Main Class
 * Menampilkan kelas main
 * Created by rayandrew on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n, pil;
        Scanner input =  new Scanner(System.in);
        System.out.print("Input maxCell : ");
        n = input.nextInt();
        if(ConfigStore.Get("./data/base.vze") != -1) {
            System.out.print("Input choice : ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println(Zoo.Get(n));
            } else if(pil == 2) {
                //Zoo.Get(n).tour(6,0);
            } else if(pil == 3) {
                Zoo.Get(n).TotalFood();
            } else {
                while(true) {
                    System.out.println(Zoo.Get(n));
                    Zoo.Get(n).update();
                    Utility.clearWait(1);
                }
            }
        } else {
            System.out.println(Zoo.Get(n));
        }
    }
}
