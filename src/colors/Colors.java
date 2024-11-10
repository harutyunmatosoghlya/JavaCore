package colors;

public interface Colors {
    String RESET = "\u001B[0m";
    //    Основные цвета:
    String BLACK = "\u001B[30m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";
    //    Яркие (Bold):
    String GRAY = "\u001B[90m";
    String BRIGHT_RED = "\u001B[91m";
    String BRIGHT_GREEN = "\u001B[92m";
    String BRIGHT_YELLOW = "\u001B[93m";
    String BRIGHT_BLUE = "\u001B[94m";
    String MAGENTA = "\u001B[95m";
    String BRIGHT_CYAN = "\u001B[96m";
    String BRIGHT_WHITE = "\u001B[97m";
    //    Фоновые цвета (Background Colors):
    String BACKGROUND_BLACK = "\u001B[40m";
    String BACKGROUND_RED = "\u001B[41m";
    String BACKGROUND_GREEN = "\u001B[42m";
    String BACKGROUND_YELLOW = "\u001B[43m";
    String BACKGROUND_BLUE = "\u001B[44m";
    String BACKGROUND_PURPLE = "\u001B[45m";
    String BACKGROUND_CYAN = "\u001B[46m";
    String BACKGROUND_WHITE = "\u001B[47m";
    //    Яркие фоновые цвета (Bold Background Colors):
    String BACKGROUND_GRAY = "\u001B[100m";
    String BRIGHT_BACKGROUND_RED = "\u001B[101m";
    String BRIGHT_BACKGROUND_GREEN = "\u001B[102m";
    String BRIGHT_BACKGROUND_YELLOW = "\u001B[103m";
    String BRIGHT_BACKGROUND_BLUE = "\u001B[104m";
    String BACKGROUND_MAGENTA = "\u001B[105m";
    String BRIGHT_BACKGROUND_CYAN = "\u001B[106m";
    String BRIGHT_BACKGROUND_WHITE = "\u001B[107m";
}