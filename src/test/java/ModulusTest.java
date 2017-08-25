import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import utils.AngleUtils.*;


public class ModulusTest {

  //execute before test
  @Before
  public void before() {
    System.out.println("Testing \"Modulus\" Function...");
  }

  @Test
  public void testModulusTest() {
    double testNum1 = utils.AngleUtils.modulus(100000);
    double testNum2 = utils.AngleUtils.modulus(-50);
    double testNum3 = utils.AngleUtils.modulus(77.36);

    assertTrue(0 <= testNum1 && testNum1 < 360);
    assertTrue(0 <= testNum2 && testNum2 < 360);
    assertTrue(0 <= testNum3 && testNum3 < 360);
  }

}
