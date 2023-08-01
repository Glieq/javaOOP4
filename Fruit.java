class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Orange extends Fruit {
    public Orange(double weight) {
        super(weight);
    }
}

class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }
}

class GoldenApple extends Fruit {
    public GoldenApple(double weight) {
        super(weight);
    }
}

class FruitBox {
    private double totalWeight;

    public FruitBox() {
        totalWeight = 0.0;
    }

    public void add(Fruit fruit) {
        totalWeight += fruit.getWeight();
    }

    public double getWeight() {
        return totalWeight;
    }
}
