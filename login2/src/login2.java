import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class login2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cont = 0;

        System.out.println(" Digite seu login: ");
        String login = scanner.nextLine();

        //---------------------------------------------

        while (cont >= 0) {

            System.out.println(" Digite sua senha: ");
            String senha = scanner.nextLine();


            if (senha.length() < 8) {
                System.out.println("Sua senha precisa ter 8 caracteres!");

            }
            String senha1 = senha.toLowerCase();

            if (senha.equals(senha1)) {
                System.out.println("A senha não tem letra maiuscula");

            }

            String senha3 = senha.toUpperCase();

            if (senha.equals(senha3)) {
                System.out.println("A senha não tem letra minuscula");

            }

            if (senha.contains("0") || senha.contains("1") || senha.contains("2") || senha.contains("3") || senha.contains("4") || senha.contains("5") ||
                    senha.contains("6") || senha.contains("7") || senha.contains("8") || senha.contains("9") || senha.contains("#")) {

            } else {
                System.out.println("Senha precisa conter números");

            }

            if (senha.contains("#")) {

            } else {
                System.out.println("Senha precisa de um caracter especial");

            }
                System.out.println("Bem vindo ao sistema ;)");
                return;


            }
            cont++;
        }

    }















