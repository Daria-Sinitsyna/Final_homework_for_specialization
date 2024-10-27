package View.commands;

import View.ConsoleUI;

public class ShowNumberOfAnimals extends Command{
    public ShowNumberOfAnimals(ConsoleUI consoleUI) {

        super("Вывести общее количество животных", consoleUI);
    }

    public void execute(){
        getConsoleUI().showNumberOfAnimals();
    }
}
