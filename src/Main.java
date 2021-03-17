public class Main {
    public static void main(final String[] args) {
        Box<Box<Fruit>> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();
        Box<Fruit> box4 = new Box<>();
        Fruit fruit = new Apple();
        box2.put(fruit);
        box1.put(box2);

        BoxUtil.copyFromBoxToBox(box2, box3);
        BoxUtil.copyFreshFruitFromBoxToBox(box2, box4);
        BoxUtil.printElementFromTwoBoxes(box4);
        BoxUtil.printElementFromTwoBoxes(box3);
        BoxUtil.printElementFromTwoBoxes(box1);
        BoxUtil.printElementFromTwoBoxes(box2);
        BoxUtil.printElementFromBoxes(box1);
    }
}
