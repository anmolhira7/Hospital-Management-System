package in.latticeInnovation.springboot.hospitalmanagementsystemapi.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Patient;
import in.latticeInnovation.springboot.hospitalmanagementsystemapi.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientRestController {

private PatientService patientService;

public PatientRestController() {
	
}

@InitBinder
 public void intiBinder(WebDataBinder dataBinder) {
	 StringTrimmerEditor  stringTrimmerEditor = new StringTrimmerEditor (true);
	 dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
 }
	
	@Autowired
	public PatientRestController(PatientService thePatientService) {
		patientService = thePatientService;
	}
	
	// expose "/patients" and return list of patients
	@GetMapping("/get-all-patients")
	public List<Patient> findAll() {
		return patientService.findAll();
	}

	// add mapping for GET /patients/{patientId}
	
	@GetMapping("/patients/{patientId}")
	public Patient getPatient(@PathVariable int patientId) {
		
		Patient thePatient = patientService.findById(patientId);
		
		if (thePatient == null) {
			throw new RuntimeException("Employee id not found - " + patientId);
		}
		
		return thePatient;
	}
	
	// add mapping for POST /patients - add new patient
	
	@PostMapping("/add-patients")
	public Patient addPatient(@Valid @RequestBody Patient thePatient) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		thePatient.setId(0);
		
		patientService.save(thePatient);
		
		return thePatient;
	}
	
	// add mapping for PUT /patients - update existing patient
	
	@PutMapping("/update-patient")
	public Patient updatePatient(@RequestBody Patient thePatient) {
		
		patientService.save(thePatient);
		
		return thePatient;
	}
	
	// add mapping for DELETE /patient/{patientId} - delete patient
	
	@DeleteMapping("/del-patients/{patientId}")
	public String deletePatient(@PathVariable int patientId) {
		
		Patient tempEmployee = patientService.findById(patientId);
		
		// throw exception if null
		
		if (tempEmployee == null) {
			throw new RuntimeException("patient id not found - " + patientId);
		}
		
		patientService.deleteById(patientId);
		
		return "Deleted patient id - " + patientId;
	}
	
}