package com.svcs.app.exceptions;

public class CommandException extends Exception {
	private String name;

	protected CommandException(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
