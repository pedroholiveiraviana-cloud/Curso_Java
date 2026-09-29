public record Email() implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por E-mail: " + mensagem);
    }
}
