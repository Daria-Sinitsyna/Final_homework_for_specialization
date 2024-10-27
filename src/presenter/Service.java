package presenter;

import Model.ModelOfAnimal.Animal;
import Model.ModelOfAnimal.AnimalCatalog.AnimalCatalog;
import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.PackAnimals.Camel;
import Model.ModelOfAnimal.PackAnimals.Donkey;
import Model.ModelOfAnimal.PackAnimals.Horse;
import Model.ModelOfAnimal.Pets.Cat;
import Model.ModelOfAnimal.Pets.Dog;
import Model.ModelOfAnimal.Pets.Hamster;
import Model.ModelOfAnimal.Species;
import Model.ModelOfAnimal.TypeOfAnimal;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class Service {

    private AnimalCatalog animalCatalog;

    public Service() {
        animalCatalog = new AnimalCatalog();

    }


    public Animal choseNewPetAnimal(Species species, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
                                    String breed){
        Animal animal = null;

        switch(species){
            case CAT -> animal = new Cat(TypeOfAnimal.PETS, name, gender, dateOfBirth, species, breed);
            case DOG -> animal = new Dog(TypeOfAnimal.PETS, name, gender, dateOfBirth, species, breed);
            case HAMSTER -> animal = new Hamster(TypeOfAnimal.PETS, name, gender, dateOfBirth, species, breed);
            default -> System.out.println("Некорректный ввод");

        }
        animalCatalog.addAnimalToCatalog(animal);
        return animal;

    }

    public Animal choseNewPackAnimal(Species species, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
                                     String isAnimalForTransportingGoods, int lifringCapacity, String isAnimalForRiding){
        Animal animal = null;

        switch(species){
            case CAMEL -> animal = new Camel(TypeOfAnimal.PACK_ANIMAL, name, gender, dateOfBirth, species,
                    isAnimalForTransportingGoods, lifringCapacity, isAnimalForRiding);
            case HORSE -> animal = new Horse(TypeOfAnimal.PACK_ANIMAL, name, gender, dateOfBirth, species,
                    isAnimalForTransportingGoods, lifringCapacity, isAnimalForRiding);
            case DONKEY -> animal = new Donkey(TypeOfAnimal.PACK_ANIMAL, name, gender, dateOfBirth, species,
                    isAnimalForTransportingGoods, lifringCapacity, isAnimalForRiding);
            default -> System.out.println("Некорректный ввод");
        }
        animalCatalog.addAnimalToCatalog(animal);
        return animal;
    }


   public String getInfo(){
        return animalCatalog.getInfo();
   }

    public void sortByAge() {
        var catalog = animalCatalog.sortByAge().stream()
                .map(Animal::toString)
                .collect(Collectors.joining("\n"));
        System.out.println(catalog);

    }


    public void teachAnimal(String name, LocalDate dateOfBirth, String command){
        animalCatalog.teachCommand(name, dateOfBirth, command);

    }

    public void showCommands(String name, LocalDate dateOfBirth){
        animalCatalog.showCommands(name, dateOfBirth);
    }


    public String showNumberOfAnimals() {
        return animalCatalog.showNumberOfAnimals();
    }
}
