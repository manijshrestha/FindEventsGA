package com.novaapps.findevents

class FindEventsController {

	EventsService eventsService
	
    def index = { }
	
	def findByZip = {
	        def zipCode = params.zipCode
		render eventsService.findEventsByZip(zipCode)
		}
}
