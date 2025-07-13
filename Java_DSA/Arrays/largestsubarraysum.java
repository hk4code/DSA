

public class largestsubarraysum {

    public static int Brute_force_max_subarray_sum(int num[]) {

        int largest = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i <= num.length - 1; i++) {

            for (int j = i; j <= num.length - 1; j++) {
                temp = 0;
                for (int k = i; k <= j; k++) {
                    temp = temp + num[k];
                }
                System.out.println(temp);
                if (temp > largest) {
                    largest = temp;
                }
            }

        }

        return largest;
    }

    public static int Prefix_Sum_max_subarray_sum(int num[]) {

        int largest = Integer.MIN_VALUE;
        int temp = 0;
        int test = 0;
        int prefix[] = new int[num.length];

        // prefix array

        prefix[0] = num[0];
        for (int i = 1; i <= num.length - 1; i++) {
            prefix[i] = prefix[i - 1] + num[i];

        }

        for (int i = 0; i <= num.length - 1; i++) {

            for (int j = i; j <= num.length - 1; j++) {
                temp = 0;

                temp = i == test ? prefix[j] : prefix[j] - prefix[i - 1];

                System.out.println(temp);
                if (temp > largest) {
                    largest = temp;
                }
            }

        }

        return largest;
    }


    public static int Kadane_algorithm_max_subarray_sum(int num[]){
                int maxsum = Integer.MIN_VALUE;
                int currsum =0;

                for(int i=0;i<=num.length-1;i++){
                    currsum=currsum +num[i];
                    if(currsum<0){
                        currsum=0;
                    }
                    maxsum = Math.max(currsum,maxsum);
                }


            return maxsum;
    }

    public static void main(String[] args) {

        int nums[] = { -2, -5, 6, 8, -10, -7, 15, 7, 5 };

        int result_1 = Brute_force_max_subarray_sum(nums);
        int result_2 = Prefix_Sum_max_subarray_sum(nums);
        int result_3 = Kadane_algorithm_max_subarray_sum(nums);

       System.out.println("the largest sum of a sub array is " + result_1);
       System.out.println("the largest sum of a sub array is " + result_2);
        System.out.println("the largest sum of a sub array is " + result_3);

    }

}
