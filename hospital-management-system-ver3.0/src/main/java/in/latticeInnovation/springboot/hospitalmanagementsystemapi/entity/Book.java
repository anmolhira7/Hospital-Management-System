package in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointments")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="patient_id")
	private int patient_id;
	
    @Column(name="patient_name")
	private String patient_name;
	
    @Column(name="date_of_book")
    private String date;
    
    @Column(name="doctor_name")
    private String doctor_name;
    
    @Column(name="status")
    private String status;
    
    public Book() {
    	
    }

	public Book(int patient_id, String patient_name, String date,String doctor_name, String status) {
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.date = date;
		this.status = status;
		this.doctor_name = doctor_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", patient_id=" + patient_id + ", patient_name=" + patient_name + ", date=" + date
				+ ", doctor_name=" + doctor_name + ", status=" + status + "]";
	}

	
	
	

}
