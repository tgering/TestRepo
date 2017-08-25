import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner {
   public static void main(String[] args) {

     //Execute test 1
     Result result1 = JUnitCore.runClasses(InRangeTest.class);

     for (Failure failure : result1.getFailures()) {
        System.out.println(failure.toString());
     }

     System.out.println(result1.wasSuccessful());


     //Execute test 2
     Result result2 = JUnitCore.runClasses(ConvertToRadianTest.class);

     for (Failure failure : result2.getFailures()) {
        System.out.println(failure.toString());
     }

     System.out.println(result2.wasSuccessful());


     //Execute test 3
     Result result3 = JUnitCore.runClasses(ModulusTest.class);

     for (Failure failure : result3.getFailures()) {
        System.out.println(failure.toString());
     }

     System.out.println(result3.wasSuccessful());
  }
}
