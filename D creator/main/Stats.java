package main;

import java.util.ArrayList;
import java.util.Random;

public class Stats {
	
	/**
	 * List of Stats ie Strength, Dexterity etc
	 */
	private ArrayList<Integer> my_Stats;
	
	/**
	 * holds the die rolls
	 */
	private int[] my_Rolls;
	
	/**
	 * a 6 sided die for rolling stats
	 * will be done as 0-4 +2 as we do not allow 1  
	 */
	private Random my_Die;
	
	/**
	 * constructor
	 */
	public Stats(){
		roll();
	}
	
	/**
	 * rolls a d6 18 times. These rolls will be assigned to Attributes.
	 */
	private void roll(){
		my_Die = new Random();
		my_Rolls = new int[5];
		for(int i = 0; i < 18; i++){
			int x = my_Die.nextInt(4);
			my_Rolls[x]++;
		}
		
	}

	/**
	 * 
	 * @return returns my_Rolls
	 */
	public int[] getRolls(){
		return my_Rolls;
	}
	
	/**
	 * Sets the Stats ie 0, 18 will be 18 to Strength
	 * @param x Which stat is getting the value in y
	 * @param y The value being assigned to x
	 */
	public void setStats(int x, Integer y){
		my_Stats.add(x, y);		
	}
	
	/**
	 * 
	 * @return returns my_Stats
	 */
	public ArrayList<Integer> getStats(){
		return my_Stats;
	}
	
	

}
