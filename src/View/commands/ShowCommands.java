package View.commands;

import View.ConsoleUI;

public class ShowCommands extends Command{

    public ShowCommands(ConsoleUI consoleUI) {

        super("Вывод команд животного", consoleUI);
    }

    public void execute(){
        getConsoleUI().showCommands();
    }
}
