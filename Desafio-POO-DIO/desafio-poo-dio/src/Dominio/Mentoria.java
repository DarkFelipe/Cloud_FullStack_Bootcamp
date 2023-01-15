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

public class Mentoria extends Conteudo{  // extends - significa que é uma extensão da classe mãe Conteudo. 

    //atributos da classe

   //Colocando os atributos privados, eu só posso acessá-los através de um método. Neste caso, são os get e set. 
    
    private LocalDate data; //LocalDate e LocalDateTime são classes importantes para trabalhar com data.  
   
    
    
    @Override
    public double calcularXP() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d; // adicionando 20 
    }

    public Mentoria() {
    }

        
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }
    
    

    
    
}
