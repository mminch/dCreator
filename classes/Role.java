package classes;

import java.util.ArrayList;

import main.Proficiency;

public class Role {

	private ArrayList<String> my_Features;
	private int my_HD;
	private ArrayList<Boolean> my_ST;
	private ArrayList<Boolean> my_Pro;
	private ArrayList<String> my_AWProf;
	private ArrayList<Integer> my_SS;
	private int my_SpellsKnown;
	private ArrayList<ArrayList<String>> my_Spells;
	
	public Role(){
		
	}
	
	public int getHD(){
		return my_HD;
	}
	
	public ArrayList<Boolean> getST(){
		return my_ST;
	}
	
	public ArrayList<Boolean> getPro(){
		return my_Pro;
	}
	
	
}
