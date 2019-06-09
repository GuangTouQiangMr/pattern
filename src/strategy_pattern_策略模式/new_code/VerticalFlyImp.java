package strategy_pattern_策略模式.new_code;

import strategy_pattern_策略模式.new_code.base.FlyInterface;

public class VerticalFlyImp implements FlyInterface {

    @Override
    public void fly(String name) {
        System.out.println(name + "竖着飞");
    }
}
