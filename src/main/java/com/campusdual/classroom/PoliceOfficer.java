package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}
	@Override
	public void getDetails() {
		System.out.println("Mi nombre es: " + this.name + " y mi apellido es: " + this.surname + " y soy policía");
	}
}
