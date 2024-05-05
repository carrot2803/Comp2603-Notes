public class GenericClass<T> {
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println(data);
    }
}
