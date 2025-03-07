package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class SearchIdCommand implements Command {
    private EmployeeDetails context;

    public SearchIdCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleSearchId();
    }

}
