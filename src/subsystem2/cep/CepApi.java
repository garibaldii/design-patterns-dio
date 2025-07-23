package subsystem2.cep;

import one.digitalinovation.gof.singleton.EagerSingleton;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        if (instance == null) {
            instance = new CepApi();
        }

        return instance;
    }

    public String getCity(String cep) {
        return "Sorocaba";
    }

    public String getState(String cep) {
        return "São Paulo";
    }
}
