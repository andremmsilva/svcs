package com.svcs.app;

public abstract class Command<Receiver> {
	private Receiver receiver;

	protected Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
