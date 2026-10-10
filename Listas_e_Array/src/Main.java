// Conceito de coleções: a interface List
//
// List é uma INTERFACE: ela diz O QUE uma lista sabe fazer
// (add, get, remove, size...), mas não diz COMO.
// Quem diz o COMO são as classes que implementam List:
//
//   Classe       | Por dentro      | get(i)  | add/remove no início | Várias threads
//   -------------|-----------------|---------|----------------------|---------------
//   ArrayList    | array           | rápido  | lento                | não
//   LinkedList   | nós ligados     | lento   | rápido               | não
//   Vector       | array           | rápido  | lento                | sim (mais lento)
//
// Por isso escrevemos  List<String> test = new ArrayList<>();
// A variável é do tipo List, então dá para trocar a implementação
// (new LinkedList<>(), new Vector<>()) sem mudar o resto do código.
//
// <String> é o "generics": diz que a lista só aceita String.
// Sem ele (List test) a lista aceita qualquer coisa misturada.
public class Main {
    public static void main(String[] args) {
        ExemploArrayList.executar();
        ExemploArrayList.executar2();
        ExemploLinkedList.executar();
        ExemploVector.executar();
    }
}
