package BitwiseAndNumberSystem;

// In an array each number appears thrice, five, seven or odd times but only 1 number appears once. Find that number.

public class UniqueElementInArray2 {


    public static void main(String[] args) {
        // when same number appears three times then all the bits will appears three times so if we take % of these
        // bits with 3 then it becomes zero.
        // so all numbers which appears three times get zero and only single number get remained.

        int[] arr = {2,2,2,7,4,4,4,5,5,5};
        int ans = Unique(arr);
        System.out.println(ans);

    }
    static int Unique(int[] arr){

        int result = 0;
        for (int i = 0; i < 32; i++) {

            int sum = 0;
            int x = (1 << i);
            for(int j = 0; j < arr.length; j++){

                if((arr[j] & x) == 1){
                    sum++;
                }
            }
            if(sum % 3 == 1){
                result = result | x;
            }
        }
        return result;

    }

}

