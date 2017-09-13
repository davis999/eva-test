package io.udevice.developer

import io.udevice.developer.util.DeveloperFactory
import io.udevice.util.RestClient
import io.udevice.util.UrlUtils
import spock.lang.Specification

/**
 * Created by Davis on 17/9/13.
 */
class SignInTest extends Specification {
    def "Test1: developer sign in"() {
        given:
        def developerInfo = DeveloperFactory.getLogAndRegisterInfo()

        when:
        def result = RestClient.post(UrlUtils.DEVELOPER_SIGN_IN_URL, developerInfo)

        then:
        result != null
        result.status == 200
        result.data.developerView.email == developerInfo.email
    }
}
