package mySqlConnection

import java.Sql.*
import java.sql.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import groovy.sql.Sql
import internal.GlobalVariable
public class ExecutingFirstQueryInMySql {

	@Keyword

	public connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)


		boolean flag = false
		sqlConnection.firstRow("select login_name , calvi_role , calvi_id_new from users where login_name like '%USERAUTO%' order by id desc fetch first 1 rows only").with { row ->
			//sqlConnection.eachRow("select login_name , calvi_role , calvi_id_new from users where login_name like '%USERAUTO%'") { row ->
			println (row [0] + " - " + row [1] + " - " + row [2])
			//println row [0]
			//println row [1]
			//println row [2]
			println(row [0] != null &&   row [1] != null &&  row [2] != null)
			if (!(row [0] != null &&   row [1] != null &&  row [2] != null)) {

				flag = true
			}
		}
		if (flag == true){
			KeywordUtil.markFailed("Calvi is Failed")
		} else {
			println("Calvi is passed")
		}
	}
}

