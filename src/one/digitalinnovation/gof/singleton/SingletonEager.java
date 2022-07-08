package one.digitalinnovation.gof.singleton;

/*SingletonEager ou rapido*/

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();  // 1 -Criamos uma instancia da classe e ja instanciamos aqui mesmo, sem fazer verificação.

    private SingletonEager(){                                        //2 - Criamos um construtor
            super();
        }
    public static SingletonEager getInstancia(){                     //3-Criamos um método pubrico para poder utilizar a instancia externamente, não usamos if aqui diferente da Lazy que usa.

        return instancia;
    }
}
