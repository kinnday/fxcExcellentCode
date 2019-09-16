package com.designpatterns.action.command.command;

import com.designpatterns.action.command.Command;
import com.designpatterns.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
