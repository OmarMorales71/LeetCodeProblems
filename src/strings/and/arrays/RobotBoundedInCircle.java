package strings.and.arrays;

public class RobotBoundedInCircle {
    public static void main(String[] args) {

    }

    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentDirection = 0;
        ;
        int[] point = new int[]{0, 0};

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < instructions.length(); i++) {
                if (instructions.charAt(i) == 'G') {
                    move(directions[currentDirection], point);
                } else {
                    if (instructions.charAt(i) == 'L') {
                        currentDirection--;
                        if (currentDirection < 0) {
                            currentDirection = 3;
                        }
                    } else if (instructions.charAt(i) == 'R') {
                        currentDirection++;
                        if (currentDirection > 3) {
                            currentDirection = 0;
                        }
                    }


                }
            }

            if(point[0]==0 && point[1]==0 && currentDirection==0)
                return true;
        }


        return false;

    }

    public void move(int[] direction, int[] point) {
        point[0]+=direction[0];
        point[1]+=direction[1];
    }
}
