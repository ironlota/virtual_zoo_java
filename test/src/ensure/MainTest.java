package ensure;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Main Testing for wrapping another testing unit
 * Created by rayandrew on 3/29/2017.
 */
class MainTest {
  static void Testing () {
    Result result = JUnitCore.runClasses(TestSuite.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
}
