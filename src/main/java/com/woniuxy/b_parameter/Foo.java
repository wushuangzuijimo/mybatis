package com.woniuxy.b_parameter;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Foo {
	private Integer eid;
	private String ename;
	private Date birthday;
	private Double money;
}
