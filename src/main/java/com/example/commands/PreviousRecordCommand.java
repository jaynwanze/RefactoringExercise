package com.example.commands;

import com.example.refactoring.EmployeeDetails;

public class PreviousRecordCommand implements Command {
    private EmployeeDetails context;
    public PreviousRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handlePreviousRecord();
    }
}
