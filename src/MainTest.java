import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {


@Test
 void testLineCount() {
        logik logik = new logik();
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
        logik logik = new logik();
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
                logik Logic = new logik();
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
    void bigCount() {
        logik Logic = new logik();
        int Start_CharacterCount = 0;

        String test = "stop,Lorem ipsum dolor sit amet " +
                "consectetur adipisicing elit. Officia dignissimos " +
                "veritatis repellendus perspiciatis est incidunt quam aut ea " +
                "dolorum mollitia officiis tenetur molestiae iure tempora," +
                " voluptate doloribus voluptas reiciendis doloremque.";
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



}

