package ensure;

import ensure.configstore.ConfigStore;

import java.io.IOException;
import java.util.Scanner;

import static ensure.configstore.Utility.clearWait;

/**
 * Main Class
 * Menampilkan kelas main
 * Created by rayandrew on 3/28/2017.
 */
class Main {

  public static void main(String[] args) throws InterruptedException, IOException {
    int n, pil;
    Scanner input = new Scanner(System.in);
    System.out.print("Input maxCell : ");
    n = input.nextInt();
    mainMenu();
    if (ConfigStore.Get(n) != -1) {
      System.out.print("Input choice : ");
      pil = input.nextInt();
      if (pil == 1) {
        System.out.println(Zoo.Get(n));
      } else if (pil == 2) {
        Zoo.Get(n).tour(6, 0);
      } else if (pil == 3) {
        Zoo.Get(n).TotalFood();
      } else if (pil == 4) {
        MainTest.Testing();
      } else {
        Dynamic d = new Dynamic(n);
        d.start();
        try {
          System.in.read();
          d.stop();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    } else {
      System.out.println(Zoo.Get(n));
    }
  }

  private static void mainMenu() {
    System.out.println("Main Menu");
    System.out.println("1.    Print Map");
    System.out.println("2.    Tour");
    System.out.println("3.    Get Total Food in Zoo");
    System.out.println("4.    Unit testing");
    System.out.println("Else. Dynamic Animal Move");
    System.out.println();
  }
}

class Dynamic implements Runnable {

  private Thread t;
  private volatile boolean exit = false;
  private final int n;

  @Override
  public void run() {
    while (!exit) {
      System.out.println(Zoo.Get(n));
      Zoo.Get(n).update();
      try {
        clearWait(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  void start() {
    System.out.println("Starting Dynamic Animal Move");
    if (t == null) {
      t = new Thread(this, String.valueOf(n));
      try {
        clearWait(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      t.start();
    }
  }

  void stop() {
    System.out.println("Stopping Dynamic Animal Move");
    exit = true;
    System.out.println("Success!");
  }

  Dynamic(int n_) {
    n = n_;
  }
}