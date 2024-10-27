package View.commands;

import View.ConsoleUI;

public class SortByAge extends Command{

    public SortByAge(ConsoleUI consoleUI) {

        super("Вывести список животных по дате рождения", consoleUI);
    }

    public void execute(){
        getConsoleUI().sortByAge();
    }
}
