package com.sogileave.plugins

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml {
                head {
                    title("Sogileave - Hello World")
                    style {
                        +"""
                            body {
                                font-family: Arial, sans-serif;
                                display: flex;
                                justify-content: center;
                                align-items: center;
                                height: 100vh;
                                margin: 0;
                                background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
                            }
                            .container {
                                text-align: center;
                                background: white;
                                padding: 3rem;
                                border-radius: 10px;
                                box-shadow: 0 10px 40px rgba(0,0,0,0.2);
                            }
                            h1 {
                                color: #333;
                                margin: 0 0 1rem 0;
                            }
                            p {
                                color: #666;
                                margin: 0;
                            }
                        """.trimIndent()
                    }
                }
                body {
                    div(classes = "container") {
                        h1 { +"Hello World!" }
                        p { +"Welcome to Sogileave - Built with Ktor" }
                    }
                }
            }
        }
    }
}
