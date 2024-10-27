package Start;

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
import View.ConsoleUI;
import View.View;

import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        View view = new ConsoleUI();
        view.start();

    }

}
