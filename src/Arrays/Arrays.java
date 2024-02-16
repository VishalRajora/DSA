package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {17, 3, 23, 44, 55, 66, 77, 66, 88};
        long[] arr1 = {17, 3, 23, 44, 55, 66, 77, 66, 88};
        System.out.println("Max is---- " + max(arr));
        System.out.println("Min is---- " + min(arr));
        System.out.println("Min and max is ---- " + minAndMax(arr).toString());
        System.out.println("Min and max is via array size  ---- " + minAndMaxWithIndex(arr1, arr.length));
        System.out.println("Max in Range ---- " + maxInRange(arr, 0, 2));
        // System.out.println("Revers Array ---- " + java.util.Arrays.toString(reverseArray(arr)));
        System.out.println("Revers Array via while ---- " + java.util.Arrays.toString(reverseArray1(arr)));

    }

    // Without index
    private static Pair minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        return new Pair(min, max);
    }

    private static Pair minAndMaxWithIndex(long[] arr, long arraySize) {
        long min, max;
        min = max = arr[0];

        for (int i = 0; i < arraySize; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new Pair(min, max);
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = start; i < end; i++) {
            for (int j = end; j >= start; j--) {
                int temp = arr[start];
                arr[start] = arr[j];
                arr[j] = temp;
                start++;
                end--;
                // System.out.println("arr =" + java.util.Arrays.toString(arr) );
            }
        }
        return arr;
    }

    private static int[] reverseArray1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        //can be also handl
        /*
        *  for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        * */

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }


    private static int maxInRange(int[] arr, int startRange, int endRange) {
        int max = arr[0];
        //can be also handle
        for (int i = startRange; i <= endRange; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
