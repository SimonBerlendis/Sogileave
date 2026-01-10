package com.sogileave.plugins

import io.ktor.server.application.*

fun Application.configureTemplating() {
    // kotlinx.html is automatically available once ktor-server-html-builder is included
    // No explicit configuration needed, but we keep this function for consistency
    // and future templating enhancements
}
