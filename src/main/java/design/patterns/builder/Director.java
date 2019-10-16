package design.patterns.builder;

/**
 * 建造房子指挥者
 * 通过指挥不同的建造者建造出不同的房子
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 房子构建过程和交付房子
     * @return
     */
    public House composite(){
        builder.makeFloor();
        builder.makeWall();
        builder.makeCeiling();
        return builder.getHouse();
    }
}
