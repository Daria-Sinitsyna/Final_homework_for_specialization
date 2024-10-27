package Model.ModelOfAnimal.Pets;

import Model.ModelOfAnimal.*;

import java.time.LocalDate;
import java.util.List;

public class Pet extends Animal implements Methodable {

    private Species species;
    private String breed; // порода


//    public Pet(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender,
//               LocalDate dateOfBirth, LocalDate dateOfDeath, List<String> commands, Species species, String breed) {
//        super(typeOfAnimal, name, gender, dateOfBirth, dateOfDeath, commands);
//        this.species = species;
//        this.breed = breed;
//    }
//
//    public Pet(TypeOfAnimal typeOfAnimal, String name, LocalDate dateOfBirth,
//               Species species, String breed) {
//        super(typeOfAnimal, name, dateOfBirth);
//        this.species = species;
//        this.breed = breed;
//    }

    public Pet(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
               Species species, String breed) {
        super(typeOfAnimal, name, gender, dateOfBirth);
        this.species = species;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public String getInfo(){

        StringBuilder info = new StringBuilder();
        info.append(getTypeOfAnimal());
        info.append(", ");
        info.append(species);
        info.append(", Имя: ");
        info.append(getName());
        info.append(", Дата рождения: ");
        info.append(getDateOfBirth());
        info.append(", Возраст: ");
        info.append(getAge());
        info.append(", Пол: ");
        info.append(getGender());
        info.append(", Порода: ");
        info.append(breed);
        info.append(", Команды: ");
        info.append(commands);
        return info.toString();

    }

    /*---------------Getters and Setters -------------------------------*/

    public String getBreed() {
        return breed;
    }
}
