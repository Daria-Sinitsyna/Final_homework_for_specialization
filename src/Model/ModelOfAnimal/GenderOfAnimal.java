package Model.ModelOfAnimal;

public enum GenderOfAnimal {
    male("самец"),
    female("самка");

    private String title;

    GenderOfAnimal(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}
