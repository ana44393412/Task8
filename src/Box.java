public class Box<T> {
    private T content;

    /**@return boolean*/
    public T get() {
        return content;
    }
    /**@param contentInput*/
    public void put(final T contentInput) {
        this.content = contentInput;
    }
}
