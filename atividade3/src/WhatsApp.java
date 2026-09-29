public record WhatsApp() implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por WhatsApp: " + mensagem);
    }
}
