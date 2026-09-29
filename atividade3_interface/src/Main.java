import java.util.List;
/*1 - Escreva um código para enviar mensagens de marketing, para isso você
deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes,
esses serviços devem ter um método para receber a mensagem como parâmetro,
os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp;
*/
public class Main {
    public static void main(String[] args) {
        String mensagem = "Promoção: 50% de desconto só hoje!";

        List<Mensagem> servicos = List.of(new SMS(), new Email(), new RedesSociais(), new WhatsApp());

        for (Mensagem servico : servicos) {
            servico.enviarMensagem(mensagem);
        }
    }
}
