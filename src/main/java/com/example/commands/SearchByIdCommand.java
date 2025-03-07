package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class SearchByIdCommand implements Command {
    private EmployeeDetails context;
    public SearchByIdCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleSearchById();
    }
}
