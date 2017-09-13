package io.udevice.developer

import io.udevice.developer.util.DeveloperFactory
import io.udevice.util.RestClient
import io.udevice.util.UrlUtils
import spock.lang.Specification

/**
 * Created by Davis on 17/9/12.
 */
class SignUpTest extends Specification{
    def "Test1: developer sign up"() {
        given:
        def developerInfo = DeveloperFactory.getLogAndRegisterInfo()

        when:
        def result = RestClient.post(UrlUtils.DEVELOPER_SIGN_UP_URL, developerInfo)

        then:
        result.status == 200 || result.status == 409
    }
}
