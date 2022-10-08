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
//        carros.clear();
        System.out.println(carros);
        if(carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }
        System.out.println(carros.size());
        if(carros.contains("BMW")) {
            for(int i=0; i< carros.size(); i++) {
                if("BMW".equals(carros.get(i))) {
                    carros.set(i,"BUGATTI");
                    break;
                }
            }
        } else {
            System.out.println("Não encontrei o argumento pesquisado");
        }
        System.out.println(carros);
    }
}

