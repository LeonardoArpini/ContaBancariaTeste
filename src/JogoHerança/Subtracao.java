
package JogoHerança;


import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class Subtracao extends Questao {
    int operador1;
    int operador2;
    int pontos;
    int resposta;
    
    void criarPergunta(){
       this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
       this.operador2 = ThreadLocalRandom.current().nextInt(0,20);
       String resultado = JOptionPane.showInputDialog("Quanto é " + this.operador1 + "-" + this.operador2 + "?");
       resposta = Integer.parseInt(resultado);
       verificarResposta();
    }
    
    @Override
    public boolean verificarResposta(){
        if (this.operador1 - this.operador2 == this.resposta){
            exibirResposta(true);
            return true;
            
       }else{
           exibirResposta(false);
           return false;
        }
    }
}
