package Dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; //final é um tipo de constante, pesquisar mais depois.
    //protected - todas as filhas da classe conteúdo, terão acesso a ela. 

    private String titulo;
    private String descricao;

    public abstract double calcularXP();
    //abstract - significa que você não consegue criar um objeto conteúdo. 

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

    //estou criando uma classe mãe, para criar classes filhas com o mesmo padrão da mãe (Utilizando o conceito de herança)

    
}
