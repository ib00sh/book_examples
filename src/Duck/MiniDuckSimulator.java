package Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perofrmQuack();
        mallard.perormFly();

        System.out.println("");
        System.out.println("");

        Duck model = new ModelDuck();
        model.perormFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perormFly();
    }
}
