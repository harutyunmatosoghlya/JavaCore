package homeworks.homework1;

public class ForIfExamplesTools {
    void numbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    void numbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    int sum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    void renumbers() {
        for (int i = 50; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    void renumbers(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    void even() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void even(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void odd() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    void odd(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    int evenCount() {
        int even = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int evenCount(int n) {
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int oddCount() {
        int odd = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        return odd;
    }

    int oddCouny(int n) {
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        return odd;
    }
}
