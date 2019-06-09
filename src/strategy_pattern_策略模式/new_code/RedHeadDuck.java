package strategy_pattern_策略模式.new_code;

import strategy_pattern_策略模式.new_code.base.Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(String name) {
        super(name);
        flyInterface = new VerticalFlyImp();
    }

    @Override
    public void display() {
        System.out.println(this.name + "我不会下蛋");
    }
}
