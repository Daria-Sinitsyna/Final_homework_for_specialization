package View.commands;

import View.ConsoleUI;

public class TeachAnimalCommand extends Command{

    public TeachAnimalCommand(ConsoleUI consoleUI) {

        super("Обучение новой команде", consoleUI);
    }

    public void execute(){
        getConsoleUI().teachAnimalCommand();
    }
}
