package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class CloseAppCommand implements Command {
    private EmployeeDetails context;

    public CloseAppCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Handles the logic for creating a record.
    @Override
    public void execute() {
        context.handleCloseApp();
    }
}
