package View.commands;

import View.ConsoleUI;

public class AddNewAnimal extends Command{

    public AddNewAnimal(ConsoleUI consoleUI) {

        super("Добавление нового животного", consoleUI);
    }

    public void execute(){
        getConsoleUI().askNewAnimal();
    }
}
