package in.latticeInnovation.springboot.hospitalmanagementsystemapi.dao;

import java.util.List;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Book;
import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Patient;

public interface BookDAO {

	//find all booking
	public List<Book> findAll();

	public void save(Book thebooking);
}

