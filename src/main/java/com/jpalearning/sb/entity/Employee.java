package com.jpalearning.sb.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity                                                                               
@Table(name= "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	private String empName;
	private Integer empAge;
	
	
	//object of address class
  //@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_add_id")
	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="fk_emp_id",referencedColumnName = "emp_id")
	private List<Address> address;
	
	private Employee() {
		
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
}
