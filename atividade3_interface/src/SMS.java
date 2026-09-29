public record SMS() implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }
}
