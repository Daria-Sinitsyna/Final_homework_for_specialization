package Model.ModelOfAnimal;

public enum TypeOfAnimal {
    PETS("домашние животные"),
    PACK_ANIMAL("вьючные животные");

    private String title;

    TypeOfAnimal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return title;
    }
}
