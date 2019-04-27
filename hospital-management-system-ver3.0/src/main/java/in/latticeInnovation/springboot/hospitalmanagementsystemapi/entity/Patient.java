package in.latticeInnovation.springboot.hospitalmanagementsystemapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="table_patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	//@NotNull(message="is required")
	//@Pattern(regexp="^[a-zA-Z0-9]{6,}", message="must be greater than or equal to 6 digits")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	@Column(name="email")
	//@Pattern(regexp="^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$", message=" is not a valid email address")
	private String email;
	
	
	@Column(name="address")
	@NotNull(message="is required")
	//@Pattern(regexp="^[a-zA-Z0-9]{10,}", message="must be greater than or equal to 10 digits")	
	private String address;
	
	@Column(name="phone")
	@Pattern(regexp="\\+[0-9]{10,}", message="must be stated with country code and length must be greator than or equal to 10 digits")
	private String phone;
	
	
	@Column(name="password")
	@NotNull(message="is required")	
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}", message="must contain atleast 1 uppercase,1 lowercase,1 number")
	private String password;
	
	@Column(name="date_of_adm")
	@NotNull(message="is required")
	private String date_of_admission;
	
	
	public Patient() {
		
	}

	//Parameterised constructor
	public Patient(String firstName, String lastName, String email,String phone,String address,String password,String date_of_admission) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.password = password;
		this.date_of_admission = date_of_admission;			
	}

	//Define Getters/Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_of_admission() {
		return date_of_admission;
	}

	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", password=" + password + ", date_of_admission="
				+ date_of_admission + "]";
	}

	

	
	
  
	
	
}
