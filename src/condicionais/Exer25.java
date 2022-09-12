package condicionais;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        boolean telefonema;
        boolean localCrime;
        boolean proximidade;
        boolean divida;
        boolean trabalho;

        Scanner scan = new Scanner(System.in);
        System.out.println("Responda: true para afirmar, e false para negar");
        System.out.println("Telefonou para a vitima?");
        telefonema = scan.nextBoolean();
        System.out.println("Esteve no local do crime?");
        localCrime = scan.nextBoolean();
        System.out.println("Mora perto da vitima?");
        proximidade = scan.nextBoolean();
        System.out.println("Devia para a vitima?");
        divida = scan.nextBoolean();
        System.out.println("Ja trabalhou com a vitima?");
        trabalho = scan.nextBoolean();

        int cont = 0;
        if (telefonema) {
            cont = cont + 1;
        }
        if (proximidade) {
            cont = cont + 1;
        }
        if (localCrime) {
            cont = cont + 1;
        }
        if (divida) {
            cont = cont + 1;
        }
        if (trabalho) {
            cont = cont + 1;
        }
        if (cont == 2) {
            System.out.println("suspeita");
        }
        if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        }
        if (cont == 5) {
            System.out.println("Culpada");
        }
        if (cont == 0) {
            System.out.println("inocente");
        }
    }
}
