package br.com.targettrust.exemplos.dia05;

public class InterrupcoesLacos {

    public static void main(String[] args) {

        //exemploReturnComFor();
        //exemploForNormal();
        //exemploBreakComFor();
        //exemploContinueComFor();

        String nome = exemploReturnComFor2();
        System.out.println(nome);
    }
    public static void exemploForNormal() {

        System.out.println("Início do for 1");

        // inicialização: int i = 0 -> vai ser executado no começo do for
        // expressão: i < 10 -> vai ser executado a partir do começo do for
        // incremento: i++ -> vai ser executado após cada execução do código dentro do for
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

        /*int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }*/

        System.out.println("Final do for 1");

        System.out.println("Início do for 2");

        int[] arrayInt = new int[]{10, 20, 30, 45, 50, 67, 70, 88, 999, 101};
        /*arrayInt[0]
        arrayInt[1]
        arrayInt[2]*/
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        System.out.println("Final do for 2");
    }

    public static void exemploContinueComFor() {

        System.out.println("Início do método");

        for (int i = 0; i < 10; i++) {

            if(i == 3) {
                continue;
            } else if (i == 8) {
                continue;
            } else if (i == 10) {
                continue;
            } else {
                System.out.println("");
            }

            System.out.println(i);
        }

        System.out.println("Final do método");
    }

    public static void exemploBreakComFor() {
        System.out.println("Início do método");

        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Final do método");
    }

    public static void exemploReturnComFor() {

        System.out.println("Início do método");

        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                return;
            }

            System.out.println(i);
        }

        System.out.println("Final do método");
    }

    public static String exemploReturnComFor2() {

        System.out.println("Início do método");

        String[] nomes = new String[]{"Thiago", "Paulo", "Marcos", "Daniel"};

        for (int i = 0; i < nomes.length; i++) {

            if(i == 2) {
                String nome = nomes[2];
                if(!nome.isEmpty()) {
                    return nome;
                }
            }
        }

        System.out.println("Final do método");

        return null;
    }
}
