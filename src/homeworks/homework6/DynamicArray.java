package homeworks.homework6;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size >= array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] longerArray = new int[array.length + 10];
        System.arraycopy(array, 0, longerArray, 0, array.length);
        array = longerArray;
    }

    public int getByIndex(int index) {
        if (index < size) {
            return array[index];
        } else return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index < size) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        } else {
            System.out.println("такого индекса нет");
        }

    }

    public void set(int index, int value) {
        if (index < size) {
            array[index] = value;
        } else {
            System.out.println("такого индекса нет");
        }
    }

    public void add(int index, int value) {
        if (index < size) {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        } else {
            System.out.println("такого индекса нет");
        }
    }

    public boolean exists(int value) {
        boolean right = false;
        for (int x : array) {
            if (x == value) {
                right = true;
                break;
            }
        }
        return right;
    }
    public int getIndexByValue(int value) {
        int right = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                right = i;
                break;
            }
        }
        return right;
    }
}
