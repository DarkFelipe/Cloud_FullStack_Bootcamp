package Dominio;

import java.time.LocalDate;

/* modificadores de acesso:
 * É uma boa prática colocar na frente do atributos,
 * os modificadores de acesso. 
 * 
 * Private - só essa classe tem acesso
 * Protect - A classe e suas filhas tem acesso
 * Public - Tudo tem acesso
 */

public class Mentoria {

    //atributos da classe

    private String titulo; //Colocando os atributos privados, eu só posso acessá-los através de um método. Neste caso, são os get e set. 
    private String descricao;
    private LocalDate data; //LocalDate e LocalDateTime são classes importantes para trabalhar com data.  
   
    
    
    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }
    
    

    
    
}
