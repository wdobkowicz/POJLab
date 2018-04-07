package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Applicant {
	private String firstName;
	private String surName;
	private String pesel;
	private String nip;
	private String bankAccountNumber;
	private String gender;
	private Date dateOfBirth;
	
	public boolean checkName(String name){
		if(name == null){
			return false;
		}else if(name.length() < 2){
			return false;
		}else if(! validatePattern(name,"^[a-zA-ZąćęńółźżĄĆĘŃÓŁŹŻ]*$")){
			return false;
		}else{
			System.out.println("Name "+name+" is ok!");
			return true;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName){
		if (checkName(firstName)){
			this.firstName = firstName;
		}else{
			System.out.println("First Name Error:" + firstName);
		}
	}

	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName){
		if (checkName(surName)){
			this.surName = surName;
		}else{
			System.out.println("SurName Error:" + firstName);
		}
	}
	
	public void setPesel(String pesel) {
		if(new PeselValidator(pesel).isValid()){
			this.pesel = pesel;
			System.out.println("PŁEĆ Z PESELA: "+new PeselValidator(pesel).getSex());
		}else{
			System.out.println("PESEL Error:" + pesel);
		}
	}
	
	
	
	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		boolean setDone = false;
		if(this.pesel != null) {
			PeselValidator pv = new PeselValidator(this.pesel);
			if(pv.isValid())
				if(!pv.getSex().equals("E") && pv.getSex().equals(gender)) {
					this.gender = pv.getSex();
					setDone = true;
				}
		}
		if (!setDone)
			System.out.println("Gender Error:" + gender);	
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", surName=" + surName + ", pesel=" + pesel + ", nip=" + nip
				+ ", bankAccountNumber=" + bankAccountNumber + ", gender=" + gender + ","
				+ " dateOfBirth=" 
				+  (dateOfBirth == null ? "null" : new SimpleDateFormat("yyyy-M-dd").format(dateOfBirth))
				+ "]";
	}
	
	/*
	 * See more on regular expressions on:
	 * http://tutorials.jenkov.com/java-regex/index.html
	 */
	static private boolean validatePattern(String valData, String patternString) {

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(valData);
		if(!matcher.matches())
			return false;
		else
			return true;
	}
}
