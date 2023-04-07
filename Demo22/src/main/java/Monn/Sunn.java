package Monn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sunn {
	@Id
	private int Id;
	private String name;
	private long number;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}

}
