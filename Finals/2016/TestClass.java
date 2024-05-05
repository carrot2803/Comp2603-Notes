public class TestClass {
    public static void main(String[] args) {
        GenericClass<Integer> intData = new GenericClass<Integer>();
        intData.set(3);

        GenericClass<String> strData = new GenericClass<String>();
        // intData.set("Wayne"); I believe this is an error
        strData.set("Wayne");

        intData.print();
        strData.print();
    }
}