package classes;

import java.util.ArrayList;

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
	
	/**
	 * @return the my_SS
	 */
	public ArrayList<Integer> getSS() {
		return my_SS;
	}
	
	/**
	 * @param my_SS the my_SS to set
	 */
	public void setSS(ArrayList<Integer> my_SS) {
		this.my_SS = my_SS;
	}

	/**
	 * @return the my_AWProf
	 */
	public ArrayList<String> getAWProf() {
		return my_AWProf;
	}

	/**
	 * @param my_AWProf the my_AWProf to set
	 */
	public void setAWProf(ArrayList<String> my_AWProf) {
		this.my_AWProf = my_AWProf;
	}

	
	
	/**
	 * @return the my_Features
	 */
	public ArrayList<String> getFeatures() {
		return my_Features;
	}

	
	/**
	 * @param my_Features the my_Features to set
	 */
	public void setFeatures(ArrayList<String> my_Features) {
		this.my_Features = my_Features;
	}

	
	/**
	 * @return the my_SpellsKnown
	 */
	public int getSpellsKnown() {
		return my_SpellsKnown;
	}

	
	/**
	 * @param my_SpellsKnown the my_SpellsKnown to set
	 */
	public void setSpellsKnown(int my_SpellsKnown) {
		this.my_SpellsKnown = my_SpellsKnown;
	}

	
	/**
	 * @return the my_Spells
	 */
	public ArrayList<ArrayList<String>> getSpells() {
		return my_Spells;
	}

	
	/**
	 * @param my_Spells the my_Spells to set
	 */
	public void setSpells(ArrayList<ArrayList<String>> my_Spells) {
		this.my_Spells = my_Spells;
	}
	
	
}
