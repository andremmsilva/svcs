package com.svcs.app;

public interface Message {
	static String usage() {
		return "USAGE: ./svcs [COMMAND] [OPTIONS]\n";
	}

	static String unknownCommand(String name) {
		return "Error - unknown command: " + name + "\n";
	}
}
