package com.novaapps.findevents

class EventsService {

    static transactional = true
	YqlService yqlService

    def findEventsByZip(String zipCode) {
		def responseJson = yqlService.runQueryForJsonResponse("select * from upcoming.events where location=$zipCode")
		responseJson.query.results.event.each{println it
			print '***************'}		
		return "Response: "
    }
}
