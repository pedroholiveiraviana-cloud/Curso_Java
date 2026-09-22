package keyword;

public class Manager extends Client{

    public Manager() {
        this.setNome("pedro") ;
        // subclasse acessa membros protected da superclasse mesmo em pacotes diferentes pela relação de herença
        // com o modificador default (sem pacote em comum) isso não funcionaria
        // mas tambem pois a o protected so da acesso a classe que estão mo mesmo nivel mesmo não herdando

    }
}
