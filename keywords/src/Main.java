import keyword.*;

public class Main {
    // classe/membro default (sem modificador) só é visível dentro do mesmo pacote
    static void main(String[] args) {
      var user = new Client();
      user.test_defalt();
      // Main está fora do pacote "keyword", por isso não acessa Address diretamente (ela é default)
      // Client está no mesmo pacote que Address, então uso Client como intermediário
    }

}
