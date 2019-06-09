package strategy_pattern_策略模式.new_code;

import strategy_pattern_策略模式.new_code.base.Duck;

/**
 * 没有翅膀的橡皮鸭子
 */
public class XPDuck extends Duck {

    public XPDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(this.name + "我不用呼吸");
    }
}
