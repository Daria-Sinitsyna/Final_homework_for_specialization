package View.commands;

import View.ConsoleUI;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI) {

        super("Завершение работы приложения", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().finish();
    }
}
