<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>OutageClose</name>
   <tag></tag>
   <elementGuidId>f14bc5f3-7a68-4058-b466-7ddcba12789b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\u003csoapenv:Envelope xmlns:soapenv\u003d\&quot;http://schemas.xmlsoap.org/soap/envelope/\&quot; xmlns:v01\u003d\&quot;http://www.tele2.com/AccountNotificationSettingsGetRequest/BusinessPortal/v01\&quot; xmlns:v02\u003d\&quot;http://www.tele2.com/Common/MessageHeader/BusinessPortal/v02\&quot; xmlns:v011\u003d\&quot;http://www.tele2.com/Account/BusinessPortal/v01\&quot; xmlns:v04\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v04\&quot; xmlns:v021\u003d\&quot;http://www.tele2.com/Product/BusinessPortal/v02\&quot; xmlns:v022\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v02\&quot; xmlns:v06\u003d\&quot;http://www.tele2.com/Common/BusinessPortal/v06\&quot;\u003e\n   \u003csoapenv:Header/\u003e\n   \u003csoapenv:Body\u003e\n      \u003cv01:AccountNotificationSettingsGetRequest\u003e\n         \u003cv01:Header\u003e\n            \u003cv02:MessageId\u003eTIPTID-1b2e1967-55c9-4af0-a3ae-0f4ce2788bd5\u003c/v02:MessageId\u003e\n            \u003cv02:ConversationId\u003e0bf5d3df-265e-11e6-844b-bb1619ac571d\u003c/v02:ConversationId\u003e\n            \u003cv02:MessageTargetNamespace\u003ehttp://www.tele2.com\u003c/v02:MessageTargetNamespace\u003e\n            \u003cv02:Timestamp\u003e2016-04-24 11:00:05.197\u003c/v02:Timestamp\u003e\n            \u003cv02:Sender\u003eTIP\u003c/v02:Sender\u003e\n            \u003cv02:Recipient\u003eBusinessPortal\u003c/v02:Recipient\u003e\n            \u003cv02:PayloadEncoding\u003ePlain\u003c/v02:PayloadEncoding\u003e\n         \u003c/v01:Header\u003e\n         \u003cv01:Body\u003e\n            \u003cv01:ProductInstance\u003e\n               \u003cv021:ProductInstanceId\u003e282917952\u003c/v021:ProductInstanceId\u003e\n            \u003c/v01:ProductInstance\u003e\n          \u003cv01:NotificationSettings\u003e\n               \u003cv01:MessageType\u003eOutageUnplanned\u003c/v01:MessageType\u003e\n               \u003cv01:MessageSubType\u003eCLOSE\u003c/v01:MessageSubType\u003e\n                \n            \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eParentCaseId\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e${outageId}\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n\n            \u003cv01:AdditionalNotificationDetails\u003e\n                                                \u003cv06:Name\u003eDescriptionTitleEN\u003c/v06:Name\u003e\n                                                \u003cv06:Value\u003eOutage created from local postman\u003c/v06:Value\u003e\n                                  \u003c/v01:AdditionalNotificationDetails\u003e\n                                  \n                                  \u003cv01:AdditionalNotificationDetails\u003e\n                                                \u003cv06:Name\u003eDescriptionBodyEN\u003c/v06:Name\u003e\n                                                \u003cv06:Value\u003eOutage local test for BWB 543276. 992\u003c/v06:Value\u003e\n                                  \u003c/v01:AdditionalNotificationDetails\u003e\n                                  \n                                  \u003cv01:AdditionalNotificationDetails\u003e\n                                                \u003cv06:Name\u003eDescriptionTitleNL\u003c/v06:Name\u003e\n                                                \u003cv06:Value\u003eSW RESET DSL05 SLOT13\u003c/v06:Value\u003e\n                                  \u003c/v01:AdditionalNotificationDetails\u003e\n                                  \n                                  \u003cv01:AdditionalNotificationDetails\u003e\n                                                \u003cv06:Name\u003eDescriptionBodyNL\u003c/v06:Name\u003e\n                                                \u003cv06:Value\u003eTriple Play-services zijn onderbroken Rijswijk (MDF Gv-Rwk).\u003c/v06:Value\u003e\n                                  \u003c/v01:AdditionalNotificationDetails\u003e\n          \n          \u003cv01:AdditionalNotificationDetails\u003e\n                \u003cv06:Name\u003eOutageStartDateTime\u003c/v06:Name\u003e\n                \u003cv06:Value\u003e${startDate}\u003c/v06:Value\u003e\n            \u003c/v01:AdditionalNotificationDetails\u003e\n          \n         \u003c/v01:NotificationSettings\u003e\n         \u003c/v01:Body\u003e\n      \u003c/v01:AccountNotificationSettingsGetRequest\u003e\n   \u003c/soapenv:Body\u003e\n\u003c/soapenv:Envelope\u003e\n\n\n&quot;,
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
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>787f520a-6916-4a85-8d3c-e28df6805b49</id>
      <masked>false</masked>
      <name>outageId</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e5c89ee7-0fba-4ac7-9c2b-dc24dece0f2d</id>
      <masked>false</masked>
      <name>startDate</name>
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
