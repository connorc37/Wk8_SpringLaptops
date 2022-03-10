package demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */

@Entity
public class Laptop {
	@Id
	@GeneratedValue
	private int id;
	private String brand;
	private String model;
	@Autowired
	private Specification specification;
	
	public Laptop() {
		super();
	}

	public Laptop(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public Laptop(int id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + ", specification=" + specification + "]";
	}

}
