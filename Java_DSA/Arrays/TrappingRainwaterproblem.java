
public class TrappingRainwaterproblem {
    //o(n)  where n is                      

    public static int trappedwater(int num[]) {
        int trapped_water;
        int left_max_bd[] = new int[num.length];
        int right_max_bd[] = new int[num.length];
        int p1 = 0, p2 = 0, width = 1;
        int water_level;
        int result = 0;

        left_max_bd[0] = num[0];
        right_max_bd[num.length - 1] = num[num.length - 1];

        // left max auxiliary array calculate
        for (int i = 1; i <= num.length - 1; i++) { 

            p1 = left_max_bd[i - 1];
            p2 = num[i];
            left_max_bd[i] = Math.max(p1, p2);
           //left_max_bd[i]=MAth.max(left_max_bd[i-1],num[i]);
        }

     
        // right max auxiliary array calculate
        for (int i = num.length - 2; i >= 0; i--) {

            p1 = right_max_bd[i +1];
            p2 = num[i];
            right_max_bd[i] = Math.max(p1, p2);

        }

        // trapped rainwater calculation
        for (int i = 0; i <= num.length - 1; i++) {

            water_level = Math.min(left_max_bd[i], right_max_bd[i]);

            trapped_water = (water_level - num[i]) * width;

            result = result + trapped_water;

        }

        return result;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int output = trappedwater(height);
        System.out.println("the trapped rainwater is "+output);
    }

}
