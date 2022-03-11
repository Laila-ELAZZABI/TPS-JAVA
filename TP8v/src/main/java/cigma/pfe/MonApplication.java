package cigma.pfe;


import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context =new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("idCtrl");
        // Test save use case for three clients
        ctrl.save(new Client("MOSAB"));
        ctrl.save(new Client("LAILA"));
        ctrl.save(new Client("HAFID"));
        ctrl.save(new Client("GHITA"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(2L,"new Name"));
        // Test remove use case for client with id==1
        //ctrl.removeById(1L);
        // Test find use case for client with id==1
        Client found = ctrl.getById(2L);
        ctrl.getAll();
        FactureController fct = (FactureController) context.getBean("idCtrlF");
        fct.creates(new Facture(new Date(22/02/2001),20));
        fct.reads();
        fct.deletes(1);
        fct.updates(new Facture(new Date(17/02/1991),30));


    }
}