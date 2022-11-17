package com.svcs.app;

import com.svcs.app.builtins.Add;
import com.svcs.app.builtins.Init;
import com.svcs.app.exceptions.UnknownCommandException;
import com.svcs.core.SVCSManager;
import com.svcs.core.exceptions.ZeroArgumentException;

import java.util.Locale;

public class Parser {
	private String[] args;
	private SVCSManager receiver;

	public Parser(SVCSManager receiver, String[] args) {
		this.receiver = receiver;
		this.args = args;
	}

	private Command getBuiltin(String command) throws UnknownCommandException {
		switch (command.toLowerCase(Locale.ROOT)) {
			case "add" -> {
				return new Add(this.receiver.getCore());
			}
			case "init" -> {
				return new Init(this.receiver);
			}

			default -> throw new UnknownCommandException(command);
		}
	}

	public void invokeCommand() throws ZeroArgumentException, UnknownCommandException {
		if (args.length == 0) throw new ZeroArgumentException();
		Command command = getBuiltin(args[0]);
		command.execute();
	}
}
