package com.example.commands;

import com.example.refactoring.EmployeeDetails;

public class NextRecordCommand implements Command {
    private EmployeeDetails context;
    public NextRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleNextRecord();
    }
    
}
