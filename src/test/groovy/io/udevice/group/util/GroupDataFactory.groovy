package io.udevice.group.util

/**
 * Group data factory.
 * Convert json file into object.
 */
final class GroupDataFactory {
    static def slurper = new groovy.json.JsonSlurper()

    public static def getBasicGroup() {
        return slurper.parse(new FileReader('src/test/resources/group/BasicGroup.json'))
    }

    public static def getGroup() {
        return slurper.parse(new FileReader('src/test/resources/group/Group.json'))
    }

    public static def getDeletion() {
        return slurper.parse(new FileReader('src/test/resources/group/Deletion.json'))
    }
}
