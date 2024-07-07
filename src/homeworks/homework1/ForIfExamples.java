package homeworks.homework1;

public class ForIfExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        for (int i = 50; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int even = 0;
        for (int i = 2; i < 100; i = i + 2) {
            even++;
        }
        System.out.print(even);
    }
}