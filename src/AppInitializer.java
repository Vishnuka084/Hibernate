import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName("Sunimal");
        c1.setAddress("Galle");
        c1.setSalary(45451);


        Session session = FactoryConfiguration.getInstance().getSession();

        session.save(c1);

        session.close();

    }
}
