package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue
	private Long id;
	
	private String dni;
	private String name;
	private String surnames;
	private String category;

	public Teacher() {

	}

	public Teacher(String dni, String name, String surnames, String category) {
		this.dni = dni;
		this.name = name;
		this.surnames = surnames;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getSurnames() {
		return surnames;
	}

	public String getCategory() {
		return category;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", dni=" + dni + ", name=" + name + ", surnames=" + surnames + ", category="
				+ category + "]";
	}

}
