/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3.reto3.reto3.reportes;

import ciclo3.reto3.reto3.model.Client;


/**
 *
 * @author Diana Romero
 */
public class contadorClient {
    
    private long total;
    private Client client;

    public contadorClient(long total, Client client) {
        this.total = total;
        this. client = client;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
       public Client getClient() {
        return client;
    }

    public void setCliet(Client client) {
        this.client = client;
    }
    
    
}
