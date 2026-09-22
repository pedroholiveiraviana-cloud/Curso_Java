import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Cria uma lista imutável de usuários usando o método utilitário List.of
        var users = List.of(
                new User("maria", 21),
                new User("pedro", 23),
                new User("eduardo", 29),
                new User("ana", 89)
        );

        /*
         1. Sintaxe com bloco e chaves {} (ideal quando há mais de uma linha de código)
         O forEach é um método padrão da interface Iterable (implementada por List, Set, etc.) e também da interface Stream,
          usado para percorrer elementos sem precisar de um laço for explícito.
          Ele recebe uma expressão lambda (que implementa a interface funcional Consumer<T>) e a aplica a cada elemento.
        */
        // Imprime o 'user' atual da iteração
        users.forEach(System.out::println);

        // 2. Sintaxe simplificada (como há apenas 1 instrução, chaves e ';' interno são opcionais)
        // users.forEach(user -> System.out.println(user));

        // 3. Sintaxe com Method Reference (forma mais enxuta equivalente à lambda acima)
        // users.forEach(System::println);
        printStringValues(User::name,users);
        printStringValues(user -> String.valueOf(user.age()),users);
        printStringValues(String::valueOf,users);
    }
    private static void printStringValues(Function<User,String>callback,List<User> users){
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}

// Exemplo da estrutura do objeto User utilizando Record (Java 14+)
// O Record gera automaticamente construtor, getters, equals, hashCode e o toString()
