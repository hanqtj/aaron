package com.aaron.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="threed")
public class ThreeD {
	@Id	
	private String numberDate;
	private String numberBai;
	private String numberShi;
	private String numberGe;
	public String getNumberDate() {
		return numberDate;
	}
	public void setNumberDate(String numberDate) {
		this.numberDate = numberDate;
	}
	public String getNumberBai() {
		return numberBai;
	}
	public void setNumberBai(String numberBai) {
		this.numberBai = numberBai;
	}
	public String getNumberShi() {
		return numberShi;
	}
	public void setNumberShi(String numberShi) {
		this.numberShi = numberShi;
	}
	public String getNumberGe() {
		return numberGe;
	}
	public void setNumberGe(String numberGe) {
		this.numberGe = numberGe;
	}
	public ThreeD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ThreeD(String numberDate, String numberBai, String numberShi, String numberGe) {
		super();
		this.numberDate = numberDate;
		this.numberBai = numberBai;
		this.numberShi = numberShi;
		this.numberGe = numberGe;
	}
	
	
	
}
