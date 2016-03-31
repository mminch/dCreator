package main;

import java.util.ArrayList;

import classes.*;
import races.*;

public class Character {

	/**
	 * A characters Class ie Barbarian, Bard, etc
	 */
	private Role my_Class;
	/**
	 * Provides a characters Stats ie Strength, Dexterity etc
	 */
	private Stats my_Stats;
	/**
	 * List that provides a characters Proficiencies
	 */
	private Proficiency my_Prof;
	/**
	 * name associated with character, not the players name
	 */
	private String my_Name;
	/**
	 * Characters Alignment ie NG LG etc
	 */
	private String my_Align;
	/**
	 * Characters Race ie Elf Human etc
	 */
	private Race my_Race;
	/**
	 * Character level
	 */
	private int my_lvl;
	/**
	 * experience points
	 */
	private int my_XP;
	/**
	 * Feat not class related features
	 */
	private ArrayList<String> my_Feat; 
	/**
	 * Characters max Hit Points
	 */
	private int my_HP;
	/**
	 * Characters Proficiency Bonus
	 */
	private int my_ProfB;
	/**
	 * A table that keeps track of int value of xp required for lvl
	 */
	private ArrayList<Integer> my_lvlTable;
	
	public Character(int xp, String name){
		my_XP = xp;
		setName(name);
		start();
		setlvlchart();
	}
	
	private void start(){
		setStats(new Stats());
		setLvl();
		
	}
	
	public void setLvl(){
		int i = 0;
		while(my_XP > my_lvlTable.get(i)){
			i++;
		}
		setlvl(i);
	}

	/**
	 * Sets the level chart, informing when the character has advanced in level.
	 */
	private void setlvlchart() {
		// TODO Auto-generated method stub
		my_lvlTable.add(0);
		my_lvlTable.add(300);
		my_lvlTable.add(900);
		my_lvlTable.add(2700);
		my_lvlTable.add(6500);
		my_lvlTable.add(14000);
		my_lvlTable.add(23000);
		my_lvlTable.add(34000);
		my_lvlTable.add(48000);
		my_lvlTable.add(64000);
		my_lvlTable.add(85000);
		my_lvlTable.add(100000);
		my_lvlTable.add(120000);
		my_lvlTable.add(140000);
		my_lvlTable.add(165000);
		my_lvlTable.add(195000);
		my_lvlTable.add(225000);
		my_lvlTable.add(265000);
		my_lvlTable.add(305000);
		my_lvlTable.add(355000);
	}

	public int getHP(){
		return my_HP;
	}
	
	public void addFeat(String x){
		my_Feat.add(x);
	}
	
	public ArrayList<String> getFeat(){
		return my_Feat;
	}

	/**
	 * @return the my_Name
	 */
	public String getName() {
		return my_Name;
	}

	/**
	 * @param my_Name the my_Name to set
	 */
	public void setName(String my_Name) {
		this.my_Name = my_Name;
	}

	
	/**
	 * @return the my_Class
	 */
	public Role getRole() {
		return my_Class;
	}

	
	/**
	 * @param my_Class the my_Class to set
	 */
	public void setRole(Role my_Class) {
		this.my_Class = my_Class;
	}

	
	/**
	 * @return the my_Stats
	 */
	public Stats getStats() {
		return my_Stats;
	}

	
	/**
	 * @param my_Stats the my_Stats to set
	 */
	public void setStats(Stats my_Stats) {
		this.my_Stats = my_Stats;
	}

	/**
	 * @return the my_Prof
	 */
	public Proficiency getProf() {
		return my_Prof;
	}

	/**
	 * @param my_Prof the my_Prof to set
	 */
	public void setProf(Proficiency my_Prof) {
		this.my_Prof = my_Prof;
	}

	/**
	 * @return the my_Align
	 */
	public String getAlign() {
		return my_Align;
	}

	/**
	 * @param my_Align the my_Align to set
	 */
	public void setAlign(String my_Align) {
		this.my_Align = my_Align;
	}

	/**
	 * @return the my_Race
	 */
	public Race getRace() {
		return my_Race;
	}

	/**
	 * @param my_Race the my_Race to set
	 */
	public void setRace(Race my_Race) {
		this.my_Race = my_Race;
	}

	/**
	 * @return the my_lvl
	 */
	public int getlvl() {
		return my_lvl;
	}

	/**
	 * @param my_lvl the my_lvl to set
	 */
	public void setlvl(int my_lvl) {
		this.my_lvl = my_lvl;
	}

	/**
	 * @return the my_ProfB
	 */
	public int getProfB() {
		return my_ProfB;
	}

	/**
	 * @param my_ProfB the my_ProfB to set
	 */
	public void setProfB(int my_ProfB) {
		this.my_ProfB = my_ProfB;
	}
	
	
	
	
}
