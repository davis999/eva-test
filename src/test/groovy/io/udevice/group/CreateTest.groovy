package io.udevice.group

import io.udevice.group.util.GroupDataFactory
import io.udevice.util.RestClient
import io.udevice.util.UrlUtils
import spock.lang.Specification

/**
 * Group create test.
 */
class CreateTest extends Specification{

    def "Test1: create basic group"() {
        given:
        def basicGroup = GroupDataFactory.basicGroup

        when:
        def result = RestClient.post(UrlUtils.GROUP_URL, basicGroup)

        then:
        result != null
        println(result.id)
    }

    def "Test2: create group"() {
        given:
        def group = GroupDataFactory.group

        when:
        def result = RestClient.post(UrlUtils.GROUP_URL, group)

        then:
        result != null
    }
}
