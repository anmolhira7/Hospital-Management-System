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
	
	@Column(name="name")
	@NotNull(message="is required")
	@Pattern(regexp="^.{6,}", message="must be greater than or equal to 6 digits")
	private String name;

	
	@Column(name="email")
	@Pattern(regexp="^[A-Za-z0-9+_.-]+@(.+)$")
//	@Pattern(regexp="^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$", message=" is not a valid email address")
	private String email;
	
	
	@Column(name="address")
	@NotNull(message="is required")
	
	@Pattern(regexp="^.{10,}$", message="must be greater than or equal to 10 digits")	
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
	public Patient(String name, String email,String phone,String address,String password,String date_of_admission) {
		this.name = name;
	
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

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ ", password=" + password + ", date_of_admission=" + date_of_admission + "]";
	}

	
	

	

	
	
  
	
	
}
