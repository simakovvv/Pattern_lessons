package Adapter.WildCat;

public class Tiger implements IWildCat {
    @Override
    public String getBreed() {
        return "Тигр обыкновенный";
    }

    @Override
    public void Growl() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void Scratch() {
        System.out.println("У меня очень острые когти, царапаюсь  до смерти");
    }
}
