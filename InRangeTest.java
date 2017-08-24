import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import utils.AngleUtils.*;

public class InRangeTest {

  @Before
  public void before() {
    System.out.println("Testing \"In Range\" Function...");
  }

  @Test
  public void testInRangeTest() {
    assertEquals(false, utils.AngleUtils.isInRange(-1));
    assertEquals(true, utils.AngleUtils.isInRange(0));
    assertEquals(true, utils.AngleUtils.isInRange(359));
    assertEquals(false, utils.AngleUtils.isInRange(360));
  }

}
