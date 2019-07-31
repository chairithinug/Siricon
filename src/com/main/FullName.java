package com.main;

/**
 * @author Anapat Chairithinugull
 *
 */
public class FullName {
	public static enum Title {
		Mr, Mrs, Miss, Ms, Other
	}
	
	private Title title;
	private String firstName;
	private String lastName;

	public FullName(Title title, String firstName, String lastName) {
		this.setTitle(title);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public Title getTitle() {
		return this.title;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("%s. %s %s", this.getTitle(), this.getFirstName(), this.getLastName());
	}
}
