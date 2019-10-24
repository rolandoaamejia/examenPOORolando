import java.util.*
var random = Random()

open class classElevador(var posicion : Int =(random.nextInt(3)+1))
{
    override fun toString(): String {

         if(posicion==1)
         {
             return "El Elevador esta:DETENIDO"
         }
        if(posicion==2)
        {
            return "El Elevador esta:ARRIBA"
        }
        else
        {
            return "El Elevador esta:ABAJO"
        }

    }


}