package entity;

import java.util.Date;

public class Role_weight {
	private Integer role_weight_id;
	private Integer role_id;
	private  Integer weight_id;
	private Integer flag;
	private Date date;
	private Date sys_date;
	private Integer	weight;
	public Integer getRole_weight_id() {
		return role_weight_id;
	}
	public void setRole_weight_id(Integer role_weight_id) {
		this.role_weight_id = role_weight_id;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Integer getWeight_id() {
		return weight_id;
	}
	public void setWeight_id(Integer weight_id) {
		this.weight_id = weight_id;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getSys_date() {
		return sys_date;
	}
	public void setSys_date(Date sys_date) {
		this.sys_date = sys_date;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
	
}
