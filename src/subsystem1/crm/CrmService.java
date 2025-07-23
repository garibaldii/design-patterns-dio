package subsystem1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String state, String city) {
        System.out.println(name);
        System.out.println(cep);
        System.out.println(state);
        System.out.println(city);

        System.out.println("Client saved on CRM System.");
    }
}
