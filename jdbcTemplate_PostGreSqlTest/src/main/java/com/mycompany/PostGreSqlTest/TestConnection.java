package com.mycompany.PostGreSqlTest;

import java.util.List;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {
	private static Logger log = Logger.getLogger(TestConnection.class);
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource ds){
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	 public void getTable(Exchange e) {
	        log.info("calling getTable()");
	        List<?> records = jdbcTemplate.queryForList("select * from testtable");
	        log.info("Records: "+records.toString());
	        e.getIn().setBody(records.toString());
	    }
}
