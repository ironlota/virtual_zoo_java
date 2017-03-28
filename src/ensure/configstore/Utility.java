package ensure.configstore;

import java.util.concurrent.TimeUnit;

/**
 * Class Utility
 * Created by rayandrew on 3/28/2017.
 */
public class Utility {
  public static void clearWait (int sec) throws InterruptedException {
    TimeUnit.SECONDS.sleep(sec);
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {
      //  Handle any exceptions.
    }
  }
}
