package com.embedsocial.widgetvisit.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class WidgetVisitCommand {

    @ShellMethod(key = "embedsocial:processwidgetvisit", value = "Process WidgetVisits")
    public String execute() {
        return "Hello";
    }
}
