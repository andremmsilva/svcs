package com.svcs.app;

import com.svcs.app.exceptions.UnknownCommandException;
import com.svcs.core.SVCSManager;
import com.svcs.core.exceptions.ZeroArgumentException;

public class App {

	private static void die(String message) {
		die(message, -1);
	}

	private static void die(String message, int code) {
		System.err.println(message);
		System.exit(code);
	}

	public static void main(String[] args) {
		SVCSManager receiver = new SVCSManager();
		Parser parser = new Parser(receiver, args);

		// FIXME Maybe move exception logic to different class.
		try {
			parser.invokeCommand();
		} catch (ZeroArgumentException e) {
			die(Message.usage());
		} catch (UnknownCommandException e) {
			die(Message.unknownCommand(e.getName()));
		}
	}
}
