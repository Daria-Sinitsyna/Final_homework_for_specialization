package presenter;

import Model.ModelOfAnimal.GenderOfAnimal;
import Model.ModelOfAnimal.Species;
import View.View;

import java.time.LocalDate;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void choseNewPetAnimal(Species species, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
                                  String breed){
        service.choseNewPetAnimal(species, name, gender, dateOfBirth, breed);

    }

    public void choseNewPackAnimal(Species species, String name, GenderOfAnimal gender, LocalDate dateOfBirth,
                                   String isAnimalForTransportingGoods, int lifringCapacity, String isAnimalForRiding)
    {
        service.choseNewPackAnimal(species, name, gender, dateOfBirth, isAnimalForTransportingGoods,
                lifringCapacity, isAnimalForRiding);
    }

    public String getAnimalCatalog() {
        String answer = service.getInfo();
        view.printAnswer(answer);
        return answer;
    }

    public void teachNewCommand(String name, LocalDate dateOfBirth, String command){
        service.teachAnimal(name, dateOfBirth, command);
    }

    public void showCommands(String name, LocalDate dateOfBirth){
        service.showCommands(name, dateOfBirth);
    }

    public void sortByAge(){
        service.sortByAge();
    }


    public String showNumberOfAnimals() {
        String answer = service.showNumberOfAnimals();
        view.printAnswer(answer);
        return answer;
    }
}
