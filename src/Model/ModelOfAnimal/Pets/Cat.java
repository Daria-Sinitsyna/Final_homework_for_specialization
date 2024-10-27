package Model.ModelOfAnimal.Pets;

import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.Species;
import Model.ModelOfAnimal.TypeOfAnimal;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Pet{

    public Cat(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
               Species species, String breed) {
        super(typeOfAnimal, name, gender, dateOfBirth, species, breed);
    }
}
