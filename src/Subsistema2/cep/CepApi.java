package Subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();  // 1 -Criamos uma instancia da classe e ja instanciamos aqui mesmo, sem fazer verificação.

    private CepApi(){                                        //2 - Criamos um construtor
        super();
    }
    public static CepApi getInstancia(){                     //3-Criamos um método pubrico para poder utilizar a instancia externamente, não usamos if aqui diferente da Lazy que usa.

        return instancia;
    }

    public String recuperarCidade(String cep){              //ja que criamos um singleton aqui podemos criar estes métodos publicos que a classe que usar esta classe tera acesso aos métodos.
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
