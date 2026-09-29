public record Cultura(double valor) implements Produto {


    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getImposto() {
        return valor * 0.04;
    }
}
