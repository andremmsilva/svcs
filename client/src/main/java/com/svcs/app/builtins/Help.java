package com.svcs.app.builtins;

import com.svcs.app.Command;
import com.svcs.app.Message;
import com.svcs.core.SVCSManager;

public class Help extends Command<SVCSManager> {
	public Help(SVCSManager receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		System.out.println(Message.help());
	}
}
