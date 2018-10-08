package Strategy.Purpose;



public class WithoutPurpose implements IPurpose {

    @Override
    public void doSomething() {
        System.out.println("I do nothing");
    }
}
