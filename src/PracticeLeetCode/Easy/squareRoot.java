package PracticeLeetCode.Easy;

public class squareRoot {
    public static void main(String[] args) {

        int x = 2147395599;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x){

        int s = 0;
        int e = x;

        while(s <= e){
            int mid = s + (e-s)/2;
            if((long)mid*mid > x){
                e = mid-1;
            }
            else if(mid*mid == x){
                return mid;
            }
            else{
                s = mid+1;
            }
        }
        return e;


    }
}
