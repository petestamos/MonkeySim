import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

// A test for the Monkey class

public class MonkeyTest {

  // Tests Monkey's generateIdRefactored method to ensure that it
  // outputs an expected id number

  @Test
  public void testGenerateIdExpectedValue() {
    Monkey monkey = new Monkey();
    int id = monkey.generateIdRefactored(100);
    assertEquals(id,223592);
  }

/////////////////////////////////////////////////////////////////////

  // Tests Monkey's generateIdRefactored method to ensure that it
  // maintains consistency with the non-refactored version

  @Test
  public void testGenerateIdToUnrefactoredMethod() {
    Monkey monkey1 = new Monkey();
    Monkey monkey2 = new Monkey();
    int id1 = monkey1.generateId(100);
    int id2 = monkey2.generateIdRefactored(100);
    assertEquals(id1,id2);
  }


/////////////////////////////////////////////////////////////////////

  // Tests Monkey object to ensure that two generic objects
  // each are still provided with unique numbers when initialized

  @Test
  public void testGeneratedMonkeys() {
    Monkey monkey1 = new Monkey();
    Monkey monkey2 = new Monkey();
    int id1 = monkey1.getMonkeyNum();
    int id2 = monkey2.getMonkeyNum();
    assertNotEquals(id1,id2);
  }
}
