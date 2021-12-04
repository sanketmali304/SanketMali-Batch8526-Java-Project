package sample.project1;
import javax.persistence.*;
import java.util.List;
import main2.Student; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try
		{
			emf=Persistence.createEntityManagerFactory("jpa-todo");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			Student student=new Student();
			student.setRollNo(1);
			student.setSname("Sanket Mali");
			student.setMobNo("9876543210");
			entityManager.persist(student);
			transaction.commit();
			Query q = entityManager.createQuery("select v from Student v");
			
			List<Student> resultList = q.getResultList();
			System.out.println("Number of sudents:" + resultList.size());
			for (Student next : resultList) {
				System.out.println("next student: " + next);
			}		
		}
		catch(Exception e)
		{
		   System.out.println("Error while uploading "+ e);
		   transaction.rollback();
		}
		finally
		{
			entityManager.close();
			emf.close();
		}
		
    }
}
