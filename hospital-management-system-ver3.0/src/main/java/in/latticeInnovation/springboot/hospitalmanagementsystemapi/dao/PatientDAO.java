package in.latticeInnovation.springboot.hospitalmanagementsystemapi.dao;

import java.util.List;

import in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity.Patient;

public interface PatientDAO {

	public List<Patient> findAll();

	public Patient findById(int theId);

	public void save(Patient thePatient);

	public void deleteById(int theId);
	

}
