package Practice;
import java.util.*;

 class Problem5 {

    static int linearSearch(String[] arr, String key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(key)) {
                System.out.println("Linear Found at index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
        }
        System.out.println("Linear Not Found, Comparisons: " + comparisons);
        return -1;
    }

    static int binarySearch(String[] arr, String key) {
        int low = 0, high = arr.length - 1, comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(key)) {
                System.out.println("Binary Found at index: " + mid);
                System.out.println("Comparisons: " + comparisons);
                return mid;
            } else if (arr[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Binary Not Found, Comparisons: " + comparisons);
        return -1;
    }

    static int countOccurrences(String[] arr, String key) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(key))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] logs = {"accA", "accB", "accB", "accC"};

        linearSearch(logs, "accB");

        Arrays.sort(logs);
        System.out.println("Sorted: " + Arrays.toString(logs));

        binarySearch(logs, "accB");

        int count = countOccurrences(logs, "accB");
        System.out.println("Count: " + count);
    }
}