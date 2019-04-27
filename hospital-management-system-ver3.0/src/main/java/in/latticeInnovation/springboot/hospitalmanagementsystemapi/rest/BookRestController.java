package in.latticeInnovation.springboot.hospitalmanagementsystemapi.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Book;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.service.BookService;

@RestController
@RequestMapping("/book")
public class BookRestController {

	private BookService doctorService;
	
	public BookRestController() {
		
	}
	
	@Autowired
	public BookRestController(BookService theDoctorService) {
		doctorService = theDoctorService;
	}
	
	
	
	@InitBinder
	 public void intiBinder(WebDataBinder dataBinder) {
		 StringTrimmerEditor  stringTrimmerEditor = new StringTrimmerEditor (true);
		 dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	 }
		
	
	// expose "/doctors" and return list of doctors
		@GetMapping("/all-bookings")
		public List<Book> findAll() {
			return doctorService.findAll();
		}

		@PostMapping("/add-appointment")
		public Book addBooking(@RequestBody Book theDoctor) {
			
			// also just in case they pass an id in JSON ... set id to 0
			// this is to force a save of new item ... instead of update
			
			theDoctor.setId(0);
			
			doctorService.save(theDoctor);
			
			return theDoctor;
		}
	
}
