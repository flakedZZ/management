package entity;

import java.util.Date;

public class Weight {
		private Integer weight_id;
		private String weight_name;
		private Integer flag;
		private Date date;
		private  Date sys_date;
		public Integer getWeight_id() {
			return weight_id;
		}
		public void setWeight_id(Integer weight_id) {
			this.weight_id = weight_id;
		}
		public String getWeight_name() {
			return weight_name;
		}
		public void setWeight_name(String weight_name) {
			this.weight_name = weight_name;
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
		
		

}
