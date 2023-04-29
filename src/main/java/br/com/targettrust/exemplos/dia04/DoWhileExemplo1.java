package br.com.targettrust.exemplos.dia04;

public class DoWhileExemplo1 {

    public static void main(String[] args) {

        // Rodar exemplo com "i" valendo 0
        // E se começar com 4 o valor de "i"?
        System.out.println("Primeiro exemplo do while");
        int i = 3;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i <= 3);
    }

}
