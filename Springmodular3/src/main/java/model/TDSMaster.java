package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tMaster")
public class TDSMaster {
	
	@Id
	private int id;
	
	private String deductor_name;
	private String deductor_pan;
	private int tds_deposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductor_name() {
		return deductor_name;
	}
	public void setDeductor_name(String deductor_name) {
		this.deductor_name = deductor_name;
	}
	public String getDeductor_pan() {
		return deductor_pan;
	}
	public void setDeductor_pan(String deductor_pan) {
		this.deductor_pan = deductor_pan;
	}
}