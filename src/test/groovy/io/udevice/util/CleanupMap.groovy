package io.udevice.util

/**
 * Created by Davis on 17/6/1.
 */
class CleanupMap {
    private Map<String, Integer> objects

    CleanupMap() {
        this.objects = new HashMap<>()
    }

    public void addObject(String id, Integer version) {
        objects.put(id, version)
    }

    public Map getAllObjects() {
        return this.objects
    }

    public boolean isEmpty() {
        return objects.isEmpty()
    }
}
