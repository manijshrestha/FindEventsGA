package com.novaapps.findevents

import com.sun.xml.internal.ws.transport.http.client.HttpClientTransport
import groovyx.net.http.HTTPBuilder

import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

/**
 * Helper class to call up YQL Service
 * 
 * @author manijshrestha
 *
 */
class YqlService {

    static transactional = true
	static final String YQL_URL = "http://query.yahooapis.com"
    
	def runQueryForJsonResponse(String query) {
		def http = new HTTPBuilder(YQL_URL)
		 
		http.request(GET, JSON) {
			uri.path = '/v1/public/yql'
			uri.query=[format:'json', q: query]
	
			response.success = { resp, json ->
						return json
			}		
		}
    }
}
