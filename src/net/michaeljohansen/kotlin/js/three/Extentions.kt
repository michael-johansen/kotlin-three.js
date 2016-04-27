package net.michaeljohansen.kotlin.js.three

import org.w3c.dom.Document
import org.w3c.dom.Window
import org.w3c.dom.events.Event

@native
fun <T> Array<T>.push(item: T): Unit = noImpl

@native
fun Window.addEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = noImpl

@native
fun Window.removeEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = noImpl

@native
fun Document.addEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = noImpl

@native
fun Document.removeEventListener(name: String, vCode: (Event) -> Unit, idk: Boolean): Unit = noImpl
