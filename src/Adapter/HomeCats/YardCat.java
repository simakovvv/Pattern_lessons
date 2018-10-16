package Adapter.HomeCats;

public class YardCat implements IHomeCat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Meow() {
        System.out.println("Мяу мяу");
    }

    @Override
    public void Skratch() {
        System.out.println("Я царапаюсь, но не сильно");
    }
}
