public class BoxUtil {
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<T> dest) {
        dest.put(src.get());
    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.get().getFresh()) {
            dest.put(src.get());
        }
    }

    public static void printElementFromTwoBoxes(final Box<?> box) {
        System.out.println(box.get().toString());
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
       if (box.get() instanceof Fruit) {
           System.out.println(box.get().toString());
       } else {
           printElementFromBoxes((Box<T>) box.get());
       }
    }
}
