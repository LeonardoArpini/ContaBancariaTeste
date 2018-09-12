
package JogoHerança;

import javax.swing.JOptionPane;



public class Pontuacao {
    
    int pontos;
    
    String quebraLinha = System.getProperty("line.separator");
    
    void verificarQuestão(Questao questao){
        pontos += questao.pontos;
    }
    
    void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, "Sua pontução total foi de:   " + pontos + ".\r\n Parabéns!!!!!");
    }
    
}
