package com.novaapps.findevents.util

import groovyx.net.http.HTTPBuilder
import java.util.regex.Pattern

import static groovyx.net.http.ContentType.TEXT

class HtmlSulperController {

    def index = { }
	
	def parseContent = {
		def query = params.query
		
		def result
		
		def http = new HTTPBuilder('http://jokes4all.net')
		    http.get(path:'/joke_'+query+'.html', contentType: TEXT){resp, reader ->
			def htmlResponse = reader.text.toString()
			def pattern = Pattern.compile('<td class="joke-jokeL">(.+?)</td>')
			def tableContent = pattern.matcher(htmlResponse) 
			tableContent.find()
			result = '<html><head><meta property="og:title" content="Lets Laugh together!"/><meta property="og:description" content="Lets Laugh together!" /></head><body><article><div>' + tableContent.group(1) + "</div></article></body></html>"
			}
		
		/*def test = withHttp(uri: "http://jokes4all.net/joke_321.html", contentType: HTML) {
   def html = get(path : '/joke_321.html')
   result = html
			}*/
		
		render result
		}
}
