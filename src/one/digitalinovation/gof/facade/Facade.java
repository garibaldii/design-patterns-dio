package one.digitalinovation.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

//responsável por criar uma interface mais amigável para o consumo de outros clientes
public class Facade {

    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        CrmService.saveClient(name, cep, state, city);
    }
}
