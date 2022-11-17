package com.svcs.app;

public interface Message {
	static String usage() {
		return "USAGE: ./svcs [COMMAND] [OPTIONS]\n";
	}

	static String help() {
		String s = """
        
				SVCS - Simple version control system

				USAGE: ./svcs [COMMAND] [OPTIONS]

				Commands:
					init [path/to/repo] - Initializes a repository in the given path (default is current directory)
					add [pattern] - Adds a certain pattern of files to the repository.
					commit [message] - Commits the changes made to the repository.
					remove/rm [pattern] - Removes a pattern of files from the repository.
					origin [URL] - Sets the remote server on which the files will be stored.
					strategy {1-5} - Sets the merging strategy (see below, default = 1)
					pull - Updates the local repository according to the set strategy.
					push - Submits the changes made in the commit.

				Strategies:
					// TODO

				Options:
					-v - Enables verbose mode
					""";
		return s;
	}

	static String unknownCommand(String name) {
		return "Error - unknown command: " + name + "\n";
	}
}
