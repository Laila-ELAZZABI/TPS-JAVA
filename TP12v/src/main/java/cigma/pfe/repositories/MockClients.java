package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockClients implements CommandLineRunner{
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public void run(String... args) throws Exception{
        Client client1 = new Client("Mosab");
        Client client2 = new Client("Laila");
        Client client3 = new Client("Zoubir");
        Client client4 = new Client("Rajae");
        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);
        clientRepository.save(client4);
        clientRepository.findAll().forEach(client -> System.out.println(client));
    }
}
