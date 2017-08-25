import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import utils.AngleUtils.*;

public class ConvertToRadianTest {

  @Before
  public void before() {
    System.out.println("Testing \"Conversian\" Function...");
  }

  @Test
  public void testConvertToRadianTest() {
    //Check that actual return value is within .000001 of expectected value
    assertEquals(1, utils.AngleUtils.convertToRadian(57.2958), .000001);
    assertEquals(0.0174533, utils.AngleUtils.convertToRadian(1), .000001);
  }

}
