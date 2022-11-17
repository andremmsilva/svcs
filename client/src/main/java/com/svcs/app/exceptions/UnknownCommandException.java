package com.svcs.app.exceptions;

public class UnknownCommandException extends CommandException {
	public UnknownCommandException(String name) {
		super(name);
	}
}
