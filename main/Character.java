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
	
	public Character(int xp){
		my_XP = xp;
		start();
		setlvlchart();
	}
	
	private void start(){
		my_Stats = new Stats();
		setLvl();
	}
	
	public void setLvl(){
		int i = 0;
		while(my_XP > my_lvlTable.get(i)){
			i++;
		}
		my_lvl = i;
	}

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

	
	
	
}
