package Controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves {
    private List<Integer> listaAeronaves = new ArrayList<>();

    public void addVoo(Integer numVoo) {
        listaAeronaves.add(numVoo);
    }
    public Integer primeiroVoo() {
        if(listaAeronaves.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return listaAeronaves.get(0);
    }
}
