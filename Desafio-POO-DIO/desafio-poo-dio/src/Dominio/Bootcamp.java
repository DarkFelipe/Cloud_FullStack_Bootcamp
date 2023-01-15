package Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFInal = dataInicial.plusDays(45); //o final é 45 dias depois do que começou.
    
    private Set<Dev> devsIncristos = new HashSet<>(); // ordem irrelevante de inscrição.
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // a ordem de conteúdos adicionados importa no bootcamp.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }
    public LocalDate getDataFInal() {
        return dataFInal;
    }
    public void setDataFInal(LocalDate dataFInal) {
        this.dataFInal = dataFInal;
    }
    public Set<Dev> getDevsIncristos() {
        return devsIncristos;
    }
    public void setDevsIncristos(Set<Dev> devsIncristos) {
        this.devsIncristos = devsIncristos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFInal == null) ? 0 : dataFInal.hashCode());
        result = prime * result + ((devsIncristos == null) ? 0 : devsIncristos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFInal == null) {
            if (other.dataFInal != null)
                return false;
        } else if (!dataFInal.equals(other.dataFInal))
            return false;
        if (devsIncristos == null) {
            if (other.devsIncristos != null)
                return false;
        } else if (!devsIncristos.equals(other.devsIncristos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

    

    

    


}
