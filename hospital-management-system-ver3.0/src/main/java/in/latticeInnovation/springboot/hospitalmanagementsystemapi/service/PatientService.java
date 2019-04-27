package in.latticeInnovation.springboot.hospitalmanagementsystemapi.service;

import java.util.List;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Patient;

public interface PatientService {

	public List<Patient> findAll();

	public Patient findById(int theId);

	public void save(Patient theEmployee);

	public void deleteById(int theId);
}
