package strategy_pattern_策略模式.old_code;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println(this.name + "我不会下蛋");
    }
}
