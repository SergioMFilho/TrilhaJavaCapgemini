public class ClassesWrapper {
    public static void main(String[] args) {
        Boolean bolWrapped = true;
        System.out.println(bolWrapped.getClass());
        Character chWrapped = 'a';
        System.out.println(chWrapped.getClass());
        Byte byteWrapped = 1;
        System.out.println(bolWrapped.getClass());
        Short shoWrapped = 'B';
        System.out.println(shoWrapped.getClass());
        Integer intWrapped = 5215;
        System.out.println(intWrapped.getClass());
        Long longWrapped = 142345354233L;
        System.out.println(longWrapped.getClass());
        Float floatWrapped = 3.14987f;
        System.out.println(floatWrapped.getClass());
        Double doubleWrapped = 3.14159;
        System.out.println(doubleWrapped.getClass());
        int numero = Integer.parseInt("1");
        numero = numero + 1;
        System.out.println(numero);
    }
}
