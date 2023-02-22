import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName("Sunimal");
        c1.setAddress("Galle");
        c1.setSalary(45451);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(c1);

        transaction.commit();

        session.close();

    }
}
