package one.digitalinnovation.gof.facade;

import Subsistema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {


    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep); //usamos os metodos para adcionar valor aos atributos dos métodos abaixo.
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
