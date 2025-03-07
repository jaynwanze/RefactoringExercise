package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class SaveChangesCommand implements Command {
    // SaveChangesCommand is a class that implements the Command interface.
    private EmployeeDetails context;

    public SaveChangesCommand(EmployeeDetails context) {
        this.context = context;
    }
    

    // Handles the logic for saving changes.
    public void execute() {
        context.handleSaveChange();
    }
}
