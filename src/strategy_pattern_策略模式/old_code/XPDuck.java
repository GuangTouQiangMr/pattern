package strategy_pattern_策略模式.old_code;

/**
 * 没有翅膀的橡皮鸭子
 */
public class XPDuck extends Duck {

    public XPDuck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("我是" + name + " 覆盖了飞翔的行为功能 我不会飞");
    }

    @Override
    void display() {
        System.out.println(this.name + "我不用呼吸");
    }
}
