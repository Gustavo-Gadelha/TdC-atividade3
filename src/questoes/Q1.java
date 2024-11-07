package questoes;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(pertenceLinguagem("aaa"));
        System.out.println(pertenceLinguagem("bbb"));
        System.out.println(pertenceLinguagem("ab"));
        System.out.println(pertenceLinguagem(""));
    }

    public static boolean pertenceLinguagem(String cadeia) {
        if (cadeia.isEmpty()) {
            return false;
        }

        char primeiroCaractere = cadeia.charAt(0);

        if (primeiroCaractere == 'a') {
            for (char c : cadeia.toCharArray()) {
                if (c != 'a') {
                    return false;
                }
            }
            return true;
        } else if (primeiroCaractere == 'b') {
            for (char c : cadeia.toCharArray()) {
                if (c != 'b') {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
