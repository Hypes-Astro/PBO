package array;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        System.out.println("Array!");
        int FirstArray[] = new int[6];
        for (int i = 0; i < FirstArray.length; i++) {
            FirstArray[i] = i + 1;
            System.out.println(FirstArray[i]);
        }
    }
}