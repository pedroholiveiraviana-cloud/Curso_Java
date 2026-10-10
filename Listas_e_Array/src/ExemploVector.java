import java.util.List;
import java.util.Vector;

// Vector: funciona quase igual ao ArrayList (também usa um array por dentro).
// A diferença é que o Vector é SINCRONIZADO: seus métodos são protegidos
// para várias threads usarem a lista ao mesmo tempo sem bagunçar os dados.
//
// Vantagens:
//   - Seguro para uso com várias threads (thread-safe).
// Desvantagens:
//   - Mais lento que o ArrayList, por causa da sincronização,
//     mesmo quando você só usa uma thread.
//   - É uma classe antiga (Java 1.0). Hoje quase não se usa;
//     para várias threads costuma-se usar outras opções, como
//     Collections.synchronizedList(...) ou CopyOnWriteArrayList.
public class ExemploVector {

    public static void executar() {
        System.out.println("===== Vector =====");

        List<String> test = new Vector<>();

        // Mesmos métodos de sempre, porque também implementa List
        test.add("pedro");
        test.add("joao");
        test.add(0, "ana");

        System.out.println("Posição 1: " + test.get(1));
        System.out.println("Tamanho: " + test.size());
        test.forEach(System.out::println);
        System.out.println();
    }
}
