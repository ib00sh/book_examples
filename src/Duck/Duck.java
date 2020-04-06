package Duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void perormFly() {
        flyBehavior.fly();
    }

    public void perofrmQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fB) {
        flyBehavior = fB;
    }

    public void setQuackBehavior(QuackBehavior qB) {
        quackBehavior = qB;
    }
}
