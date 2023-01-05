package services.servicesImpl;

import dao.Database;
import model.Client;
import model.Taxi;
import services.ClientService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClientServiceImpl implements ClientService {
    private Database clients1 = new Database();
    @Override
    public String addClient(Client client) {
        Client cl = null;
        for (Client client1 : clients1.getClients()) {
            if (!client1.getId().equals(client.getId())) {
                client1 = client;
                clients1.getClients().add(client);
            } else {
                System.out.println("Client c таким логином уже существует!");
            }
        }
        return cl;
    }

    @Override
    public String addClient(List<Client> clients) {
        clients1.getClients().addAll(clients);
        return clients1.getClients().stream().toList().toString();
    }

    @Override
    public List<Client> getClientByName(String name) {
        return clients1.getClients().stream().filter(x-> x.getFullName().equals(name)).toList();
    }

    @Override
    public Client removeClientById(Long id) {
        for (Client client : clients1) {
            if (client.getId().longValue()==id){
                clients1.remove(client);
                return client;
            }
        }
        return null;
    }

    @Override
    public Taxi orderTaxi(Long clientId, String taxiType) {
        return null;
    }

    @Override
    public Map<Integer, Client> getClientAge() {
        Map<Integer,Client> clientMap = new TreeMap<>();
        for (Client client : clients1) {
            Integer nam = LocalDate.now().getYear()-client.getDateOfBirth().getYear();
            clientMap.put(nam,client);
        }

        return clientMap;
    }

    @Override
    public void universalSorting(String word) {

    }
}
