package strategy_pattern_策略模式.old_code;

public class Test {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck("绿头野鸭");
        RedHeadDuck redHeadDuck = new RedHeadDuck("红头鸭");
        XPDuck xpDuck = new XPDuck("没有翅膀的橡皮鸭子");

        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.display();
        System.out.println("-------");

        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.display();
        System.out.println("-------");

        xpDuck.quack();
        xpDuck.swim();
        xpDuck.fly();
        xpDuck.display();

        /**
         * 我是绿头野鸭会 嘎嘎叫
         * 我是绿头野鸭会 游泳
         * 我是绿头野鸭会 飞翔
         * -------
         * 我是红头鸭会 嘎嘎叫
         * 我是红头鸭会 游泳
         * 我是红头鸭会 飞翔
         * -------
         * 我是没有翅膀的橡皮鸭子会 嘎嘎叫
         * 我是没有翅膀的橡皮鸭子会 游泳
         * 我是没有翅膀的橡皮鸭子会 飞翔 ---可怕的事情发生了,没有翅膀的鸭子会飞翔了!!!
         * */

        /**
         * 我是绿头野鸭会 嘎嘎叫
         * 我是绿头野鸭会 游泳
         * 我是绿头野鸭会 飞翔
         * 绿头野鸭我会下蛋
         * -------
         * 我是红头鸭会 嘎嘎叫
         * 我是红头鸭会 游泳
         * 我是红头鸭会 飞翔
         * 红头鸭我不会下蛋
         * -------
         * 我是没有翅膀的橡皮鸭子会 嘎嘎叫
         * 我是没有翅膀的橡皮鸭子会 游泳
         * 我是没有翅膀的橡皮鸭子 覆盖了飞翔的行为功能 我不会飞
         * 没有翅膀的橡皮鸭子我不用呼吸
         * */
    }
}
