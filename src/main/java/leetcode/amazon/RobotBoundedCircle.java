package leetcode.amazon;

//https://leetcode.com/problems/robot-bounded-in-circle/
public final class RobotBoundedCircle {

    public static void main(String[] args) {
        System.out.println(new RobotBoundedCircle().isRobotBounded("GG"));
    }

    public boolean isRobotBounded(final String instructions) {
        int x = 0;
        int y = 0;
        String direction = "N";
        for (int i = 0; i < instructions.length(); i++) {
            final char c = instructions.charAt(i);
            if (c == 'G') {
                switch (direction) {
                    case "W":
                        x--;
                        break;
                    case "S":
                        y--;
                        break;
                    case "E":
                        x++;
                        break;
                    case "N":
                        y++;
                        break;
                }
            } else if (c == 'L') {
                switch (direction) {
                    case "W":
                        direction = "S";
                        break;
                    case "S":
                        direction = "E";
                        break;
                    case "E":
                        direction = "N";
                        break;
                    case "N":
                        direction = "W";
                        break;
                }
            } else {
                switch (direction) {
                    case "W":
                        direction = "N";
                        break;
                    case "S":
                        direction = "W";
                        break;
                    case "E":
                        direction = "S";
                        break;
                    case "N":
                        direction = "E";
                        break;
                }
            }
        }
        return x == 0 && y == 0 || !"N".equals(direction);
    }
}
