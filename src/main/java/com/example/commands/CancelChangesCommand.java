package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class CancelChangesCommand implements Command {
    private EmployeeDetails context;

    public CancelChangesCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Handles the logic for cancelling changesd.
    @Override
    public void execute() {
        context.handleCancelChange();
    }
}
