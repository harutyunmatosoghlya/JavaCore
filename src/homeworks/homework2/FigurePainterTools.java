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

    void firstFigure() {
        firstFigure(5, '*');
    }

    void firstFigure(int n) {
        firstFigure(n, '*');
    }

    void firstFigure(char c) {
        firstFigure(5, c);
    }

    void twiceFigure(int n, char c) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void twiceFigure() {
        twiceFigure(5, '*');
    }

    void twiceFigure(int n) {
        twiceFigure(n, '*');
    }

    void twiceFigure(char c) {
        twiceFigure(5, c);
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

    void thirdFigure() {
        thirdFigure(5, '*');
    }

    void thirdFigure(int n) {
        thirdFigure(n, '*');
    }

    void thirdFigure(char c) {
        thirdFigure(5, c);
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

    void fourthFigure() {
        fourthFigure(5, '*');
    }

    void fourthFigure(int n) {
        fourthFigure(n, '*');
    }

    void fourthFigure(char c) {
        fourthFigure(5, c);
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

    void fifthFigure() {
        fifthFigure(5, '*');
    }


    void fifthFigure(int n) {
        fifthFigure(n, '*');
    }

    void fifthFigure(char c) {
        fifthFigure(5, c);
    }
}