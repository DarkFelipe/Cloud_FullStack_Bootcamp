package Dominio;

public class Curso extends Conteudo{
    //Atributos da classe

    
    private int cargaHoraria;
    
    
    @Override
    public double calcularXP() {
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria; //Criada uma regra de negócio
    }

    public Curso() {
    }
   
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    


}
