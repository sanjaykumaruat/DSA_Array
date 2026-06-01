package two.array;

public class Day6_FirstMissingElementSimple {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7};

        int expected = arr[0]; // start from first element

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != expected) {
                System.out.println("First missing element is: " + expected);
                return;
            }
            expected++;
        }

        System.out.println("No missing element found.");
    }
}
