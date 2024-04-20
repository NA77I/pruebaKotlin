//natalia giselle ibañez
//recuperatorio tema 2 (registracion de alturas)
//05/07/22
//Realizar un programa que permita la registración de alturas de estudiantes de un club.
//El programa debe comenzar con un menú similar al siguiente donde el usuario pueda ingresar, alturas, modificar,
//dar de baja, consultar las alturas registradas y salir del programa.
package com.example.myapplication

import java.util.*

fun main(){
    val ingresarAltura: DoubleArray
    ingresarAltura= DoubleArray(5)

    var op=0
    while (op!=5){
        op=menu()

        when (op){

            1->{ alta(ingresarAltura)}
            2->{ modificar(ingresarAltura)}
            3->{ baja(ingresarAltura)}
            4->{ informe(ingresarAltura)}
        }
    }
}
fun menu() :Int {
    var op : Int = 0
    println(" REGISTRACIÓN DE ALTURAS DE ESTUDIANTES")
    println("*****************************************")
    println(" 1- ALTA")
    println(" 2- MODIFICACIÓN")
    println(" 3- BAJA")
    println(" 4- INFORME")
    println(" 5- SALIR")
    op = readLine()?.toInt()!!
    if (op==null){
        println("$op")
    }
    return op
}
fun alta(ingresarAltura:DoubleArray)  {

    val sc =Scanner(System.`in`)
    for ( i in ingresarAltura.indices){
        println("Ingrese altura: ")
        ingresarAltura[i]= sc.nextDouble()
        println("Alta de Altura realizada con exito!")}
}
fun informe (a:DoubleArray) {
    println("El informe es:")
    for (i in a.indices)
    {
        println("${a[i]}")}
}
fun modificar(ingresarAltura:DoubleArray){
    val sc=Scanner(System.`in`)
    var alturaModificar:Double= 0.0
    informe(ingresarAltura)
    println("Ingrese  la altura que desea modificar")

    alturaModificar=sc.nextDouble()
    for (i in ingresarAltura.indices){
        if (ingresarAltura[i]==alturaModificar){
            println("ingrese la nueva altura ")
            ingresarAltura[i]=sc.nextDouble()
        }
    }

}
fun baja(ingresarAltura:DoubleArray){
    val sc=Scanner(System.`in`)
    var alturaBaja:Double= 0.0
    informe(ingresarAltura)
    println("ingrese la altura que desea dar de baja")

    alturaBaja=sc.nextDouble()

    for (i in ingresarAltura.indices){
        if (ingresarAltura[i] == alturaBaja){
            println(" ingreso la altura ${ingresarAltura[i]} se dara de baja esta altura ")
            ingresarAltura[i]=0.0
        }
        else{ println("no coincide altura")}
    }
}
