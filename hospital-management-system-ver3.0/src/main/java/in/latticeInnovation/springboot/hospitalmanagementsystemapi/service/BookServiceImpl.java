package in.latticeInnovation.springboot.hospitalmanagementsystemapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.dao.BookDAO;
import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	
	private BookDAO doctorDAO;
	
	@Autowired
	public BookServiceImpl(BookDAO theDoctorDAO) {
		doctorDAO = theDoctorDAO;
	}

	@Override
	public List<Book> findAll() {
		return doctorDAO.findAll();
	}

	@Override
	public void save(Book thebooking) {
		doctorDAO.save(thebooking);
	}

}
