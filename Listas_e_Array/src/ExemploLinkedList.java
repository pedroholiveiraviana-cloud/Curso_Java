import java.util.LinkedList;
import java.util.List;

// LinkedList: guarda os elementos como "nós" ligados entre si.
// Cada nó sabe quem é o anterior e quem é o próximo (lista duplamente ligada).
//
//   [ana] <-> [pedro] <-> [joao]
//
// Vantagens:
//   - Adicionar ou remover no INÍCIO ou no FINAL é muito rápido,
//     porque só troca as "ligações", não empurra ninguém.
// Desvantagens:
//   - Buscar por posição (get(i)) é lento, porque precisa ir
//     andando de nó em nó até chegar no índice.
//   - Gasta mais memória (cada nó guarda as ligações).
//   - NÃO é sincronizada.
public class ExemploLinkedList {

    public static void executar() {
        System.out.println("===== LinkedList =====");

        // Usando a interface List, os métodos são os MESMOS do ArrayList.
        // Só muda o jeito que a lista funciona por dentro.
        List<String> test = new LinkedList<>();

        test.add("pedro");
        test.add("joao");
        test.add(0, "ana"); // no LinkedList adicionar no início é rápido

        System.out.println("Posição 1: " + test.get(1)); // funciona, mas é mais lento

        // Se a variável for do tipo LinkedList (e não List),
        // você ganha métodos extras para mexer nas pontas da lista:
        LinkedList<String> fila = new LinkedList<>();
        fila.addFirst("primeiro"); // adiciona no começo
        fila.addLast("ultimo");    // adiciona no final
        System.out.println("Primeiro: " + fila.getFirst());
        System.out.println("Último: " + fila.getLast());
        fila.removeFirst();        // remove do começo

        System.out.println("Tamanho: " + test.size());
        test.forEach(System.out::println);
        System.out.println();
    }
}
