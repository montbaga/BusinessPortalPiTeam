<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>RFCCreate</name>
   <tag></tag>
   <elementGuidId>efe81e67-bcef-4449-ac7c-a166312b719c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\u003csoapenv:Envelope xmlns:soapenv\u003d\&quot;http://schemas.xmlsoap.org/soap/envelope/\&quot; xmlns:v01\u003d\&quot;http://www.tele2.com/AccountNotificationSettingsGetRequest/BusinessPortal/v01\&quot; xmlns:v02\u003d\&quot;http://www.tele2.com/Common/MessageHeader/BusinessPortal/v02\&quot; xmlns:v011\u003d\&quot;http://www.tele2.com/Account/BusinessPortal/v01\&quot; xmlns:v04\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v04\&quot; xmlns:v021\u003d\&quot;http://www.tele2.com/Product/BusinessPortal/v02\&quot; xmlns:v022\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v02\&quot; xmlns:v06\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v06\&quot;\u003e\n   \u003csoapenv:Header/\u003e\n   \u003csoapenv:Body\u003e\n      \u003cv01:AccountNotificationSettingsGetRequest\u003e\n         \u003cv01:Header\u003e\n            \u003cv02:MessageId\u003eFrontix4867d9c8-9cc0-11e9-bf96-99f272d6c222\u003c/v02:MessageId\u003e\n            \u003cv02:ConversationId\u003e4867d9c8-9cc0-11e9-bf96-99f272d6c222\u003c/v02:ConversationId\u003e\n            \u003cv02:MessageTargetNamespace\u003ehttp://www.tele2.com\u003c/v02:MessageTargetNamespace\u003e\n            \u003cv02:Timestamp\u003e2019-07-02 13:55:27.387\u003c/v02:Timestamp\u003e\n            \u003cv02:Sender\u003eFrontix\u003c/v02:Sender\u003e\n            \u003cv02:Recipient\u003eBusinessPortal\u003c/v02:Recipient\u003e\n            \u003cv02:PayloadEncoding\u003ePlain\u003c/v02:PayloadEncoding\u003e\n         \u003c/v01:Header\u003e\n         \u003cv01:Body\u003e\n            \u003cv01:ProductInstance\u003e\n               \u003cv021:ProductInstanceId\u003e279215704\u003c/v021:ProductInstanceId\u003e\n            \u003c/v01:ProductInstance\u003e\n            \u003cv01:NotificationSettings\u003e\n               \u003cv01:MessageType\u003eOutagePlanned\u003c/v01:MessageType\u003e\n               \u003cv01:MessageSubType\u003eCREATE\u003c/v01:MessageSubType\u003e\n                \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eRFCId\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e${rfcid}\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n            \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eOutageType\u003c/v06:Name\u003e\n                \u003cv06:Value\u003eEmergency\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n            \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eRfcType\u003c/v06:Name\u003e\n                \u003cv06:Value\u003eOLO\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n            \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eOutageStartDateTime\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e${startDate}\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n            \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eOutageEndDateTime\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e${endDate}\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n            \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eOutageDuration\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e120\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n \n\n\t\t  \u003cv01:AdditionalNotificationDetails\u003e\n\t\t\t\u003cv06:Name\u003eDescriptionTitleEN\u003c/v06:Name\u003e\n\t\t\t\u003cv06:Value\u003eThis is WITNESS RFC test check in UATThis is WITNESS RFC test check in UATThis is WITNESS RFC test check in UATThis is WITNESS RFC test check in UATThis is WITNESS RFC test chec\u003c/v06:Value\u003e\n\t\t  \u003c/v01:AdditionalNotificationDetails\u003e\n\t\t  \n\t\t  \u003cv01:AdditionalNotificationDetails\u003e\n\t\t\t\u003cv06:Name\u003eDescriptionBodyEN\u003c/v06:Name\u003e\n\t\t\t\u003cv06:Value\u003eThere is a This is body of - WITN \u003c/v06:Value\u003e\n\t\t  \u003c/v01:AdditionalNotificationDetails\u003e\n\t\t  \n\t\t  \u003cv01:AdditionalNotificationDetails\u003e\n\t\t\t\u003cv06:Name\u003eDescriptionTitleNL\u003c/v06:Name\u003e\n\t\t\t\u003cv06:Value\u003eDit is GETUIG RFC-testcontrole in UATDit is GETUIG RFC-testcontrole in UATDit is GETUIG RFC-testcontrole in UATDit is GETUIG RFC-testcontrole in UATDit is GETUIG RFC-testc\u003c/v06:Value\u003e\n\t\t  \u003c/v01:AdditionalNotificationDetails\u003e\n\t\t  \n  \t\t  \u003cv01:AdditionalNotificationDetails\u003e\n\t\t\t\u003cv06:Name\u003eDescriptionBodyNL\u003c/v06:Name\u003e\n\t\t\t\u003cv06:Value\u003eEr is een This is body of - GETUIG RFC-testcontrole in UATEr is een This is body of - GETUIG RFC-testcontrole in UATEr is een \u003c/v06:Value\u003e\n\t\t  \u003c/v01:AdditionalNotificationDetails\u003e\n             \n         \u003c/v01:NotificationSettings\u003e\n         \u003c/v01:Body\u003e\n      \u003c/v01:AccountNotificationSettingsGetRequest\u003e\n   \u003c/soapenv:Body\u003e\n\u003c/soapenv:Envelope\u003e&quot;,
  &quot;contentType&quot;: &quot;application/xml&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/xml</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://bw-notification-service.uat.dle.nl.corp.tele2.com/webservice/accountNotificationSettingsGet</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d0ceeaba-3728-472c-be0c-349d3e404714</id>
      <masked>false</masked>
      <name>rfcid</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>52086e92-b67e-43e7-907d-dd7b96e54fa6</id>
      <masked>false</masked>
      <name>startDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>2bd46176-cba2-40af-92ec-7aa12bf33390</id>
      <masked>false</masked>
      <name>endDate</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
