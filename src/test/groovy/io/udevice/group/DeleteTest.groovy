package io.udevice.group

import io.udevice.group.util.GroupDataFactory
import io.udevice.util.RestClient
import io.udevice.util.UrlUtils
import spock.lang.Specification

/**
 * Delete test for group.
 *
 * Created by Davis on 17/6/1.
 */
class DeleteTest extends Specification {

    def "Test1: delete group"() {
        given:
        def id = GroupDataFactory.deletion.groupId
        def deleteRequest = GroupDataFactory.deletion.deleteRequest

        def url = UrlUtils.GROUP_URL + "/" + id

        when:
        def response = RestClient.delete(url, deleteRequest)

        then:
        response == 200
    }
}
