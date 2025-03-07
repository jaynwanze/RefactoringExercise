package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class FirstRecordCommand implements Command {
    private EmployeeDetails context;
    public FirstRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleFirstRecord();
    }
}
