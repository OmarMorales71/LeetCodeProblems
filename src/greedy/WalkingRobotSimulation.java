package greedy;

import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation {

	public static void main(String[] args) {
		Set<String> obstaclesSet = new HashSet<String>();
		
		obstaclesSet.add("45x7y");
		obstaclesSet.add("-34x6y");
		obstaclesSet.add("50x-45y");
		obstaclesSet.add("-89x-21y");
		obstaclesSet.add("-8x-8y");
		obstaclesSet.add("1x0y");
		String code="45x7y";
		String code1="-34x6y";
		String code2="50x-45y";
		String code3=Integer.toString(-89)+"x-21y";
		String code4="-8x-8y";
		String code5="1x0y";
		if(obstaclesSet.contains(code)) {
			System.out.println("verdadero");
		}
		
		if(obstaclesSet.contains(code1)) {
			System.out.println("verdadero");
		}
		
		if(obstaclesSet.contains(code2)) {
			System.out.println("verdadero");
		}
		
		if(obstaclesSet.contains(code3)) {
			System.out.println("verdadero");
		}
		
		if(obstaclesSet.contains(code4)) {
			System.out.println("verdadero");
		}
		
		if(obstaclesSet.contains(code5)) {
			System.out.println("verdadero");
		}

	}

	public int robotSim(int[] commands, int[][] obstacles) {

		int direction = 0;
		Set<String> obstaclesSet = new HashSet<String>();
		for(int[] obstacle:obstacles) {
			String xo = Integer.toString(obstacle[0]);
			String yo = Integer.toString(obstacle[1]);
			
			String code = xo+"x"+yo+"y";
			//System.out.println(code);
			obstaclesSet.add(code);
		}
		
		
		String[] compass = { "N", "E", "S", "W" };

		int[] point = { 0, 0 };
		int distance=0;
		for (int command : commands) {

			if (command < 0) {
				if (command == -1) {
					if (direction == 3) {
						direction = 0;
					} else {
						direction++;
					}
				} else if (command == -2) {
					if (direction == 0) {
						direction = 3;
					} else {
						direction--;
					}
				}
			} else {
				switch (compass[direction]) {
				case "N":
					
					for(int j=0; j<command;j++){
						point[1]++;
						
						String code = Integer.toString(point[0])+"x"+Integer.toString(point[1])+"y";
						
						if(obstaclesSet.contains(code)) {
							point[1]--;
							
							break;
						}else {
							distance = Math.max(distance, (point[0]*point[0])+(point[1]*point[1]));
						}
                    }
					
					break;
				case "E":
					
					
					for(int j=0; j<command;j++){
						point[0]++;
						
						String code = Integer.toString(point[0])+"x"+Integer.toString(point[1])+"y";
						
						if(obstaclesSet.contains(code)) {
							point[0]--;
							
							break;
						}else {
							distance = Math.max(distance, (point[0]*point[0])+(point[1]*point[1]));
						}
                    }

					break;
				case "S":
					for(int j=0; j<command;j++){
						point[1]--;
						
						String code = Integer.toString(point[0])+"x"+Integer.toString(point[1])+"y";
						
						if(obstaclesSet.contains(code)) {
							point[1]++;
							
							break;
						}else {
							distance = Math.max(distance, (point[0]*point[0])+(point[1]*point[1]));
						}
                    }

					break;
				case "W":
					for(int j=0; j<command;j++){
						point[0]--;
						
						String code = Integer.toString(point[0])+"x"+Integer.toString(point[1])+"y";
						//System.out.println(code);
						if(obstaclesSet.contains(code)) {
							point[0]++;
							
							break;
						}else {
							distance = Math.max(distance, (point[0]*point[0])+(point[1]*point[1]));
						}
                    }

					break;
				default:
					System.out.println("Aiuda");
					break;
				}
			}
		}
		
		
		return distance;

	}
}
