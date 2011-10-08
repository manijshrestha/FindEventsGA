package com.novaapps.findevents

class FindEventsController {

	EventsService eventsService
	
    def index = { }
	
	def findByZip = {
		render eventsService.findEventsByZip("55123")
		}
}
