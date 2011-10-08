package com.novaapps.findevents

import grails.test.*

class FindEventsControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testFindByZip() {
		controller.findByZip()
		assertEquals "Finding by Zip!", controller.response.contentAsString
    }
}
