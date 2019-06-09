package strategy_pattern_策略模式.old_code;

public abstract class Duck {

    protected String name;

    public Duck(String name){
        this.name = name;
    }

    public void quack(){
        System.out.println("我是" + name + "会 嘎嘎叫");
    }

    public void swim(){
        System.out.println("我是" + name + "会 游泳");
    }

    /**
     * 新需求,所有鸭子都会飞
     */
    public void fly(){
        System.out.println("我是" + name + "会 飞翔");
    }

    /**
     * 鸭子的其他行为
     */
    abstract void display();

}
