package io.udevice.util

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

/**
 * Created by Davis on 17/6/1.
 */
class RestClient {
    public static def getJsonClient(String url) {
        def client = new RESTClient(url)
        client.contentType = ContentType.JSON
        client.handler.failure = { resp ->
            resp.status
        }
        return client
    }

    public static def getClient(String url) {
        def client = new RESTClient(url)
        client.handler.failure = { resp ->
            resp.status
        }
        return client
    }

    public static def post(String url, def body) {
        def client = getJsonClient(url)
        def response = client.post(body: body)
        return response.data
    }

    public static def put(String url, def body) {
        def client = getJsonClient(url)
        def response = client.put(body: body)
        return response.data
    }

    public static def get(String url, def query) {
        def client = getJsonClient(url)
        def response = client.get(query: query)
        return response.data
    }

    public static def delete(String url, def query) {
        def client = getClient(url)
        def response = client.delete(query: query)
        return response.status
    }
}
