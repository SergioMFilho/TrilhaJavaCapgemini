import javax.swing.*;

public class TrabalhandoArrays {
    public static void main(String[] args) {
        String[] paises = new String[4];
        int[] numeros = new int[10];
//        for (int i = 0; i < paises.length; i++) {
//            paises[i] = JOptionPane.showInputDialog("Informe um país");
//        }
//        for (String listaPaises : paises) {
//            System.out.println(listaPaises);
//         }
        for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        }
        for (int listaNumeros : numeros) {
                System.out.println(listaNumeros);
        }

        int novoValor = 11;
        numeros[8] = novoValor + 4;
        for (int listaNumeros : numeros) {
            System.out.println(listaNumeros);
        }
        }
    }
