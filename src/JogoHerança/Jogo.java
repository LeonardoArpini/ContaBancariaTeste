
package JogoHerança;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class Jogo {
    
    public void iniciaJogo(){
        Adicao questaoAdi = new Adicao();
        Subtracao questaoSub = new Subtracao();
        Multiplicacao questaoMult = new Multiplicacao();
        Pontuacao pontos = new Pontuacao();
        String option = "Sim";
        String option1 = "Sim";
        int aleatorio;
        
        
        while(option.equalsIgnoreCase(option1) || option1.equalsIgnoreCase("s")){
            aleatorio = ThreadLocalRandom.current().nextInt(0,3);
            switch (aleatorio) {
                case 0:
                    questaoAdi.criarPergunta();
                    pontos.verificarQuestão(questaoAdi);
                    break;
                case 1:
                    questaoSub.criarPergunta();
                    pontos.verificarQuestão(questaoSub);
                    break;
                case 2:
                    questaoMult.criarPergunta();
                    pontos.verificarQuestão(questaoMult);
                    break;
            }
            option1 = JOptionPane.showInputDialog(null,"Deseja continuar a jogar? (Sim/Não): ");
        }
        
        pontos.exibirPontuacao();
    }
    
}
