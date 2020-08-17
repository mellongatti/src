import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class login2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        String usuario = nome.charAt(0)+"_"+sobrenome;

        boolean valido = true;
        String senha = null;

        while (valido){
            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine();

            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                System.out.println("Cadastrado com sucesso!");
                valido = false;

            }else{
                System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres - ! @, e ter mais que 7 caracteres!");

            }
        }


        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);

        //---------------------------------------------
            boolean valido1 = true;

            while (valido1) {

                System.out.println(" Digite seu login: ");
                String login = scanner.nextLine();

                System.out.println(" Digite sua senha: ");
                String senha2 = scanner.nextLine();

                if (login.equals(usuario) && senha.equals(senha2)) {
                    System.out.println("Logado com sucesso!");
                    valido1 = false;

                }
                
            else{
                    System.out.println("Dados incorretos, digite novamente!");
                }





        }

    }

}
