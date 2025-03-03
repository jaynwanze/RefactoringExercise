package com.example.commands;

import com.example.refactoring.EmployeeDetails;

// Command to save as file in the context of the EmployeeDetails class
public class SaveAsCommand implements Command {
    private EmployeeDetails context;

    public SaveAsCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Implementing behaviour of command interface
    @Override
    public void execute() {
        //Handle save as file action
        context.handleSaveAsFile();
    }
}
