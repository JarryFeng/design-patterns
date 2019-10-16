package design.patterns.builder;

/**
 * 抽象建造者
 */
public abstract class Builder {

    House house = new House();

    abstract void makeFloor();

    abstract void makeWall();

    abstract void makeCeiling();

    public House getHouse(){
        return house;
    }

}
