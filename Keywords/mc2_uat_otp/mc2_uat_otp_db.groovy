package mc2_uat_otp

import java.Sql.*
import java.sql.*

import com.kms.katalon.core.annotation.Keyword

import groovy.sql.Sql
import oracle.sql.CLOB

public class mc2_uat_otp_db {

	@Keyword

	public String connection(String url, String user, String password){
		def sqlConnection = Sql.newInstance(url,user,password)
		String otp = ""
		//sqlConnection("delete * from tele2_mc2_message_order")
		sqlConnection.eachRow("select ORIGINAL_PAYLOAD  from tele2_mc2_message_order where message_type = 'MFA_AUTHENTICATION_SMS_NL'  and created > CURRENT_TIMESTAMP -1/1440 order by created desc") { row ->
			CLOB clob = row [0]
			otp = clob.getSubString( clob.position( "OTP", 300l)+27, 8)
		}
		return otp
	}
}