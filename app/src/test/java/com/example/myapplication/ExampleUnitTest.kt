package com.example.myapplication

import org.junit.Test

import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    fun main() {
        var nombre: String
        var apellidoPaterno: String
        var apellidoMaterno: String
        var scanner = Scanner(System.`in`)

        // Pide al usuario que ingrese un texto y lee la línea de texto completa de la consola

        while (scanner.hasNextLine()) {
            println("Ingresa tu nombre:")
            println("Ingresa tu apellido paterno:")
            println("Ingresa tu apellido materno:")
            nombre = scanner.nextLine()
            apellidoPaterno = scanner.nextLine()
            apellidoMaterno = scanner.nextLine()
            println("$nombre $apellidoPaterno $apellidoMaterno")
        }


    }
}