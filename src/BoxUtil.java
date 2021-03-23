public class BoxUtil {
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null && src.get().getFresh()) {
            dest.put(src.get());
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        System.out.println(box.get().get().toString());
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
       if (!(box.get() instanceof Box)) {
           System.out.println(box.get().toString());
       } else {
           printElementFromBoxes((Box<T>) box.get());
       }
    }
}
