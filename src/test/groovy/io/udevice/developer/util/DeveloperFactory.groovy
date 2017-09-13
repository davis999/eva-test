package io.udevice.developer.util

/**
 * Created by Davis on 17/9/11.
 */
final class DeveloperFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getLogAndRegisterInfo() {
        return slurper.parse(new FileReader('src/test/resources/developer/LogAndRegister.json'))
    }
}
