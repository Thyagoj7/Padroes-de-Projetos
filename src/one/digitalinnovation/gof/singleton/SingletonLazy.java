package one.digitalinnovation.gof.singleton;

/*Singleton Lazy*/

public class SingletonLazy {

    private static SingletonLazy instancia;             // 1 -Criamos uma instancia da classe mas nao instanciamos

    private SingletonLazy(){                            //2 - Criamos um construtor
        super();
    }
    public static SingletonLazy getInstancia(){         //3-Criamos um método pubrico para poder utilizar a instancia externamente
        if(instancia == null){
            instancia = new SingletonLazy();            //4 - Criamos um if para garantir que a instancia sera usada uma unica vez.A classe é instanciada na verificação do if.

        }
        return instancia;
    }
}
