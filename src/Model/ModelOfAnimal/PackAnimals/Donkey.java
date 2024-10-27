package Model.ModelOfAnimal.PackAnimals;

import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.Species;
import Model.ModelOfAnimal.TypeOfAnimal;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimal{

    public Donkey(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth, Species species,
                  String isAnimalForTransportingGoods, int liftingCapacity, String isAnimalForRiding) {
        super(typeOfAnimal, name, gender, dateOfBirth, species, isAnimalForTransportingGoods, liftingCapacity,
                isAnimalForRiding);
    }
}
