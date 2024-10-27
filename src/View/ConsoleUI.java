package View;

import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.Species;
import presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private boolean work;
    private MainMenu mainMenu;
   private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        mainMenu = new MainMenu(this);
    }


    @Override
    public void start() throws IOException, ClassNotFoundException {
        System.out.println("--------------------------------- ");
        System.out.println("Приветствую!");


        while(work) {
            System.out.println(mainMenu.menu());
            System.out.println("--------------ввод---------------");
            if(scanner.hasNextLine()){
                String choiceStr = scanner.nextLine();
                int choice = Integer.parseInt(choiceStr);
                mainMenu.execute(choice);
            }else{
                System.out.println("что-то пошло не так");
            }

        }
    }


    public void askNewAnimal(){
        System.out.println("Укажите тип животного: \n -> CAT \n -> DOG \n -> HAMSTER \n -> HORSE \n -> CAMEL \n -> DONKEY \n");
        String species = scanner.nextLine().toUpperCase();
        switch (species){
            case "CAT", "DOG", "HAMSTER" -> addNewPetAnimal(species);
            case "HORSE", "CAMEL", "DONKEY" -> addNewPackAnimal(species);
            default -> throw new IllegalStateException("Unexpected value: " + species.toUpperCase());
        }

    }

    public void addNewPetAnimal(String species) {

        try{
            System.out.println("Укажите имя/кличку животного: ");
            String name = scanner.nextLine();
            System.out.println("Укажите пол животного: male / female");
            String gender = scanner.nextLine().toLowerCase();

            System.out.println("Укажите породу животного: ");
            String breed = scanner.nextLine().toLowerCase();
            System.out.println(breed);

            System.out.println("Укажите год рожения животного: 0 - 2024");
            String year_rel = scanner.nextLine();
            int year =  Integer.parseInt(year_rel);
            System.out.println("Укажите месяц рожения: 1 - 12");
            String month_rel = scanner.nextLine();
            int month =  Integer.parseInt(month_rel);
            System.out.println("Укажите день рожения: 1 - 31");
            String day_rel = scanner.nextLine();
            int day =  Integer.parseInt(day_rel);

            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            System.out.println(dateOfBirth);

            presenter.choseNewPetAnimal(Species.valueOf(species), name, GenderOfAnimal.valueOf(gender), dateOfBirth,
                    breed);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void addNewPackAnimal(String species){

        try{
            System.out.println("Укажите имя/кличку животного: ");
            String name = scanner.nextLine();
            System.out.println("Укажите пол животного: male / female");
            String gender = scanner.nextLine().toLowerCase();
            System.out.println("Укажите год рожения животного: 0 - 2024");
            String year_rel = scanner.nextLine();
            int year =  Integer.parseInt(year_rel);
            System.out.println("Укажите месяц рожения: 01 - 12");
            String month_rel = scanner.nextLine();
            int month =  Integer.parseInt(month_rel);
            System.out.println("Укажите день рожения: 01 - 31");
            String day_rel = scanner.nextLine();
            int day =  Integer.parseInt(day_rel);
            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            System.out.println(dateOfBirth);
            System.out.println("Это животное для грузоперевозки? y / n");
            String isAnimalForTransportingGoods = scanner.nextLine();
            System.out.println("Грузоподъемность в кг: ");
            String lifttingCapacityStr = scanner.nextLine();
            int liftingCapacity = Integer.parseInt(lifttingCapacityStr);
            System.out.println("Животное для верховой езды? y / n ");
            String isAnimalForRiding = scanner.nextLine();

            presenter.choseNewPackAnimal(Species.valueOf(species), name, GenderOfAnimal.valueOf(gender), dateOfBirth,
                    isAnimalForTransportingGoods, liftingCapacity, isAnimalForRiding);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public String getAnimalCatalog() {
        return presenter.getAnimalCatalog();
    }

    public void teachAnimalCommand(){

            System.out.println("Введите имя животного: ");
            String name = scanner.nextLine();
            System.out.println("Укажите год рожения животного: 0 - 2024");
            String year_rel = scanner.nextLine();
            int year =  Integer.parseInt(year_rel);
            System.out.println("Укажите месяц рожения: 01 - 12");
            String month_rel = scanner.nextLine();
            int month =  Integer.parseInt(month_rel);
            System.out.println("Укажите день рожения: 01 - 31");
            String day_rel = scanner.nextLine();
            int day =  Integer.parseInt(day_rel);
            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            System.out.println(dateOfBirth);


            System.out.println("Введите команду, которой хотите обучить животного: ");
            String input = scanner.nextLine();

            presenter.teachNewCommand(name, dateOfBirth, input);

    }

    public void showCommands(){
        try{
            System.out.println("Введите имя животного: ");
            String name = scanner.nextLine();
            System.out.println("Укажите год рожения животного: 0 - 2024");
            String year_rel = scanner.nextLine();
            int year =  Integer.parseInt(year_rel);
            System.out.println("Укажите месяц рожения: 01 - 12");
            String month_rel = scanner.nextLine();
            int month =  Integer.parseInt(month_rel);
            System.out.println("Укажите день рожения: 01 - 31");
            String day_rel = scanner.nextLine();
            int day =  Integer.parseInt(day_rel);
            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            System.out.println(dateOfBirth);

            presenter.showCommands(name, dateOfBirth);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }


    public void sortByAge(){
        presenter.sortByAge();
    }

    public void showNumberOfAnimals(){
        presenter.showNumberOfAnimals();
    }

    public void finish() {
        work = false;
        System.out.println("Работа приложения окончена.");
    }


    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
