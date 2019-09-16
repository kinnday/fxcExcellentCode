package com.designpatterns.action.command.command;

import com.designpatterns.action.command.Command;
import com.designpatterns.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
