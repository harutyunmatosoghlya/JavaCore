package classwork.lesson9;

public class Search {
    public static void main(String[] args) {
        int[] numbs = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : numbs) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Знaчeниe найдено!");
        }
    }
}