package com.st.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="EMP_THYM")
@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Employee {
	
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue
	@NonNull
	private Integer empId;
	@Column(name="EMP_NAME")
	@NonNull
	private String empName;
	@Column(name="EMP_SAL")
	@NonNull
	private Double empSal;
	@Column(name="EMP_DEPT")
	@NonNull
	private Integer empDept;
	
	@Column(name="EMP_ADDR")
	@NonNull
	private String empAddr;

	public Employee() {
		super();
	}

	public Employee(@NonNull Integer empId, @NonNull String empName, @NonNull Double empSal, @NonNull Integer empDept,
			@NonNull String empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
		this.empAddr = empAddr;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Integer getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Integer empDept) {
		this.empDept = empDept;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ ", empAddr=" + empAddr + "]";
	}

	
	}

