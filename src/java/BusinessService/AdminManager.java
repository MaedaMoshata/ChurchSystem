package businessService;
import org.hibernate.Transaction; 
import org.hibernate.Session; 
import Model.Administrator;
import Util.NewHibernateUtil; 
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class AdminManager {
     public void addAmin(int adminId,String adminName,String adminAddress,int adminContact,String adminEmail){ 
        try { 
            Configuration config = new Configuration().configure();
            SessionFactory factory = config.buildSessionFactory(); 
            Session session = factory.openSession(); 
            Transaction trans=session.beginTransaction();
            
            Administrator ad = new Administrator();
            ad.setAdministratorId(adminId);
            ad.setName(adminName);
            ad.setAddress(adminAddress);
            ad.setContact(adminContact);
            ad.setEmail(adminEmail);
            session.save(ad);
            trans.commit();
            System.out.println("Administrator " + ad.getName() + " added");
        }catch(Exception e){
            e.printStackTrace();
        } finally { 
        }
     }
        /*public Account searchAccount(int pi_id,String aType){
        String message=null;
        Session session = null;
        Transaction tx = null;
        Account ac = null;
        try{
            if(aType.equalsIgnoreCase("Administrator") || aType.equalsIgnoreCase("User")){
                session = NewHibernateUtil.getSessionFactory().openSession();
                tx = session.getTransaction();
                tx.begin();
                Query query = session.createQuery("from Account where id = '" + pi_id + "'");
                ac = (Account)query.uniqueResult();
                tx.commit();
                System.out.println("Account id: " + ac.getAccountId() + "\n Account Type: " + ac.getAccountType());
            }
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            System.out.println("Account failed to be searched!!\n" + e);
        }
        finally{
            session.close();
        }
       return ac;
    }*/
    public static void main(String[] args) {
            AdminManager a = new AdminManager();
            a.addAmin(101, "Edgar", "24 Jsl foor str", 785477578, "edgar@gmail");
            
         }
}
