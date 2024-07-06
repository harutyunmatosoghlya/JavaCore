package classwork.lesson2;

public class IfSimple {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x меньше у");
        x = x * 2;
        if (x == y) System.out.println("x теперь равно у");
        x = x * 2;
        if (x > y) System.out.println("x теперь больше у");
        if (x == y) System.out.println("вы не увидите этого");
    }
}