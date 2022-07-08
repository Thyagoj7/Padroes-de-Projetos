package one.digitalinnovation.gof.strategy;

public class ComportamentoAtaque implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Movendo-se ao ataque");
    }
}
