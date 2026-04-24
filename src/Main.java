package Practice;
import java.util.*;

 class Problem6 {

    static int linearSearch(int[] arr, int target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println("Linear Found at index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
        }
        System.out.println("Linear Not Found, Comparisons: " + comparisons);
        return -1;
    }

    static void binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1, comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            } else if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
        System.out.println("Comparisons: " + comparisons);
    }

    public static void main(String[] args) {

        int[] risks = {10, 25, 50, 100};

        linearSearch(risks, 30);

        binarySearch(risks, 30);
    }
}