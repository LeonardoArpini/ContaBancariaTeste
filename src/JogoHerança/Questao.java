
package JogoHerança;

import javax.swing.JOptionPane;


public abstract class Questao {
    int operador1;
    int operador2;
    int pontos;
    int resposta;
    
    private void Questao(){
      
    }
    
    
    public abstract boolean verificarResposta();
    
    
    void exibirResposta(boolean resultado){
        if (resultado == true){
           JOptionPane.showMessageDialog(null,"Muito bem, resposta correta!");
           pontos = 1;
       }else{
           JOptionPane.showMessageDialog(null,"Que pena, resposta errada!");
           pontos = 0;
       }
    }
    
}
