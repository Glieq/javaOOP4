public class run {
    public static void main(String[] args) {
        FruitBox box = new FruitBox();

        Orange orange1 = new Orange(0.2);
        Orange orange2 = new Orange(0.25);
        Apple apple = new Apple(0.3);
        GoldenApple goldenApple = new GoldenApple(0.35);

        box.add(orange1);
        box.add(orange2);
        box.add(apple);
        box.add(goldenApple);

        System.out.println("Total weight of fruits in the box: " + box.getWeight() + " kg");
    }
}
