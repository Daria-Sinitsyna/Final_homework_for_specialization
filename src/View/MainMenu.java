package View;

import View.commands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddNewAnimal(consoleUI));
        commands.add(new GetAnimalCatalog(consoleUI));
        commands.add(new TeachAnimalCommand(consoleUI));
        commands.add(new ShowCommands(consoleUI));
        commands.add(new SortByAge(consoleUI));
        commands.add(new ShowNumberOfAnimals(consoleUI));
        commands.add(new Finish(consoleUI));
        

    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------------------- \n");
        stringBuilder.append("Меню: \n");
        stringBuilder.append("--------------------------------- \n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) throws IOException, ClassNotFoundException {
        Command command = commands.get(choice - 1);
        command.execute();
    }

}
