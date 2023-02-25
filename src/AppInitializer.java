import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c2 = new Customer();
/*        c2.setId("C002");
        c2.setName("sumudu");
        c2.setAddress("jaffna");
        c2.setSalary(50000);*/

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //for getting one customer
        Customer c1 = session.get(Customer.class,"C001");
        System.out.println(c1.getAddress());


        transaction.commit();

        session.close();

    }
}
