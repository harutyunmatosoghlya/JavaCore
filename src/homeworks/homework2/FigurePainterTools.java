package homeworks.homework2;

public class FigurePainterTools {
    void firstFigure(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void firstFigure(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void firstFigure(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void firstFigure() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void twiseFigure() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void twiseFigure(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void twiseFigure(int n, char c) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void twiseFigure(char c) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void thirdFigure() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void thirdFigure(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void thirdFigure(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void thirdFigure(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void fourthFigure() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void fourthFigure(int n, char c) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void fourthFigure(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void fourthFigure(char c) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void fifthFigure() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void fifthFigure(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void fifthFigure(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void fifthFigure(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
