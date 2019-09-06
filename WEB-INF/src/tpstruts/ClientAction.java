package tpstruts;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import tpstruts.javabeans.Client;
import tpstruts.modele.ClientModel;


public class ClientAction extends ActionSupport implements Preparable, ModelDriven {

    private Client client;
    private List<Client> listClients;
    private int idCurrentClient;

    /**
     * Override the ActionSupport's method. Do this when showing a page.
     *
     * @throws Exception Actually doesn't.
     */
    public void prepare() throws Exception {
        // When creating, create a new empty object
        if (idCurrentClient == 0) {
            client = new Client();
        }
        // When editing, send back information about the object
        else {
            client = ClientModel.getClient(idCurrentClient);
        }
    }

    /*---------------------*/
    /* GETTERS AND SETTERS */
    /*---------------------*/

    public Object getModel() {
        return client;
    }

    public int getIdCurrentClient() {
        return idCurrentClient;
    }

    public void setIdCurrentClient(int idCurrentClient) {
        this.idCurrentClient = idCurrentClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getListClients() {
        listClients = ClientModel.getListClient();
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }

    /*-----------*/
    /* FUNCTIONS */
    /*-----------*/

    /**
     * List clients
     *
     * @return Success
     */
    public String list() {
        listClients = ClientModel.getListClient();
        return SUCCESS;
    }

    /**
     * View the client associated to the idCurrentClient
     *
     * @return Success
     */
    public String view() {
        ClientModel.getClient(idCurrentClient);
        return SUCCESS;
    }

    /**
     * Add the client to the list
     *
     * @return Success
     */
    public String add() {
        ClientModel.add(client);
        return SUCCESS;
    }

    /**
     * Show the form for editing the client
     *
     * @return Success
     */
    public String edit() {
        return SUCCESS;
    }

    /**
     * Edit the client
     *
     * @return Success
     */
    public String modify() {
        ClientModel.edit(client);
        return SUCCESS;
    }

    /**
     * Delete the client associated to the idCurrentClient in the list
     *
     * @return Success
     */
    public String delete() {
        ClientModel.delete(idCurrentClient);
        return SUCCESS;
    }


}


