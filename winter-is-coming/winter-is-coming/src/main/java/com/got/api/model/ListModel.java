package com.got.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
@Table(name = "battle_info")
public class ListModel {
	
	@Id
	@Column(name="battle_number	")
	private String battle;
	private String location;
	private String region;
	private String name;
	private String year;
	private String attacker_king;
	private String defender_king;
	private String attacker_1;
	private String attacker_2;
	private String attacker_3;
	private String attacker_4;
	private String defender_1;
	private String defender_2;
	private String defender_3;
	private String defender_4;
	private String attacker_outcome;
	private String battle_type;
	private String major_death;
	private String major_capture;
	private String attacker_size;
	private String defender_size;
	private String attacker_commander;
	private String defender_commander;
	private String summer;
	private String note;
	
	
	public ListModel( String location, String region) {
		this.location = location;
		this.region = region;
	}
	
	public ListModel( String name) {
		this.name = name;
	
	}
	
	
	public ListModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListModel(String location, String region, String battle, String name, String year,
			String attacker_king, String defender_king, String attacker_1, String attacker_2, String attacker_3,
			String attacker_4, String defender_1, String defender_2, String defender_3, String defender_4,
			String attacker_outcome, String battle_type, String major_death, String major_capture, String attacker_size,
			String defender_size, String attacker_commander, String defender_commander, String summer, String note) {
		super();
		this.location = location;
		this.region = region;
		this.battle = battle;
		this.name = name;
		this.year = year;
		this.attacker_king = attacker_king;
		this.defender_king = defender_king;
		this.attacker_1 = attacker_1;
		this.attacker_2 = attacker_2;
		this.attacker_3 = attacker_3;
		this.attacker_4 = attacker_4;
		this.defender_1 = defender_1;
		this.defender_2 = defender_2;
		this.defender_3 = defender_3;
		this.defender_4 = defender_4;
		this.attacker_outcome = attacker_outcome;
		this.battle_type = battle_type;
		this.major_death = major_death;
		this.major_capture = major_capture;
		this.attacker_size = attacker_size;
		this.defender_size = defender_size;
		this.attacker_commander = attacker_commander;
		this.defender_commander = defender_commander;
		this.summer = summer;
		this.note = note;
	}
	public String getBattle() {
		return battle;
	}
	public void setBattle(String battle) {
		this.battle = battle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAttacker_king() {
		return attacker_king;
	}
	public void setAttacker_king(String attacker_king) {
		this.attacker_king = attacker_king;
	}
	public String getDefender_king() {
		return defender_king;
	}
	public void setDefender_king(String defender_king) {
		this.defender_king = defender_king;
	}
	public String getAttacker_1() {
		return attacker_1;
	}
	public void setAttacker(String attacker_1) {
		this.attacker_1 = attacker_1;
	}
	public String getAttacker_2() {
		return attacker_2;
	}
	public void setAttacker_2(String attacker_2) {
		this.attacker_2 = attacker_2;
	}
	public String getAttacker_3() {
		return attacker_3;
	}
	public void setAttacker_3(String attacker_3) {
		this.attacker_3 = attacker_3;
	}
	public String getAttacker_4() {
		return attacker_4;
	}
	public void setAttacker_4(String attacker_4) {
		this.attacker_4 = attacker_4;
	}
	public String getDefender_1() {
		return defender_1;
	}
	public void setDefender_1(String defender_1) {
		this.defender_1 = defender_1;
	}
	public String getDefender_2() {
		return defender_2;
	}
	public void setDefender_2(String defender_2) {
		this.defender_2 = defender_2;
	}
	public String getDefender_3() {
		return defender_3;
	}
	public void setDefender_3(String defender_3) {
		this.defender_3 = defender_3;
	}
	public String getDefender_4() {
		return defender_4;
	}
	public void setDefender_4(String defender_4) {
		this.defender_4 = defender_4;
	}
	public String getAttacker_outcome() {
		return attacker_outcome;
	}
	public void setAttacker_outcome(String attacker_outcome) {
		this.attacker_outcome = attacker_outcome;
	}
	public String getBattle_type() {
		return battle_type;
	}
	public void setBattle_type(String battle_type) {
		this.battle_type = battle_type;
	}
	public String getMajor_death() {
		return major_death;
	}
	public void setMajor_death(String major_death) {
		this.major_death = major_death;
	}
	public String getMajor_capture() {
		return major_capture;
	}
	public void setMajor_capture(String major_capture) {
		this.major_capture = major_capture;
	}
	public String getAttacker_size() {
		return attacker_size;
	}
	public void setAttacker_size(String attacker_size) {
		this.attacker_size = attacker_size;
	}
	public String getDefender_size() {
		return defender_size;
	}
	public void setDefender_size(String defender_size) {
		this.defender_size = defender_size;
	}
	public String getAttacker_commander() {
		return attacker_commander;
	}
	public void setAttacker_commander(String attacker_commander) {
		this.attacker_commander = attacker_commander;
	}
	public String getDefender_commander() {
		return defender_commander;
	}
	public void setDefender_commander(String defender_commander) {
		this.defender_commander = defender_commander;
	}
	public String getSummer() {
		return summer;
	}
	public void setSummer(String summer) {
		this.summer = summer;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "ListModel [ location=" + location + ", region=" + region + "]";
	}
	
	
	
	
}
