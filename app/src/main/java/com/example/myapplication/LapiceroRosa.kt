package com.example.myapplication

import java.util.*

class LapiceroRosa {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var nombre: String
            var apellidoPaterno: String
            var apellidoMaterno: String
            var scanner = Scanner(System.`in`)

            // Pide al usuario que ingrese un texto y lee la línea de texto completa de la consola

            println("Ingresa tu nombre:")
            nombre = scanner.nextLine()
            println("Ingresa tu apellido paterno:")
            apellidoPaterno = scanner.nextLine()
            println("Ingresa tu apellido materno:")
            apellidoMaterno = scanner.nextLine()
            println("nombre: $nombre apellidoPaterno; $apellidoPaterno apellidoMaterno: $apellidoMaterno")
        }
    }
}