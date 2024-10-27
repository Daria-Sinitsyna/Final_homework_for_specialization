package Model.ModelOfAnimal.AnimalCatalog;

import Model.ModelOfAnimal.Animal;
import Model.ModelOfAnimal.Comparator.AnimalComparatorByAge;
import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.Methodable;
import Model.ModelOfAnimal.TypeOfAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnimalCatalog implements Methodable {

    private List<Animal> animals;


    public AnimalCatalog(){
        this(new ArrayList());
    }

    public AnimalCatalog(List animals) {
        this.animals = animals;
    }


    public boolean addAnimalToCatalog(Animal animal){

        if(animal == null){
            return false;
        }

        if(!animals.contains(animal)){
            animals.add(animal);

            return true;
        }
        return false;
    }

    public List<Animal> sortByAge(){
        animals.sort(new AnimalComparatorByAge());

        return this.animals;

    }

    public void teachCommand(String name, LocalDate dateOfBirth, String command){
        for(Animal animal: animals){
            if(animal.getName().equals(name) && animal.getDateOfBirth().equals(dateOfBirth)){
                animal.teachCommand(command);
            }
        }
    }

    public void showCommands(String name, LocalDate dateOfBirth){
        for(Animal animal: animals){
            if(animal.getName().equals(name) && animal.getDateOfBirth().equals(dateOfBirth)){
                animal.showCommands();
            }
        }
    }

    public String showNumberOfAnimals(){
        StringBuilder info = new StringBuilder();
        info.append("В реестре животных ");
        info.append(animals.size());
        info.append(" объекта(ов): \n");

        return info.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info.append("В реестре животных ");
        info.append(animals.size());
        info.append(" объекта(ов): \n");
        for(Animal animal: animals){
            info.append(animal);
            info.append("\n");
        }

        return info.toString();

    }


}
