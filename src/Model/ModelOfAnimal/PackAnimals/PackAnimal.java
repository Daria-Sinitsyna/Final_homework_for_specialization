package Model.ModelOfAnimal.PackAnimals;

import Model.ModelOfAnimal.*;

import java.time.LocalDate;
import java.util.List;

public class PackAnimal extends Animal implements Methodable {

    private String isAnimalForTransportingGoods; // перевозит ли жиаотное грузы
    private int liftingCapacity;                  // грузоподъемность животного кг
    private String isAnimalForRiding;            // предназначено для верховой езды
    private Species species;


//    public PackAnimal(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth, Species species,
//                      LocalDate dateOfDeath, List<String> commands, String isAnimalForTransportingGoods,
//                      int liftingCapacity, String isAnimalForRiding) {
//        super(typeOfAnimal, name, gender, dateOfBirth, dateOfDeath, commands);
//        this.isAnimalForTransportingGoods = isAnimalForTransportingGoods;
//        this.liftingCapacity = liftingCapacity;
//        this.isAnimalForRiding = isAnimalForRiding;
//        this.species = species;
//    }

    public PackAnimal(TypeOfAnimal typeOfAnimal, String name, GenderOfAnimal gender, LocalDate dateOfBirth, Species species,
                      String isAnimalForTransportingGoods, int liftingCapacity, String isAnimalForRiding) {
        super(typeOfAnimal, name, gender, dateOfBirth);
        this.isAnimalForTransportingGoods = isAnimalForTransportingGoods;
        this.liftingCapacity = liftingCapacity;
        this.isAnimalForRiding = isAnimalForRiding;
        this.species = species;

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
        info.append(", Животное для грузоперевозки: ");
        info.append(isAnimalForTransportingGoods);
        info.append(", Грузоподъемность: ");
        info.append(liftingCapacity);
        info.append(", Животное для верховой езды: ");
        info.append(isAnimalForRiding);
        info.append(", Команды: ");
        info.append(commands);

        return info.toString();

    }

    /*--------------------------Getters and Setters--------------------------------*/

    public String getIsAnimalForTransportingGoods() {
        return isAnimalForTransportingGoods;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public String getIsAnimalForRiding() {
        return isAnimalForRiding;
    }
}
