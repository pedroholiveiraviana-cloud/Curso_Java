public record RedesSociais() implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por Redes Sociais: " + mensagem);
    }
}
