import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        System.out.println(carros);
//        carros.set(1,"SEDAN");
//        carros.remove("BMW");
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        System.out.println(carros);
    }
}

