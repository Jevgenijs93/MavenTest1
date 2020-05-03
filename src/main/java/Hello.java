public class Hello {
    public static String Hello() {
        return "Hello";
    }
    public static String HelloAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        return String.format ("Hello", "id!", age);
    }
}
