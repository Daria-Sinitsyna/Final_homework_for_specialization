package View.commands;

import View.ConsoleUI;

public class GetAnimalCatalog extends Command{

    public GetAnimalCatalog(ConsoleUI consoleUI) {

        super("Вывод реестра животных", consoleUI);
    }

    public void execute(){
        getConsoleUI().getAnimalCatalog();
    }
}
