package Dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // LinkedHashSet serve para colocar na ordem que foi inserido.
    private Set<Conteudo> conteudosConluidos = new LinkedHashSet<>(); // Não utilizo arraylist, para não permitir a repetição de inscrição e concl

    // nos dois exemplos acima, utilizei herança de conteudo e o polimorfismo de Set. 

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // add todos os conteúdos do bootcamp para o inscrito
        // addAll = pego tudo de conteudo e add em conteudosIncritos
        bootcamp.getDevsIncristos().add(this); // adicionar o inscrito no argumento bootcamp
    }

    public void progredir() {
       Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();

       //Optional serve para resolver os retornos nulos.

        if(conteudo.isPresent()){
            this.conteudosConluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println();
        } 
       
    }

    public double calcularTotalXP() {
        return this.conteudosConluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosInscritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
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
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
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
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
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
