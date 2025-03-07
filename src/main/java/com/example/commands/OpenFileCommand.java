package com.example.commands;

import javax.swing.*;

import com.example.dialogs.EmployeeDetails;

import java.io.File;

// Command to open a file in the context of the EmployeeDetails class
public class OpenFileCommand implements Command {
    private EmployeeDetails context; // The context in which the command is executed

    public OpenFileCommand(EmployeeDetails context) {
        this.context = context;
    }

    // Implementing behaviour of command interface
    @Override
    public void execute() {
        context.handleOpenFile();

    }
}
