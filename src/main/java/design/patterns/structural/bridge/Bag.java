package design.patterns.structural.bridge;

public abstract class Bag {
    Color color;

    Bag(Color color){
        this.color = color;
    }

    public abstract void getBag();
}
