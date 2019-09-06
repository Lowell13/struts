package tpstruts.modele;

import java.util.ArrayList;
import java.util.List;

import tpstruts.javabeans.Client;

public class ClientModel {

    private static List<Client> listClient;
    private static int id = 1;

    static {
        listClient = new ArrayList<>();
        listClient.add(new Client(id++, "jlafosse", "jerome"));
        listClient.add(new Client(id++, "astapane", "amelie"));
        listClient.add(new Client(id++, "amartin", "alain"));
        listClient.add(new Client(id++, "pleroy", "pierre"));
    }

    public ClientModel() {
    }

    /*---------------------*/
    /* GETTERS AND SETTERS */
    /*---------------------*/

    public static List<Client> getListClient() {
        return listClient;
    }

    public static void setListClient(List<Client> listClient) {
        ClientModel.listClient = listClient;
    }

    /*-----------*/
    /* FUNCTIONS */
    /*-----------*/

    /**
     * Add a client to the list
     *
     * @param client Client to add
     */
    public static void add(Client client) {
        client.setIdClient(id++);
        listClient.add(client);
    }

    /**
     * Delete a client in the list
     *
     * @param idClient Client's ID to delete
     */
    public static void delete(int idClient) {
        for (int i = 0; i < listClient.size(); i++) {
            Client c = listClient.get(i);
            if (c.getIdClient() == idClient) {
                listClient.remove(c);
            }
        }
    }

    /**
     * Edit a client in the list
     *
     * @param client Product to edit
     */
    public static void edit(Client client) {
        int idClient = client.getIdClient();
        for (int i = 0; i < listClient.size(); i++) {
            Client c = listClient.get(i);

            if (c.getIdClient() == idClient) {
                c.setName(client.getName());
                c.setPassword(client.getPassword());
                break;
            }
        }
    }

    /**
     * Find a product in the list
     *
     * @param idClient Client's ID to find
     * @return Client, or null if not find
     */
    public static Client getClient(int idClient) {
        for (int i = 0; i < listClient.size(); i++) {
            Client c = listClient.get(i);
            if (c.getIdClient() == idClient) {
                return c;
            }
        }
        return null;
    }
}
