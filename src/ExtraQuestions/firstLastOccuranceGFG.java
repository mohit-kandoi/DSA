package ExtraQuestions;

import java.util.ArrayList;

public class firstLastOccuranceGFG {
    public static void main(String[] args) {
        int[] arr = {4};
        int target = 3;
        int n = arr.length;
        System.out.println(occurance(arr, n, target));

    }
    static ArrayList<Integer> occurance(int[] arr, int n, int x){
        int s = 0;
        int e = n-1;

        ArrayList<Integer> list = new ArrayList<>();
        while(s <= e){
            int mid = s + (e-s)/2;
            if(x < arr[mid]){
                e = mid-1;
            }
            else if(x > arr[mid]){
                s = mid+1;
            }
            else{
                if(mid == 0 && arr[mid] == x){
                    while(mid<= n-1 && arr[mid] == x){
                        mid++;
                    }
                    list.add(0);
                    list.add(mid-1);
                    return list;
                }
                if(mid > 0 && arr[mid] == x){
                    if(arr[mid] > arr[mid-1]){
                        list.add(mid);
                        while(mid<= n-1 && arr[mid] == x){
                            mid++;
                        }
                        list.add(mid-1);
                        return list;
                    }
                    else{
                        e = mid-1;
                    }
                }
            }
        }
        list.add(-1);
        return list;
    }
}
