package strategy_pattern_策略模式.new_code;

public class Test {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck("绿头野鸭");
        RedHeadDuck redHeadDuck = new RedHeadDuck("红头鸭");
        XPDuck xpDuck = new XPDuck("没有翅膀的橡皮鸭子");

        mallardDuck.performFly();
        System.out.println("-------");

        redHeadDuck.performFly();
        System.out.println("-------");

        xpDuck.setFlyInterface(new CrosswiseFlyImp());
        xpDuck.performFly();
        xpDuck.setFlyInterface(new VerticalFlyImp());
        xpDuck.performFly();
        /**
         * 绿头野鸭横着飞
         * -------
         * 红头鸭竖着飞
         * -------
         * 没有翅膀的橡皮鸭子横着飞
         * 没有翅膀的橡皮鸭子竖着飞
         */
    }
}
