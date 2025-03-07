package com.example.commands;

import com.example.dialogs.EmployeeDetails;

public class SearchBySurnameCommand implements Command {
    private EmployeeDetails context;

    public SearchBySurnameCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleSearchBySurname();
    } 
    
}
