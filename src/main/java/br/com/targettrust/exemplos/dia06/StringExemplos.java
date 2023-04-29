package br.com.targettrust.exemplos.dia06;

public class StringExemplos {

    public static void main(String[] args) {

        // Declaração literal de String no Java
        String curso = "Java Developer e Oracle";

        //Verificando tamanho
        int tamanhoString = curso.length();

        //Limpando Espaços do inicio e final
        curso = curso.trim();

        //Quebrando em partes
        String[] partes = curso.split( " ");

        String empresa = "Empresa XYZ" ;

        // Formantando uma String
        // https://www.javatpoint.com/java-string-format
        String texto = String.format( "Aula de %s na %s" , curso, empresa);
        System.out.println(texto);

        double numero = 10.1003;
        String numeroFormatado = String.format("%.2f", numero);
        System.out.println(numeroFormatado);


        // https://www.w3schools.com/java/java_strings.asp
        // https://www.w3schools.com/java/java_strings_concat.asp
    }
}
