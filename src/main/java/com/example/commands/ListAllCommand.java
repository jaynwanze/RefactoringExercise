package com.example.commands;

import com.example.refactoring.EmployeeDetails;

// e.g. ListAll
public class ListAllCommand implements Command {
    private EmployeeDetails context;
    public ListAllCommand(EmployeeDetails context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.handleListAll();
    }
}
