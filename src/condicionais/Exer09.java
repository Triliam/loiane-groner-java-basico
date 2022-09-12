package condicionais;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {

        String letra;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a letra escolhida");
        letra = scan.next();

        //if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
        //   System.out.println("A letra escolhida é uma vogal");
        // } else {
        //    System.out.println("A letra escolhida é consoante");
        // }

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("vogal");
                break;
            default:
                System.out.println("consoante");
        }
    }
}
