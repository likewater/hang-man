import org.junit.*;
import static org.junit.Assert.*;

public class HangManTest {

  @Test
  public void isHangMan_ableToReturnInputOfSimpleWord_at() {
    HangMan hangMan = new HangMan();
    assertEquals("at", hangMan.hangManWord("at"));
  }

}
