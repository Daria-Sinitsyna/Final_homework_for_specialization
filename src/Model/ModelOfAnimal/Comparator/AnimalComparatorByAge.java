package Model.ModelOfAnimal.Comparator;

import Model.ModelOfAnimal.Animal;

import java.util.Comparator;

public class AnimalComparatorByAge implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
