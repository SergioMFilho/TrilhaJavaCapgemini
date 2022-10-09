package Embarque;

import Controle.Aeronaves;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aeronaves aero = new Aeronaves();
        System.out.println("Informe o numero de aeronaves");
        int numAeronaves = entrada.nextInt();
        for(int i=0; i < numAeronaves ; i++) {
            int numVoo = entrada.nextInt();
            aero.addVoo(numVoo);
        }
        aero.primeiroVoo();
        int x = aero.primeiroVoo();
        System.out.println("O primeiro a decolar é o voo :" + x);
        aero.listaVoos();
        entrada.close();
    }
}
