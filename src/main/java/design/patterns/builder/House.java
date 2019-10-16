package design.patterns.builder;

/**
 * 建造房子
 */
public class House {
    //地板
    private String floor;

    //墙体
    private String wall;

    //天花板
    private String ceiling;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", ceiling='" + ceiling + '\'' +
                '}';
    }
}
