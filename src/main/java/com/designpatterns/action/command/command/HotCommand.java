package com.designpatterns.action.command.command;

import com.designpatterns.action.command.Command;
import com.designpatterns.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
