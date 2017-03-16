import org.junit.*;
import static org.junit.Assert.*;

public class HangManTest {

  @Test
  public void is_first_test() {
    HangMan hangMan = new HangMan();
    assertEquals("at", hangMan.hangManWord("at"));
  }

}
