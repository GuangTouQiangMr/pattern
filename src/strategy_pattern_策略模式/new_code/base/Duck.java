package strategy_pattern_策略模式.new_code.base;


public abstract class Duck {

    public String name;

    public Duck(String name){
        this.name = name;
    }

    public FlyInterface flyInterface;

    /**
     * 委托给行为类处理
     */
    public void performFly(){
        flyInterface.fly(name);
    }

    /**
     * 鸭子的其他行为
     */
    public abstract void display();

    /**
     * 在运行时可以动态改变
     * @param flyInterface
     */
    public void setFlyInterface(FlyInterface flyInterface){
        this.flyInterface = flyInterface;
    }
}
