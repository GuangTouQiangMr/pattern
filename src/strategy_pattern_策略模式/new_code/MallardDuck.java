package strategy_pattern_策略模式.new_code;

import strategy_pattern_策略模式.new_code.base.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
        //如果有50个鸭子确定是横着飞, 我们可以将其定义为一个横着飞的基类,子类构造中不用再赋值
        flyInterface = new CrosswiseFlyImp();

    }

    @Override
    public void display() {
        System.out.println(this.name + "我会下蛋");
    }
}
