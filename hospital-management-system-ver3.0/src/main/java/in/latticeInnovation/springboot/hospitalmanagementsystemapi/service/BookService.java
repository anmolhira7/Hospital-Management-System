package in.latticeInnovation.springboot.hospitalmanagementsystemapi.service;

import java.util.List;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Book;

public interface BookService {
	public List<Book> findAll();

	
	public void save(Book thebooking);
}
