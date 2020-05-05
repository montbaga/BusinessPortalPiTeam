<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_(function(w d s l i)    wl  wl     wlp_699032</name>
   <tag></tag>
   <elementGuidId>294e0a40-7830-4cbc-a56f-fe7347adc213</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value></value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>safari safari537</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
 


 
 
  (function(w, d, s, l, i) {
   w[l] = w[l] || [];
   w[l].push({
    'gtm.start' : new Date().getTime(),
    event : 'gtm.js'
   });
   var f = d.getElementsByTagName(s)[0], j = d.createElement(s), dl = l != 'dataLayer' ? '&amp;l='
     + l
     : '';
   j.async = true;
   j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
   f.parentNode.insertBefore(j, f);
  })(window, document, 'script', 'dataLayer', 'GTM-P8Q37HN');
 
 






  







 
  
  
  
  
  
   
   function interceptZkmx(global) {
    global.zkmxOriginal = global.zkmx, global.zkmxStoredArguments = [];
    global.zkmx = function() {
     global.zkmxStoredArguments = arguments;
    }
   }
   function restoreZkmx(global) {
    global.zkmx = global.zkmxOriginal;
   }
   function executeInterceptedZkAndCleanup(global) {
    global.zkmx.apply(this, global.zkmxStoredArguments);
    try {
     delete global.zkmxOriginal;
     delete global.zkmxStoredArguments;
     delete global.interceptZkmx;
     delete global.restoreZkmx;
     delete global.executeInterceptedZk;
    } catch (err) { 
     global.zkmxOriginal = undefined;
     global.zkmxStoredArguments = undefined;
     global.interceptZkmx = undefined;
     global.restoreZkmx = undefined;
     global.executeInterceptedZk = undefined;
    }
   }
  
  















    /* restore the backed up value of the global jQuery reference - see workaround-ZK-jQuery-bug.js */
    if (typeof jQuery_backup != 'undefined') jQuery = jQuery_backup;
    
    function zkBusy(fully, active) {
     $(fully ? &quot;#full-progress-layer&quot; : &quot;#page-progress-layer&quot;).css(&quot;display&quot;, active ? &quot;block&quot; : &quot;none&quot;);
    }
    zUtl.progressbox = function(id, msg, mask, icon) {
     if (id == 'zk_showBusy')
      zkBusy(true, true);
     else if (id == 'zk_proc')
      zkBusy(false, true);
    };
    zUtl.destroyProgressbox = function(id) {
     if (id == 'zk_showBusy')
      zkBusy(true, false);
     else if (id == 'zk_proc')
      zkBusy(false, false);
    };
    zk.afterLoad(&quot;zul.inp&quot;, function() {
     zul.inp.Combobox.prototype.slideDown_ = function(pp) {
      jq(pp).css(&quot;visibility&quot;, &quot;visible&quot;).css(&quot;display&quot;, &quot;block&quot;);
     };
     zul.inp.Bandbox.prototype.slideDown_ = function(pp) {
      jq(pp).css(&quot;visibility&quot;, &quot;visible&quot;).css(&quot;display&quot;, &quot;block&quot;);
     };
    });
    zk.afterLoad(&quot;zul.tab&quot;, function() {
     zul.tab.Tabpanel.prototype._selOriginal = zul.tab.Tabpanel.prototype._sel; // save reference to original implementation
     zul.tab.Tabpanel.prototype._sel = function (toSel, animation) {
      this._selOriginal(toSel, false); // 'false' -> no animation !
     };
    });
    // This ensures that the 'busy-box' will also be shown 0.75s after
    // the user started to navigate away from the page. 
    jq(document).ready(function() {
     jq('form input[progress=true][type=button]').click(function() {
      setTimeout(function(e) {
       zkBusy(false, true);
      }, 750);
      return false;
     });
    });
   
   
    window['adrum-start-time'] = new Date().getTime();
        window['adrum-config'] =  {
                     userEventInfo: {
                     &quot;PageView&quot;: function(context) {
         var c_email = document.getElementsByClassName(&quot;email&quot;)[0].innerHTML
         var c_account = document.getElementsByClassName(&quot;account&quot;)[0].innerHTML
                        return {
                            userData: {
                                customer_email: c_email,
                                customer_account: c_account
                            }
                        }
                    }, 
                    &quot;Ajax&quot; : function(context) {
         var c_email = document.getElementsByClassName(&quot;email&quot;)[0].innerHTML
         var c_account = document.getElementsByClassName(&quot;account&quot;)[0].innerHTML
         
                        if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('invoices') != -1){
          var parentName = &quot;ZKFR./invoices&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('services') != -1){
          parentName = &quot;ZKFR./services&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('customerAssignment') != -1){
          parentName = &quot;ZKFR./customerAssignment&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('order') != -1){
          parentName = &quot;ZKFR./order&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('dashboard') != -1){
          parentName = &quot;ZKFR./dashboard&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('hostedvoice/Configuration')!= -1){
          parentName = &quot;ZKFR./hostedvoice/Configuration&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('myProfile') != -1){
          parentName = &quot;ZKFR./myProfile&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('user_mgmt/userContactSearch') != -1){
          parentName = &quot;ZKFR./user_mgmt/userContactSearch&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('mobileconnect') != -1){
          parentName = &quot;ZKFR./mobileconnect&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('welcome') != -1){
          parentName = &quot;ZKFR./welcome&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('contractors/ProjectOverview') != -1){
          parentName = &quot;ZKFR./contractors/ProjectOverview&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('news') != -1){
          parentName = &quot;ZKFR./news&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('customerdetails') != -1){
          parentName = &quot;ZKFR./customerdetails&quot;
                        }
         if (context.method.toLowerCase() === 'post' &amp;&amp; document.URL.indexOf('networkmetrics/Performance') != -1){
          parentName = &quot;ZKFR./networkmetrics/Performance&quot;
                        }
                        return {
          userPageName: parentName,
                            userData: {
                                customer_email: c_email,
                                customer_account: c_account
                            }
                        }
                    }
                }
            };
    
    
    
       (function(config){  
         var host = window.location.host;
            if (host.indexOf('localhost') == 0 || host.indexOf('int') > 0) {
             config.appKey = 'EUM-AAB-AYF';
            } else if (host.indexOf('uat') > 0) {
             config.appKey = 'EUM-AAB-AYG';
            } else{
             config.appKey = 'EUM-AAB-AYS';
            }
            config.adrumExtUrlHttp = 'http://cdn.appdynamics.com';
            config.adrumExtUrlHttps = 'https://cdn.appdynamics.com';
            config.beaconUrlHttp = 'http://eum.tele2.com:80';
            config.beaconUrlHttps = 'https://eum.tele2.com:443';
            config.xd = {enable : true};
       })(window['adrum-config'] || (window['adrum-config'] = {}));
        if ('https:' === document.location.protocol) {
              document.write(unescape('%3Cscript')+ &quot; src='https://&quot;+window.location.host+&quot;/js/adrum/adrum.js' &quot;
          + &quot; type='text/javascript' charset='UTF-8'&quot;
           + unescape('%3E%3C/script%3E'));
        } else {
             document.write(unescape('%3Cscript')
          + &quot; src='http://&quot;+window.location.host+&quot;/js/adrum/adrum.js' &quot;
          + &quot; type='text/javascript' charset='UTF-8'&quot;
           + unescape('%3E%3C/script%3E'));
        }
      

 var _gaq = _gaq || [];
 _gaq.push(['_setAccount', 'UA-39519764-1']);
 _gaq.push(['_trackPageview']);
 
 (function() {
  var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
  ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
  var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
 })();


 

 
 
  &lt;iframe src=&quot;https://www.googletagmanager.com/ns.html?id=GTM-P8Q37HN&quot; height=&quot;0&quot; width=&quot;0&quot; style=&quot;display:none;visibility:hidden&quot;>&lt;/iframe>
 
 

 
   
    Bezig met laden...
  
  
  
    
     interceptZkmx(window);
     
   

  Dashboard
   Diensten
  
    Facturen

   
    
     
      
      

       

        
          
           Facturen
         
        
          
           Facturen (voor 1 nov 2019)
         
        
      
      
     
    
   

   Bestellen
  Instellen
   
    
     
     
      
      

       

        
          Productinstellingen
        
          
           Mobiel
         
        
          
           Hosted Voice
         
        
          
           Mobile Connect
         
        
          Klantinstellingen
        
          
           Klantgegevens
         
        
          Mijn Tele2 Instellingen
        
          
           Gebruikersbeheer
         
        
          
           Accountbeheer

          
          Accountbeheer
          
            
             Accountbeheeroverzicht
           
          
            
             Accountoverzicht
           
          
            
             Account toewijzing
           
          
            
             Accountstructuur
           
          
            
             Gebruiksoverzicht
           
          
         
         
        
          
           Portalbeheer
          
          Portalbeheer

          
            
             Documenten onderhouden
           
          
            
             Documenten uploaden
           
          
            
             Handleidingen onderhouden
           
          
            
             Handleidingen uploaden
           
          
            
             Wijzig contact Info
           
          
            
             Product management
           
          
         
         
        
          
           Portal news beheer
         
        
          
           PDC beheer
          
           PDC beheer

           
             
              PDC Groep beheer
            
           
             
              PDC Item beheer
            
           
         
         
        
          
           Applicatiebeheer
          
          Applicatiebeheer

          
            
             Case management config
           
          
            
             Versies
           
          
            
             Hibernate cache-statistieken
           
          
            
             NLS session parameters
           
          
            
             Distributed cache info
           
          
            
             Connectiepoolmetrieken
           
          
            
             Database info
           
          
            
             Service-instellingen
           
          
            
             Systeem-eigenschappen
           
          
            
             Profiler Statistics
           
          
            
             Functie Groep onderhoud
           
          
            
             Functie Profiel onderhoud
           
          
            
             Job overzicht
           
          
            
             SessionMonitor
           
          
            
             Endpoints Monitor
           
          
            
             Geocoding
           
          
         
         
        
          
           Mijn profiel
          
           Mijn profiel

           
             
              Wachtwoord wijzigen
            
           
             
              Persoonlijk profiel
            
           
         
         
        
      
      
     
    
   
  Overig
  
   
    
    
     
     
      
function openPic(url, winName, winParams) {
var theWindow = window.open(url, winName, winParams);
if (theWindow) {
theWindow.focus();
}
}



function openIFrame(url) {
var theIframe = document.createElement('iframe');
theIframe.src = url;
theIframe.height=0;theIframe.width=0;theIframe.style.display= 'none';document.body.appendChild(theIframe);
if (theIframe) {
theIframe.focus();
}
}



 
  Klant Zoeken
 
 
  Order center
  
   Order center
   
    Bestellen
   
   
    Status Bestellingen
   
   
    Opzeggen
   
  
 
 
  Rapportage
  
   Rapportage
   
    Alle rapporten
   
   
    Pipeline rapportages
   
   
    Rapportage op maat
   
   
    Service rapportage
   
   
    Verbruiksmeldingen
   
   
    Status van mobiele instellingen
   
  
 
 
  Tele2 Direct
  
   Tele2 Direct
   
    Ericsson Portal
   
   
    Order/contactformulier
   
  
 
 
  Beschikbaarheidsbeheer
  
   Beschikbaarheidsbeheer
   
    Beschikbaarheidsoverzicht
   
   
    Beschikbaarheidsoverzicht
   
   
    Beschikbaarheidsrapportage
   
  
 
 
  Beveiligingsbeheer
  
   Beveiligingsbeheer
   
    Beveilingsincidentenoverz.
   
   
    Beveiligingsoverzicht
   
   
    Invoeren beveiligingsincident
   
   
    Beveiligingsrapportage
   
   
    Beveiligingsincidentenrapp.
   
   
    IP Whitelisting
   
  
 
 
  Capaciteitsbeheer
  
   Capaciteitsbeheer
   
    Capaciteitsoverzicht
   
   
    Capaciteitsrapportage
   
  
 
 
  Configuratiebeheer
  
   Configuratiebeheer
   
    CMDB
   
   
    CMDB aggregatie
   
   
    Netwerktopology
   
   
    Configuratieoverzicht
   
   
    Configuratierapportage
   
  
 
 
  Contractbeheer
  
   Contractbeheer
   
    Contracten
   
   
    Overige documenten
   
   
    Tarief informatie
   
   
    Product/service informatie
   
   
    Signed agreement
   
   
    Treatment letters
   
   
    Gespreksverslagen
   
  
 
 
  Dienstniveaubeheer
  
   Dienstniveaubeheer
   
    Dienstniveauoverzicht
   
   
    Dienstniveauoverzicht
   
   
    Dienstniveaurapportage
   
  
 
 
  Escalatiebeheer
  
   Escalatiebeheer
   
    Escalatieoverzicht
   
   
    Escalatierapportage
   
  
 
 
  Factuurbeheer
  
   Factuurbeheer
   
    Call Viewer
   
   
    Factuuroverzicht
   
   
    Rapportage (voice monitor)
   
   
    Beheer (voice monitor)
   
  
 
 
  Incidentbeheer
  
   Incidentbeheer
   
    Incidentenoverzicht
   
   
    Invoeren incident
   
   
    Incidentenrapportage
   
  
 
 
  Klachtenbeheer
  
   Klachtenbeheer
   
    Klachtenoverzicht
   
   
    Invoeren klacht
   
   
    Klachtenrapportage
   
  
 
 
  Dashboard
  
   Dashboard
   
    Diagnose stellen
   
   
    Toezicht
   
   
    Prestaties
   
   
    Real-time eigenschappen
   
  
 
 
  Prestatiebeheer
  
   Prestatiebeheer
   
    Performance dashboard
   
   
    Klantrapportage
   
   
    Technische overzichten
   
   
    Technische rapportage
   
   
    Overige rapportage
   
  
 
 
  Probleembeheer
  
   Probleembeheer
   
    Problemenoverzicht
   
   
    Invoeren probleem
   
   
    Probleemrapportage
   
   
    Plannen van aanpak
   
  
 
 
  Wijzigingsbeheer
  
   Wijzigingsbeheer
   
    Wijzigingenoverzicht
   
   
    Invoeren wijziging
   
   
    Wijzigingsrapportage
   
   
    Plannen van aanpak
   
  
 
 
  Tools
  
   Tools
   
    E-Health
   
   
    Servicenummers
   
   
    Mtel
   
   
    Mobistar monitoring
   
   
    Edge (USG)
   
   
    Ehealth (OT)
   
   
    Netdialog
   
   
    T-Mobile
   
  
 
 
  Klantingang
  
   Klantingang
   
    Klantingangoverzicht
   
   
    Klantingangrapportage
   
  
 
 
  Portal news beheer
 
 
  Beschikbaarheidscontrole
 
 
  Active monitoring
  
   Active monitoring
   
    Ontvangerbeheer
   
   
    Toewijzen ontvangers
   
   
    Ontvangersoverzicht
   
   
    Alarmrapportage
   
   
    Alarm dashboard
   
  
 
 
  Contractors maintenance
 
 
  RFC
  
   RFC
   
    Ontvangers beheer
   
   
    Toewijzen ontvangers
   
   
    Ontvangers overzicht
   
   
    RFC overzicht
   
  
 
 
  Partner zone
 
 
  Postal code checker
 
 
  Help
  
   Help
   
    Handleidingen
   
   
    Veelgestelde vragen
   
  
 
 
  Training
  
   Training
   
    CBT
   
  
 



     
    
   
  
 

  
    abel.fokkinga@tele2.com
    bp user management for tele2 nl
   

   
   
     
 
 Help
 

    
     
 
 Contact Informatie
 
     Service Desk 
     020-7501611 
     customerservice@tele2zakelijk.nl 
    
   
  $(&quot;#contact-button&quot;).popup(&quot;#contact-info&quot;, true);
 


   NotificatiesGeen notificaties beschikbaar
zkmx(
['zul.wgt.Div','notifications',{id:'notifications'},[
['zul.wgt.A','id_4_1_1',{sclass:'icon',target:'_top'},[
['zul.wgt.Label','id_4_1_1_1',{visible:false,sclass:'counter'},[]]]],
['zul.utl.Timer','notificationTimerID',{id:'notificationTimerID',$onTimer:true,repeats:true,delay:10000},[]],
['zul.wgt.Div','notifications_3',{sclass:'balloon'},[
['zul.wgt.Div','notifications_3_1',{sclass:'up-arrow'},[
['zul.wgt.Div','notifications_3_1_1',{},[]]]],
['zul.wgt.Label','notifications_3_2',{sclass:'title'},[]]]],
['zul.wgt.Div','notifications_4',{sclass:'panel'},[
['zul.wgt.Div','notifications_4_1',{sclass:'up-arrow'},[
['zul.wgt.Div','notifications_4_1_1',{},[]]]],
['zul.wgt.Div','notifications_4_2',{sclass:'header'},[
['zul.wgt.Label','notifications_4_2_1',{value:'Notificaties'},[]]]],
['zul.wgt.Div','notifications_4_3',{sclass:'list'},[
['zul.wgt.Div','notifications_4_3_1',{sclass:'footer'},[
['zul.wgt.Label','notifications_4_3_1_1',{value:'Geen notificaties beschikbaar'},[]]]]]]]]]],0,
['script','[&quot;$(\'#id_4_1_1\').popup($(\'#notifications_4\'));&quot;]']);




   

  
restoreZkmx(window);
    
   
  
  
   
    

	
		MIJN TELE2
		VOOR ZAKELIJK
	
	
		
			Zoek
			
			
			
			Zoek
		
		KlantnaamAccount IDKlantgroepGeen zoek resultaten gevonden
		
		
	

	
	#customerOverviewContainer, #layoutPane {
		background: white;
	}
	#search {
		padding: 30px 30px;
		width: 100%;
		box-sizing: border-box;
		-moz-box-sizing: border-box;
		-webkit-box-sizing: border-box;
	}
	.ie8 #search {
		padding: 30px 20px;
	}
	.grid {
		padding-top: 0px !important;
	}
	.search-label {
		padding-top: 8px !important;
		font-family: Tele2Font !important;
		font-weight: bold;
		font-size: 14px;
		color: #005eb8;
	}
	.new-textbox, .search-label, .new-textbox-siteid {
		margin-right: 20px;
	}
	#main-title {
		font-family: Tele2Font-heavy !important;
		text-transform: uppercase;
		font-size: 50px;
		line-height: 40px;
		margin: 15px 10px;
		display: block;
	}
	html.ie #main-title {
		top: 10px;
	}
	#main-title .part1 {
		color: #42b029;
	}
	#main-title .part2 {
		color: #005eb8;
	}
	.new-textbox, .new-textbox-siteid {
		width: 190px;
	}
	.new-button {
		min-width: 150px !important;
		width: 150px !important;
		vertical-align: top !important;
	}
	.bottom-action-bar {
		min-height: 45px;
	}
	.z-grid-body {
		overflow-y: scroll !important;
		height: 550px;
	}
	

	
	
zkmx(
[0,'wS0Q_',{dt:'z_g7c',cu:'',uu:'/zkau',ru:'/customerAssignment'},[
['zul.wnd.Window','id_1',{$$onMinimize:false,$$onZIndex:false,$$onMove:false,$onClose:true,$$onOpen:false,$onCancel:true,$$onMaximize:false,$$onSize:false,sclass:'bp-root-window'},[
['zk.Native','id_1_1',{id:'main-title',prolog:'\n\t&lt;div id=&quot;main-title&quot;>\n\t\t&lt;div class=&quot;part1&quot;>MIJN TELE2&lt;/div>\n\t\t&lt;div class=&quot;part2&quot;>VOOR ZAKELIJK&lt;/div>\n\t',epilog:'&lt;/div>'},[]],
['zhtml.Widget','layoutPane',{id:'layoutPane',prolog:'&lt;div id=&quot;layoutPane&quot; class=&quot;alpha omega gs-layout grid_24&quot; style=&quot;min-height: 700px; padding-bottom: 25px;&quot;>',epilog:'&lt;/div>'},[
['zhtml.Widget','id_1_2_1',{prolog:'&lt;div id=&quot;id_1_2_1&quot; class=&quot;inner&quot;>',epilog:'&lt;/div>'},[
['zk.Native','layoutPane_2',{id:'customerOverviewContainer',prolog:'\n\t&lt;div id=&quot;customerOverviewContainer&quot;>\n\t\t',epilog:'\n\t\t&lt;div class=&quot;bottom-action-bar&quot;>\n\t\t&lt;/div>\n\t&lt;/div>'},[
['zk.Native','layoutPane_2_1',{id:'search',prolog:'&lt;div id=&quot;search&quot;>\n\t\t\t',epilog:'\n\t\t&lt;/div>'},[
['zul.wgt.Label','layoutPane_2_1_1',{id:'searchLabel',sclass:'search-label',value:'Zoek'},[]],
['zk.Native','layoutPane_2_1_2',{prolog:'\n\t\t\t'},[]],
['zul.inp.Textbox','layoutPane_2_1_3',{id:'customerNameTextbox',$$onError:false,$$onChange:false,$onOK:true,domExtraAttrs:{'placeholder':'Klantnaam'
},sclass:'new-textbox'},[]],
['zk.Native','layoutPane_2_1_4',{prolog:'\n\t\t\t'},[]],
['zul.inp.Textbox','layoutPane_2_1_5',{id:'accountIdTextbox',$onOK:true,domExtraAttrs:{'placeholder':'Account ID'
},sclass:'new-textbox'},[]],
['zk.Native','layoutPane_2_1_6',{prolog:'\n\t\t\t'},[]],
['zul.inp.Textbox','layoutPane_2_1_7',{id:'siteIdTextbox',domExtraAttrs:{'placeholder':'Site ID'
},sclass:'new-textbox-siteid'},[]],
['zk.Native','layoutPane_2_1_8',{prolog:'\n\t\t\t'},[]],
['zul.wgt.Button','layoutPane_2_1_9',{id:'searchButton',$onClick:true,sclass:'button new-button',label:'Zoek'},[]]]],
['zk.Native','layoutPane_2_2',{prolog:'\n\t\t'},[]],
['zul.grid.Grid','layoutPane_2_3',{id:'customerGrid',$$onDataLoading:true,$$onInnerWidth:false,$$onRender:true,$$onScrollPos:false,$$onPageSize:true,sclass:'grid',_topPad:0,emptyMessage:'Geen zoek resultaten gevonden',_totalSize:0,_offset:0},[
['zul.grid.Columns','layoutPane_2_3_1',{$$onColSize:false},[
['zul.grid.Column','layoutPane_2_3_1_1',{$onSort:true,$onGroup:true,width:'45%',label:'Klantnaam'},[]],
['zul.grid.Column','layoutPane_2_3_1_2',{$onSort:true,$onGroup:true,width:'10%',label:'Account ID'},[]],
['zul.grid.Column','layoutPane_2_3_1_3',{$onSort:true,$onGroup:true,width:'45%',label:'Klantgroep'},[]]]]]]]]]]]],
['zk.Native','id_1_3',{prolog:'\n\n\t&lt;style>\n\t#customerOverviewContainer, #layoutPane {\n\t\tbackground: white;\n\t}\n\t#search {\n\t\tpadding: 30px 30px;\n\t\twidth: 100%;\n\t\tbox-sizing: border-box;\n\t\t-moz-box-sizing: border-box;\n\t\t-webkit-box-sizing: border-box;\n\t}\n\t.ie8 #search {\n\t\tpadding: 30px 20px;\n\t}\n\t.grid {\n\t\tpadding-top: 0px !important;\n\t}\n\t.search-label {\n\t\tpadding-top: 8px !important;\n\t\tfont-family: Tele2Font !important;\n\t\tfont-weight: bold;\n\t\tfont-size: 14px;\n\t\tcolor: #005eb8;\n\t}\n\t.new-textbox, .search-label, .new-textbox-siteid {\n\t\tmargin-right: 20px;\n\t}\n\t#main-title {\n\t\tfont-family: Tele2Font-heavy !important;\n\t\ttext-transform: uppercase;\n\t\tfont-size: 50px;\n\t\tline-height: 40px;\n\t\tmargin: 15px 10px;\n\t\tdisplay: block;\n\t}\n\thtml.ie #main-title {\n\t\ttop: 10px;\n\t}\n\t#main-title .part1 {\n\t\tcolor: #42b029;\n\t}\n\t#main-title .part2 {\n\t\tcolor: #005eb8;\n\t}\n\t.new-textbox, .new-textbox-siteid {\n\t\twidth: 190px;\n\t}\n\t.new-button {\n\t\tmin-width: 150px !important;\n\t\twidth: 150px !important;\n\t\tvertical-align: top !important;\n\t}\n\t.bottom-action-bar {\n\t\tmin-height: 45px;\n\t}\n\t.z-grid-body {\n\t\toverflow-y: scroll !important;\n\t\theight: 550px;\n\t}\n\t',epilog:'&lt;/style>'},[]],
['zk.Native','id_1_4',{prolog:'\n\n\t&lt;link href=&quot;/stylesheets/new-tables.css&quot; media=&quot;all&quot; type=&quot;text/css&quot; rel=&quot;stylesheet&quot;/>'},[]],
['zk.Native','id_1_5',{prolog:'\n\t&lt;link href=&quot;/stylesheets/form.css&quot; media=&quot;all&quot; type=&quot;text/css&quot; rel=&quot;stylesheet&quot;/>'},[]]]],
['zul.utl.Timer','id_2',{$onTimer:true,delay:2500,running:false},[]],
['zhtml.Widget','zk-popup-container',{id:'zk-popup-container',visible:false,prolog:'&lt;div id=&quot;zk-popup-container&quot; style=&quot;display:none;&quot; class=&quot;grid_24 alpha omega&quot;>',epilog:'&lt;/div>'},[
['zhtml.Widget','zk_popup_container_1',{prolog:'&lt;div id=&quot;zk_popup_container_1&quot; class=&quot;titlebar&quot;>',epilog:'&lt;/div>'},[
['zul.wgt.Label','zk_popup_container_1_1',{sclass:'main-title'},[]],
['zul.wgt.Label','zk_popup_container_1_2',{sclass:'sub-title'},[]]]],
['zhtml.Widget','zk_popup_container_2',{prolog:'&lt;div id=&quot;zk_popup_container_2&quot; class=&quot;inner&quot;>',epilog:'&lt;/div>'},[
['zhtml.Widget','zk_popup_container_2_1',{$onClick:true,prolog:'&lt;div id=&quot;zk_popup_container_2_1&quot; class=&quot;closer&quot;>',epilog:'&lt;/div>'},[]]]]]]]],0,
['clientInfo','[&quot;z_g7c&quot;]',
'script','[&quot;document.title = \'Klant Toewijzing\';&quot;]',
'focus','[&quot;layoutPane_2_1_3&quot;]',
'script','[&quot;$(\'#back-button\').click(function() { zk.Widget.$(\'#id_1\').fire(\'onCancel\'); })&quot;]',
'script','[&quot;$(\'#back-button\').removeClass(\'active\')&quot;]']);


&lt;div class=&quot;noscript&quot;>&lt;p>Sorry, JavaScript must be enabled.&lt;br/>Change your browser options, then &lt;a href=&quot;&quot;>try again&lt;/a>.&lt;/p>&lt;/div>


executeInterceptedZkAndCleanup(window);
   
   
   
   
    
 
 
  
    

















 
  
 
   
   
  
 

 







  


FeedbackPanel = new Feedback.Panel($(&quot;#page-feedback-layer&quot;), $(&quot;#feedback-panel&quot;), $(&quot;#feedback-panel .items&quot;));
FeedbackPanel.setSeverityOnLoad(&quot;none&quot;);
_alert = window.alert;
function alert(message) {
 FeedbackPanel.alert(message);
}

   
    
     Bezig met laden...
   
  
  
  
   
   
   
  

/html[@class=&quot;webkit chrome   win  js landscape pc&quot;]/body[@class=&quot;safari safari537&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;webkit chrome   win  js landscape pc&quot;]/body[@class=&quot;safari safari537&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
