package com.example.commands;

import com.example.dialogs.EmployeeDetails;

// CreateRecordCommand is a class that implements the Command interface.
public class CreateRecordCommand implements Command {
    private EmployeeDetails context;

    public CreateRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Handles the logic for creating a record.
    @Override
    public void execute() {
        context.handleCreateRecord();
    }
}
