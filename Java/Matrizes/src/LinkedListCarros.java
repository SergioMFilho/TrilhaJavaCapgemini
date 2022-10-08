import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {
        LinkedList<String> cars= new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        cars.addFirst("Mazda");
        System.out.println(cars);
        cars.addLast("Bugatti");
        System.out.println(cars);
        String carro;
        carro = cars.get(3);
        System.out.println("Pegando o elemento 3 do array : "+carro);
        cars.removeFirst();
        System.out.println(cars + " Removi o primeiro elemento do array");
        System.out.println(cars.getFirst() + ": Pegando o primeiro elemento do array");
        cars.clear();
        System.out.println(cars);
        if (cars.isEmpty()) {
            System.out.println("LinkedList vazio");
        }
    }
}
