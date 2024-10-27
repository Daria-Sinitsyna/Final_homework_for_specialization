package Model.ModelOfAnimal;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal implements Methodable {

    private TypeOfAnimal typeOfAnimal;
    private String name;
    private GenderOfAnimal gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    public List<String> commands;

    public Animal(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
                  LocalDate dateOfDeath, List<String> commands) {

        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.commands = commands;
    }

    public Animal(TypeOfAnimal typeOfAnimal, String name, LocalDate dateOfBirth) {
        this(typeOfAnimal, name, null, dateOfBirth, null, null);
        commands = new ArrayList<>();
    }

    public Animal(TypeOfAnimal  typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth) {
        this(typeOfAnimal, name, gender, dateOfBirth, null, null);
        commands = new ArrayList<>();
    }

    /*------------------- Methods ---------------------------------------------- */
    public int getAge() {
        if (dateOfBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Животное ещё не родилось. " );
        }

        if (dateOfDeath == null) {
            return getPeriod(dateOfBirth, LocalDate.now());
        } else {
            return getPeriod(dateOfBirth, dateOfDeath);
        }
    }

    private int getPeriod(LocalDate dateOfBirth, LocalDate dateOfDeath) {
        Period difference = Period.between(dateOfBirth, dateOfDeath);
        return difference.getYears();
    }

    public boolean teachCommand(String command){

        if(!commands.contains(command.toLowerCase())){
            commands.add(command);
            System.out.println("-------------------done-------------------");
            return true;
        }
        return false;
    }

    public void showCommands(){
        System.out.println(commands);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public String getInfo(){

        StringBuilder info = new StringBuilder();
        info.append("Имя: ");
        info.append(name);
        info.append(", Дата рождения: ");
        info.append(dateOfBirth);
        info.append(", Возраст: ");
        info.append(getAge());
        return info.toString();

    }

    /*-----------------------Getters and Setters ----------------------------------*/


    public TypeOfAnimal getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderOfAnimal getGender() {
        return gender;
    }

    public void setGender(GenderOfAnimal gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }


}
