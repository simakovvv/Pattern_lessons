package Adapter.HomeCats;

public class PedigreedCat implements IHomeCat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Meow() {
        System.out.println("Урррр уррр");
    }

    @Override
    public void Skratch() {

        System.out.println("Я не царапаюсь");
    }

}
