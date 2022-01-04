package com.yusuf.learning.jax.advanced.rs.model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString
public class MyDate {
	
	private String day;
	private String month;
	private String year;
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[Day=" + this.day +", Month=" + this.month + ", Year=" + this.year + "]";
//	}

}
