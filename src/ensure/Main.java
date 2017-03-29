package ensure;

import java.util.Scanner;

/**
 * @brief Main Class
 * Menampilkan kelas main
 * Created by Girvandi on 3/28/2017.
 */
public class Main  {
	public static void main(String[] args) throws InterruptedException {
		int n;
		Scanner input =  new Scanner(System.in);
		n = input.nextInt();
		ConfigStore.Get("./data/base.vze");
		//System.out.println(Zoo.Get(n));
		int pil;
		pil = input.nextInt();
		if (pil == 1) {
			System.out.println(Zoo.Get(n));
		} else if (pil == 2) {
			Zoo.Get(n).tour(0, 6);
		} else if (pil == 3) {
			Zoo.Get(n).TotalFood();
		} else {
			while (true) {
				System.out.println(Zoo.Get(n));
				Zoo.Get(n).update();
				Utility.clearWait(1);
			}
		}
	}
}