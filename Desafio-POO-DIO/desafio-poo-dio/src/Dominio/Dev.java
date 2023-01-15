package Dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>(); // LinkedHashSet serve para colocar na ordem que foi inserido.
    private Set<Conteudo> conteudosConluidos = new LinkedHashSet<>(); // Não utilizo arraylist, para não permitir a repetição de inscrição e concl

    // nos dois exemplos acima, utilizei herança de conteudo e o polimorfismo de Set. 

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir() {}

    public void calcularTotalXP() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConluidos() {
        return conteudosConluidos;
    }

    public void setConteudosConluidos(Set<Conteudo> conteudosConluidos) {
        this.conteudosConluidos = conteudosConluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
        result = prime * result + ((conteudosConluidos == null) ? 0 : conteudosConluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosIncritos == null) {
            if (other.conteudosIncritos != null)
                return false;
        } else if (!conteudosIncritos.equals(other.conteudosIncritos))
            return false;
        if (conteudosConluidos == null) {
            if (other.conteudosConluidos != null)
                return false;
        } else if (!conteudosConluidos.equals(other.conteudosConluidos))
            return false;
        return true;
    }

    // pesquisar sobre coleções de equals e hashcode

    

    

    


}
