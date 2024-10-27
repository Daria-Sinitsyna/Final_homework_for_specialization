package Model.ModelOfAnimal;

public enum Species {
    CAT("кошка"),
    DOG("собака"),
    HAMSTER("хомяк"),
    HORSE("лошадь"),
    DONKEY("осел"),
    CAMEL("верблюд");

    private String title;

    Species(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }

}
