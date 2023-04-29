package br.com.targettrust.exemplos.dia06;

public class ExemplosIncrementos {

    public static void main(String[] args) {
        //incrementar();
        decrementar();
    }

    static void incrementar() {

        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        int i = 0;
        System.out.println(numeros[i++]);

        System.out.println("Incremento: ");

        int contador = 5;
        System.out.println(contador++); // Escreve na tela 5, pois o incremento acontece depois do print
        // contador == 6
        System.out.println(++contador); // Escreve na tela 7

        contador++; // mais usado
        System.out.println(contador); // 8
        ++contador;// menos usado
        System.out.println(contador);// 9
    }

    static void decrementar(){

        System.out.println("Decremento: ");

        int contadorDecre = 10;

        //int numero1 = contadorDecre;
        //contadorDecre = contadorDecre - 1;
        int numero1 = contadorDecre--;

        System.out.println(contadorDecre); // 9
        System.out.println(numero1); // Escreve na tela 10, pois o decremento acontece depois da atribuição


        //contadorDecre = contadorDecre - 1;
        //numero2 = contadorDecre
        int numero2 = --contadorDecre; // Vai decrementar o valor antes de atribuir para a variável
        System.out.println(contadorDecre); // 8
        System.out.println(numero2); // 8
    }

}
