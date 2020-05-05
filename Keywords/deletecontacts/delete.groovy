package deletecontacts

import java.Sql.*
import java.sql.*

import com.kms.katalon.core.annotation.Keyword

import groovy.sql.Sql

public class delete {

	@Keyword

	public connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)

		sqlConnection("delete from  contacts where name like '%firstname%'")
	}
}