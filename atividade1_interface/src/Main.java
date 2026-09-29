import java.util.Scanner;

// 3 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas
// devem ter um método que retorne esse valor, as formas geométricas disponíveis devem ser as seguintes:
//
//Quadrado: possui o valor dos seus lados;
//Retângulo: possui os valores de base e altura;
//Circulor: possui o atributo raio.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void  main(String[] args){
        int option = -1 ;
        while (option != 0){
            System.out.println("Escolha a formula geometrica para ser calculada");
            System.out.println("1- Quadrado");
            System.out.println("2- Retangulo");
            System.out.println("3- Circulo");
            System.out.println("0- Sair");
            System.out.println("Escolha o numero:");
            option = scanner.nextInt();
            GeometricForn form = switch (option){
                case 1 -> creatSquare();
                case 2 -> creatRectangle();
                case 3 -> creatCircle();
                default -> null;
            };
            if (form != null){
                System.out.printf("A area da forma e: %.2f%n", form.getArea());
            } else if (option != 0){
                System.out.println("Opcao invalida");
            }
        }
    }
    private static GeometricForn creatSquare(){
        System.out.println("informe o valor do lado do quadrado");
        var side = scanner.nextDouble();
        return new Square(side);
    }
    private static GeometricForn creatRectangle(){
        System.out.println("informe a altura do retangulo");
        var height = scanner.nextDouble();
        System.out.println("informe a base do retangulo");
        var width = scanner.nextDouble();
        return new Rectangle(height, width);
    }
    private static GeometricForn creatCircle(){
        System.out.println("informe o raio do circulo");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }

}
