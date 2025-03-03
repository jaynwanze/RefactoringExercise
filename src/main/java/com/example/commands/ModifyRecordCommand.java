package com.example.commands;

import com.example.refactoring.EmployeeDetails;

// Class that implements the command interface.
public class ModifyRecordCommand implements Command {
    private EmployeeDetails context;

    public ModifyRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Handles the logic for modifying a record.
    @Override
    public void execute() {
        context.handleModifyRecord();
    }
}
