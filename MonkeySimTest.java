import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;

// A test for the MonkeySim class

public class MonkeySimTest {

  // Tests MonkeySim's stringifyResultsRefactored method to ensure that it
  // outputs an expected string as its non-refactored counterpart

  @Test
  public void testStringifyResultsComparison() {
    MonkeySim sim = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(sim.stringifyResultsRefactored(2,m1,m2),sim.stringifyResults(2,m1,m2));
  }

/////////////////////////////////////////////////////////////////////////

  // Tests MonkeySim's stringifyResultsRefactored method to ensure that it
  // outputs the expected string result

  @Test
  public void testStringifyResultsRefactored() {
    MonkeySim sim = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(sim.stringifyResultsRefactored(1,m1,m2),"//Round 1: Threw banana from Monkey (#5 / ID 223497) to Monkey (#6 / ID 223498)");
  }

  /////////////////////////////////////////////////////////////////////////

    // Tests MonkeySim's stringifyResultsRefactored method to ensure that it
    // outputs the expected result when id's are explicitly generated

    @Test
    public void testStringifyResultsInvalid() {
      MonkeySim sim = new MonkeySim();
      Monkey m1 = new Monkey();
      m1.generateId(5);
      Monkey m2 = new Monkey();
      m1.generateId(6);
      assertEquals(sim.stringifyResultsRefactored(1,m1,m2),"//Round 1: Threw banana from Monkey (#9 / ID 223501) to Monkey (#10 / ID 223502)");
    }

/////////////////////////////////////////////////////////////////////////

  // Tests MonkeySim's unaltered generateId method to ensure that it
  // outputs null when simulation method does not occur

  @Test
  public void testGetFirstMonkeyRefactored() {
    List<Monkey> ml = new LinkedList<Monkey>();
    MonkeySim sim = new MonkeySim();
    Monkey m1 = sim.getFirstMonkey(ml);
    assertNull(m1);
  }

/////////////////////////////////////////////////////////////////////////

  // Tests MonkeySim's refactored generateId method to ensure that it
  // also outputs null when simulation method does not occur

  // @Test
  // public void testGetFirstMonkeyRefactored() {
  //   List<Monkey> ml = new LinkedList<Monkey>();
  //   MonkeySim sim = new MonkeySim();
  //   Monkey m1 = sim.getFirstMonkey(ml);
  //   assertNull(m1);
  // }
}
