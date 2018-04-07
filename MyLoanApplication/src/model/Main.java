package model;

public class Main {
	public static void main(String[] args) {
		Applicant appl = new Applicant();
		
		String firstName = "Józek";
		appl.setFirstName(firstName);
		System.out.println(appl);
		
		String surName = "Kowalski";
		appl.setSurName(surName);
		System.out.println(appl);
		
		String pesel = "12345678901";
		appl.setPesel(pesel);
		System.out.println(appl);
		
		String gender = "K";
		appl.setGender(gender);
		System.out.println(appl);
	}
}
