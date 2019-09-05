package com.woniuxy.A;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Emp implements Serializable {
	
	private Integer eid;
	private String ename;
	private Date birthday;
	private double money;
	

}
