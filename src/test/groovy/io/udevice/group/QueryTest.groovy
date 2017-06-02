package io.udevice.group

import io.udevice.util.RestClient
import io.udevice.util.UrlUtils
import spock.lang.Specification

/**
 * Created by Davis on 17/6/1.
 */
class QueryTest extends Specification {
    def "Test1: find all group"() {
        given:
        def developerId = ["developerId": "first-developer-id"]

        when:
        def groups = RestClient.get(UrlUtils.GROUP_URL, developerId)

        then:
        groups != null
        groups.size >= 1
    }

    def "Test2: find a group"() {
        given:
        def groupId = "de79b871-25fa-4dbe-be21-efbe652e0b49"
        def url = UrlUtils.GROUP_URL + "/" + groupId

        when:
        def group = RestClient.get(url, null)

        then:
        group != null
        group.id == groupId
    }
}
