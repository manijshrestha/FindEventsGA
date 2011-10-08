package com.novaapps.findevents

import groovy.xml.MarkupBuilder

class EventsService {

    static transactional = true
	YqlService yqlService

    def findEventsByZip(String zipCode) {
		def responseJson = yqlService.runQueryForJsonResponse("select * from upcoming.events where location=$zipCode")
				
		return getEventDiv(responseJson)
    }

    
	/**
	* Should return a div with all the events
	* <div id = "events">
	*  <div id = "event1">Some Info here</div>
	* </div>
	**/
	private def getEventDiv(def jsonObject){
	def writer = new StringWriter()
	def html = new MarkupBuilder(writer)
	def count=1
	
	html.div(id:'events'){
		jsonObject.query.results.event.each{ 
		
		def eventInfo = it // Only available at the higher level so we 
				   // are going to get ref to it at this level		
                 
			// EVENT Tag
			div (id: "event${count++}", class:'event') {
				       div(class:'event_icon', eventInfo.photo_url)
				       div(class:'event_name', eventInfo.name)
				       div(class:'event_venue', eventInfo.venue_name)
 				}
			}
		
		}
       
	return writer
	} 
}
