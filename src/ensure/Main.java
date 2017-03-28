package ensure;

import ensure.animal.Animal;
import ensure.cell.Cell;
import ensure.configstore.ConfigStore;

import java.util.Scanner;

/**
 * @brief Main Class
 * Menampilkan kelas main
 * Created by rayandrew on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input =  new Scanner(System.in);
        n = input.nextInt();
        ConfigStore.Get("./data/base.vze");
        System.out.println(Zoo.Get(n));
    }
}
