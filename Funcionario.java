

package exercicio06;

import java.time.LocalDate;


public class Funcionario {
    
    private String nome;
    private double salario;
    private int ano;
    
    public String getNome(){
        return this.nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    private double getBonificacao(){
        int tempo = LocalDate.now().getYear() - this.ano;
        if(tempo >5 && tempo <=10){
            return 0.05;
        }else if (tempo > 10 && tempo <=20){
            return 0.10;
        } else if (tempo >20)
            return 0.2;
        else 
            return 0.0;
    }
    
    private double getSalarioTotal(){
        return this.salario + (this.salario*getBonificacao());
    }
    
    public void setNome(String nome){
        if (nome.length() >=3){
            this.nome = nome;
        }else 
            System.err.println("O nome é inválido!");
    }
    
    public void setSalario(double salario){
        if(salario>=0){
            this.salario = salario;
        } else 
            System.err.println("O valor do salário é inválido!");
    }
    
    public void setAno(int ano){
        if(ano>=2000 && ano<=LocalDate.now().getYear()){
            this.ano=ano;
        }else 
            System.err.println("O ano inserido é inválido!");
    }
    
    @Override
    public String toString(){
        return String.format(
            "\nNome...........: %s" +
            "\nSalário........: %.2f" +
            "\nAno contratação: %d" +
            "\nSalário Total..: %.2f",
            this.getNome(),this.getSalario(), this.getAno(),
            this.getSalarioTotal()
        );
                
    }
}
