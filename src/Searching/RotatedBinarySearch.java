package Searching;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 0, 1, 2, 3, 4};

        int pivot = find(arr);
        System.out.println(pivot);
    }

        static int find(int[] arr){

            //finding pivot:
            int start = 0;
            int end = arr.length-1;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                } else {
                    if (arr[mid] <= arr[start]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

            }
            return -1;
        }

        // apply 1st binary search till pivot and
        // apply 2nd binary search from pivot to end.
}
