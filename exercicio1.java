
package metodos;

import javax.swing.JOptionPane;

public class exercicio1 {
    
    public static void main(String[] args) {
        String resultado = classificacao(entrada());
        mensagem(resultado);
    }
    
    public static int entrada(){
        return Integer.parseInt(JOptionPane.showInputDialog("Idade"));
    }
    
    public static String classificacao(int idade){
        if (idade >=0 && idade <=2){
            return "bebê";
        }else if (idade >=3 && idade <=11){
            return "criança";
        }else if (idade >=12 && idade <=19){
            return "adolescente";
        }else if (idade >=20 && idade <=30){
            return "jovem";
        }else if (idade >=31 && idade <=60){
            return "adulto";
        }else if (idade >60){
            return "idoso";
        }else{
            return "idade inválida";
        }
    }
    
    public static void mensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

