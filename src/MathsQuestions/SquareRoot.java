package MathsQuestions;

public class SquareRoot {

    public static void main(String[] args){

        int number = 40;
        int p = 3;
        double ans = sqrt(number, p);
        System.out.println(ans);

    }
    static double sqrt(int number, int p){
        int start = 0;
        int end = number;
        double value = 0;
        while(start <= end){
            int mid = start + (end-start)/2;

            if (mid*mid == number){
                return mid;
            }
            else if(mid*mid > number){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        value = end;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while(value*value < number){
                value += inc;
            }
            value -= inc;
            inc = inc/10;
        }
        return value;

    }
}
