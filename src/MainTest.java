import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {


@Test
 void testLineCount() {
        var logik = new logik();
        int expected = 0;
        expected++;
        logik.lineCount();
        int actual = logik.lineCount;
    System.out.println("expected "+expected);
    System.out.println("actual "+actual);
        assertEquals( expected, actual);
        }

@Test
 void Test_class_() {
        var logik = new logik();
        int Start_CharacterCount = 0;
        String test = "test.";
        int expected = Start_CharacterCount + test.length();

        logik.RadCount(test);
        int actual = logik.characterCount;
    System.out.println("expected "+expected);

    System.out.println("actual "+actual);
        assertEquals( expected, actual);
        }
        @Test
         void Test_tom_Count() {
                var Logic = new logik();
                int Start_CharacterCount = 0;

                String test = "";
                int expected = Start_CharacterCount + test.length();
                Logic.RadCount(test);
                int actual = Logic.characterCount;
               System.out.println("expected "+expected);
               System.out.println("actual "+actual);
                assertEquals( expected, actual);
        }
        @Test
         void Test_print() {
                System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
                logik Logic = new logik();
                int expected = Logic.lineCount;
                System.out.println("Antal rader: " + Logic.lineCount);
                System.out.println("Antal tecken: " + Logic.characterCount);
                assertEquals( expected, 0);

        }

    @Disabled
    public void testInput() {
        var scanner = new Main();

        String input = "Stop";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals("", "Statistik\\h");
    }

       @Disabled
       void main() {
              System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");
              var Main = new Main();

              assertEquals( 0, 0);

       }

}

