
public class shortestPath {

    public static float calculateShortestPath(String str) {

        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {

            char dir = str.charAt(i);
            
            //WEST
            if (dir == 'W') {
                x--;
            } 
            //EAST
            else if (dir == 'E') {
                x++;
            }
            //SOUTH
            else if (dir == 'S') {
                y--;
            }
            //NORTH
            else if (dir == 'N') {
                y++;
            }

        }

        float result = x * x + y * y;
        result = (float) Math.sqrt(result);
        return result;

    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";

        System.out.println(calculateShortestPath(path));

    }

}
