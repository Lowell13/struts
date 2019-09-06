package tpstruts.javabeans;

public class Client {

    private int idClient;
    private String name;
    private String password;

    public Client() {
    }

    public Client(int idClient, String name, String password) {
        this.idClient = idClient;
        this.name = name;
        this.password = password;
    }

    /*---------------------*/
    /* GETTERS AND SETTERS */
    /*---------------------*/
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


