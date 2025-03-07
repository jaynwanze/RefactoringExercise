package com.example.commands;

import com.example.dialogs.EmployeeDetails;

// Class that implements the command interface.
public class DeleteRecordCommand implements Command {
    private EmployeeDetails context;

    public DeleteRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Handles the logic for deleting a record.
    @Override
    public void execute() {
        context.handleDeleteRecord();
    }
}
