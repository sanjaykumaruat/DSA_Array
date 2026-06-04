package two.array;

public class Day5_FirstCommonElementSimple {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 9};
        int[] b = {2, 4, 5, 8, 9};

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println("First common element is: " + a[i]);
                return;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("No common element found.");
    }
}
