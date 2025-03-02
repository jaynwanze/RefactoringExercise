package com.example.commands;

import com.example.refactoring.EmployeeDetails;

// Command to save file in the context of the EmployeeDetails class
public class SaveFileCommand implements Command {
    private EmployeeDetails context;

    public SaveFileCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Implementing behaviour of command interface 
    @Override
    public void execute() {
        //Handle save file action
        context.handleSaveFile(); 
    }
}
