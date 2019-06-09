package strategy_pattern_策略模式.old_code;

public class MallardDuck extends Duck{

    public MallardDuck(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println(this.name + "我会下蛋");
    }
}
