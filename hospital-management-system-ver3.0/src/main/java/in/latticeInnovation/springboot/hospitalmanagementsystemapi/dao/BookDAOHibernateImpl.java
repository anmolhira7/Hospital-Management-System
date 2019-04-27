package in.latticeInnovation.springboot.hospitalmanagementsystemapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Book;

@Repository
public class BookDAOHibernateImpl implements BookDAO {
	
	// define field for entitymanager	
		private EntityManager entityManager;
			
		
		public BookDAOHibernateImpl() {
			
		}
		
		// set up constructor injection
		@Autowired
		public BookDAOHibernateImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}

	@Override
	public List<Book> findAll() {
   Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Book> theQuery =
				currentSession.createQuery("from Book order by date", Book.class);
		
		// execute query and get result list
		List<Book> bookings = theQuery.getResultList();
		
		// return the results		
		return bookings;
	}

	@Override
	public void save(Book thebooking) {
		
	Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(thebooking);		
	}

}
