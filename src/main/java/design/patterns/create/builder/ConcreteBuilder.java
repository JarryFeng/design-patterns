package design.patterns.create.builder;

/**
 * 实际建造者
 */
public class ConcreteBuilder extends Builder {
    @Override
    void makeFloor() {
        house.setFloor("打毛坯房的地基");
    }

    @Override
    void makeWall() {
        house.setWall("砌毛坯房的墙");
    }

    @Override
    void makeCeiling() {
        house.setCeiling("封毛坯房的顶");
    }
}
