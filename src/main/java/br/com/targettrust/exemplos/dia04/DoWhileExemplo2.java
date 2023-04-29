package br.com.targettrust.exemplos.dia04;

public class DoWhileExemplo2 {

    public static void main(String[] args) {

        System.out.println("Segundo exemplo do while");
        // Com símbolo de !=
        // Rodar exemplo com "i" valendo 0
        // E se começar com 3 o valor de "i"?
        int x = 3;
        do {
            System.out.println(x);
            x = x + 1;

        } while (x != 3);
    }
}
