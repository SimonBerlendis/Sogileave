package com.sogileave

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*

class ApplicationTest {

    @Test
    fun testRoot() = testApplication {
        application {
            module()
        }

        val response = client.get("/")

        assertEquals(HttpStatusCode.OK, response.status)
        assertTrue(response.bodyAsText().contains("Hello World!"))
        assertTrue(response.bodyAsText().contains("Sogileave"))
    }

    @Test
    fun testRootReturnsHtml() = testApplication {
        application {
            module()
        }

        val response = client.get("/")

        assertEquals(ContentType.Text.Html.withCharset(Charsets.UTF_8), response.contentType())
    }

    @Test
    fun testHealthEndpoint() = testApplication {
        application {
            module()
        }

        val response = client.get("/health")

        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals(ContentType.Text.Plain.withCharset(Charsets.UTF_8), response.contentType())
        assertEquals("OK", response.bodyAsText())
    }
}
