import java.util.Scanner;

/*
* 2 - Escreva um código que calcule o valor de tributos de produtos, os produtos
* disponíveis devem ser dos seguintes tipos: Alimentação, Saude e bem estar, Vestuário
* e Cultura. Todos os produtos devem ter um método para retornar o seu valor de imposto, de acordo com seu tipo:

Alimentação 1%;
Saude e bem estar 1.5%;
Vestuário 2.5%;
Cultura 4%.
* */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int option = -1;
        while (option != 0){
            System.out.println("Escolha o tipo do produto");
            System.out.println("1- Alimentacao");
            System.out.println("2- Saude e bem estar");
            System.out.println("3- Vestuario");
            System.out.println("4- Cultura");
            System.out.println("0- Sair");
            System.out.println("Escolha o numero:");
            option = scanner.nextInt();
            if (option < 1 || option > 4){
                if (option != 0) System.out.println("Opcao invalida");
                continue;
            }
            var valor = readValor();
            Produto produto = switch (option){
                case 1 -> new Alimentacao(valor);
                case 2 -> new SaudeBemEstar(valor);
                case 3 -> new Vestuario(valor);
                default -> new Cultura(valor);
            };
            System.out.printf("Valor do produto: R$ %.2f%n", produto.getValor());
            System.out.printf("Valor do imposto: R$ %.2f%n", produto.getImposto());
        }
    }
    private static double readValor(){
        System.out.println("informe o valor do produto");
        return scanner.nextDouble();
    }
}
