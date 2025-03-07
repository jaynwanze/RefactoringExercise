package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class LastRecordCommand implements Command {
    private EmployeeDetails context;
    public LastRecordCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleLastRecord();
    }
}
