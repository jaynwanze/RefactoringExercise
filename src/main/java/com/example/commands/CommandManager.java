package com.example.commands;

import java.util.HashMap;
import java.util.Map;

// CommandManager is a class that manages commands.
public class CommandManager {
    //It has a map of commands
    private Map<String, Command> commands = new HashMap<>();

    public void register(String commandName, Command command) {
        commands.put(commandName, command);
    }

    // Runs a command by its name
    public void runCommand(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Command not found: " + commandName);
        }
    }
}
