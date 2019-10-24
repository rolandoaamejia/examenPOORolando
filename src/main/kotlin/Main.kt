val estado = classElevador()
val sitio = classLugar()

fun main(args: Array<String>)
{

    val ingresePiso:Int?

    println("Ingrese el piso al que desea ir: ")
    ingresePiso = readLine()?.toInt() as Int
    while(ingresePiso<15)
    {

        println("El Elevador se encuentra detenido en el Lobby")
        print(estado)
        println(sitio)

        if(ingresePiso==sitio)
        {
            println("El elevador a llegado al piso indicado")
        }

    }





}