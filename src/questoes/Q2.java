package questoes;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int tamanho = 10;
        List<String> cadeias = gerarCadeias(tamanho);

        System.out.println("Cadeias de comprimento " + tamanho + ":");
        for (String cadeia : cadeias) {
            System.out.println(cadeia);
        }
    }

    public static List<String> gerarCadeias(int tamanho) {
        List<String> cadeias = new ArrayList<>();
        gerar(cadeias, tamanho, "S", "");
        return cadeias;
    }

    private static void gerar(List<String> cadeias, int comprimento, String simbolo, String atual) {
        if (atual.length() == comprimento) {
            cadeias.add(atual);
            return;
        }

        if (atual.length() > comprimento) {
            return;
        }

        switch (simbolo) {
            case "S":
                gerar(cadeias, comprimento, "A", "a" + atual); // S → aA
                gerar(cadeias, comprimento, "B", "b" + atual); // S → bB
                gerar(cadeias, comprimento, "ε", "c" + atual); // S → c
                break;
            case "A":
                gerar(cadeias, comprimento, "A", "a" + atual); // A → aA
                gerar(cadeias, comprimento, "ε", atual); // A → ε
                break;
            case "B":
                gerar(cadeias, comprimento, "B", "b" + atual); // B → bB
                gerar(cadeias, comprimento, "ε", atual); // B → ε
                break;
            case "ε":
                break;
        }
    }
}
