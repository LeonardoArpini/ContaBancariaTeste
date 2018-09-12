/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoHerança;


import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0367
 */
public class Multiplicacao extends Questao {
    int operador1;
    int operador2;
    int pontos;
    int respostas;
    
    private void Multiplciacao(){
      //this.pontos = 2;
    }
    void criarPergunta(){
       this.operador1 = ThreadLocalRandom.current().nextInt(0,10);
       this.operador2 = ThreadLocalRandom.current().nextInt(0,10);
       String resposta = JOptionPane.showInputDialog("Quanto é " + this.operador1 + "*" + this.operador2 + "?");
       respostas = Integer.parseInt(resposta);
       verificarResposta();
    }
    
    @Override
    public boolean verificarResposta(){
        if (this.operador1 * this.operador2 == this.respostas){
            exibirResposta(true);
            return true;
            
       }else{
           exibirResposta(false);
           return false;
       }
        
    }

    
  

    
}
