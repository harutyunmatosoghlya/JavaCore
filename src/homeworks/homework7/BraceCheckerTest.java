package homeworks.homework7;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello ({from] (J)ava(}";
        BraceChecker bc = new BraceChecker(text);
        bc.chack();
    }
}
