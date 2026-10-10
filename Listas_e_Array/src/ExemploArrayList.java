import java.util.ArrayList;
import java.util.List;

// ArrayList: guarda os elementos dentro de um array (vetor) que cresce sozinho.
// É a lista mais usada no dia a dia.
//
// Vantagens:
//   - Buscar por posição (get(i)) é muito rápido, porque vai direto no índice.
//   - Adicionar no FINAL da lista é rápido.
// Desvantagens:
//   - Adicionar ou remover no INÍCIO/MEIO é lento, porque precisa
//     "empurrar" todos os elementos que vêm depois.
//   - NÃO é sincronizada (não é segura para várias threads ao mesmo tempo).
public class ExemploArrayList {

    public static void executar() {
        System.out.println("===== ArrayList =====");

        // List<String> -> o tipo da variável é a interface List
        // new ArrayList<>() -> a implementação escolhida é ArrayList
        List<String> test = new ArrayList<>();

        // add: adiciona no final
        test.add("pedro");
        test.add("maria");
        test.add("joao");

        // get: pega pelo índice (começa em 0) -> rápido no ArrayList
        System.out.println("Posição 1: " + test.get(1));

        // add(índice, valor): adiciona numa posição específica
        // (no ArrayList isso empurra "maria" e "joao" uma casa para frente)
        test.add(0, "ana");

        // remove pelo valor
        test.remove("maria");

        // size: quantidade de elementos
        System.out.println("Tamanho: " + test.size());

        // percorrendo a lista
        test.forEach(System.out::println);
        System.out.println();
    }
    public static void executar2() {
        System.out.println("===== ArrayList Classes =====");
        // criando uma lista de objetos User
        List<User> users = new ArrayList<>();

        // adicionando usuários na lista
        users.add(new User("Pedro", "19/08/2008" ));
        users.add(new User("Henrique", "19/08/2032" ));
        users.add(new User("Lucas ", "19/08/2090" ));

        // verificando se existe um usuário com o nome "Pedro"
        // (contains("Pedro") não funciona, pois compara User com String)
        //
        // users.stream(): transforma a lista em um fluxo (Stream), onde os
        //   elementos passam um por um, como numa esteira. A lista não é alterada.
        //
        // anyMatch(...): pergunta "existe pelo menos um que atende a condição?"
        //   - retorna true se encontrar algum (e para no primeiro que achar)
        //   - retorna false se nenhum atender
        //
        // u -> u.getNome().equals("Pedro"): é uma lambda (função curta).
        //   Lê-se: "para cada usuário u, o nome dele é igual a Pedro?"
        //
        // Equivalente com for:
        //   boolean achou = false;
        //   for (User u : users) {
        //       if (u.getNome().equals("Pedro")) {
        //           achou = true;
        //           break;
        //       }
        //   }
        //
        // Parecidos: allMatch (todos atendem?), noneMatch (nenhum atende?),
        //   filter (devolve só os que atendem)
        System.out.println(users.stream().anyMatch(u -> u.getNome().equals("Pedro")));
    }

}
