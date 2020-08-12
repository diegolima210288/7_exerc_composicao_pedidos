package entities;

import java.util.Date;

public class Client {
	
	//atributos da classe
	private String name;
	private String email;
	private Date birthDate;
	
	//metodo padrão
	public Client() {
		
	}

	//metodo com os atributos
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	//metodos GETTERS e SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return name + " (" + birthDate + ") - " + email;
	}

}
