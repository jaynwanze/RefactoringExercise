package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class SearchSurnameCommand implements Command {
    private EmployeeDetails context;

    public SearchSurnameCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleSearchSurname();
    }

}
