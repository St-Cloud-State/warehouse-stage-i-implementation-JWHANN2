import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of ClientList
        ClientList clientList = ClientList.instance();

        // Create clients
        Client client1 = new Client("John Doe");
        Client client2 = new Client("Jane Smith");

        // Insert clients into the list
        clientList.insertClient(client1);
        clientList.insertClient(client2);

        // Print the client list
        System.out.println("Client List after insertion:");
        System.out.println(clientList);

        // Search for a client by ID
        String clientIdToSearch = client1.getClientId();
        Client foundClient = clientList.searchClient(clientIdToSearch);
        
        // Print the search result
        if (foundClient != null) {
            System.out.println("Found client: " + foundClient);
        } else {
            System.out.println("Client with ID: " + clientIdToSearch + " not found.");
        }

        // Remove a client by ID (remove client1)
        String clientIdToRemove = client1.getClientId();
        boolean removed = clientList.removeClient(clientIdToRemove);
        
        // Print the result of removal
        if (removed) {
            System.out.println("Removed client with ID: " + clientIdToRemove);
        } else {
            System.out.println("Client with ID: " + clientIdToRemove + " not found.");
        }

        // Print the client list after removal
        System.out.println("Client List after removal:");
        System.out.println(clientList);

        // Iterate over clients using the iterator
        System.out.println("Remaining clients:");
        Iterator<Client> iterator = clientList.getClients();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


