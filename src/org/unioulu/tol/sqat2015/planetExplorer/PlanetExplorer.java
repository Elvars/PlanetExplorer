package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.ArrayList;


// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:
public class PlanetExplorer {
	
	public int[] array;
	public ArrayList<int[]> allArrays = new ArrayList<int[]>();
	
	public String[] facingDirections = {"N", "W", "E", "S"};
	public int facingDir;
	
	public boolean hasLanded = false;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		for(int i = 0; i<y; i++) 
		{
			array = new int[x];
			allArrays.add(array);
		}
		
		System.out.println(allArrays.size());
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		switch(command)
		{
		case "":
			moveAround("n", null, 0, 0);
			hasLanded = true;
			return "The explorer has landed";
		
		case "l":
			moveAround("l", null, 0, 0);
			
		}
		
		return null;
		
		
	}
	
	public void moveAround(String facingDir, String moveDir, int x, int y)
	{
		System.out.println("Facing direction = " + facingDir + ", Position = " + x + " ," + y );
	}
}
