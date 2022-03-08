import kotlin.test.fail
import 


var apiResponse = ApiResponse.OK
val numberToFind = 55


fun main(args:Array<String>){
    println("Bonjour")


    val user = User(email="mikarno2@gmail.com",nom="Ngabgna",prenom="Arnaud")





    val nomUser = user.nom?: throw IllegalArgumentException("Name required")
    val prenomUser = user.prenom ?: fail("Prenom required")
    println("l'email ${user.email}")

   println ("Valeur ${minof(14,62)}")
    println("code ${codeErreur(404)}")

    when (apiResponse){
        ApiResponse.OK -> println("OK")
        ApiResponse.FORBIDDEN -> print("Error")
        ApiResponse.NOT_FOUND -> print("PB serveur")
        ApiResponse.UNKNOWN -> print("Erreur connec")
    }

    when(numberToFind){
        in 1..33->print("Number is between 1 and 33")
        in 34..40->print("Number is between 34 and 40")
        in 41..60->print("Number is between 41 and 60")
    }

    val names = listOf("Jake Wharton","Ngabgna arnaud","Joe Birch")

    for(name in names ){
        println("This developer rocks : $name")
    }

    for((index,value) in names.withIndex()){
        println("this developer with number $index rocks : $value")
    }

    println ("size of ${getDefaultSize(names)}")

    println("le nombre est ${subStractNumber(2,5)}")

}

fun fail (message : String ) : Nothing = throw IllegalArgumentException(message)


fun getDefaultSize(anyObject: Any) = when (anyObject){
    is String -> anyObject.length
    is List<*> -> anyObject.size
    else -> 0
}

 fun fail2(message2:String): Nothing = throw IllegalArgumentException(message2)
 fun subStractNumber(a:Int,b:Int) = if (a>=b)  a-b else throw Exception("a is smaller than b ")

fun codeErreur(asro : Int) = when (asro){
    200 -> print("OK")
    404 -> print("NOT FOUND")
    401 -> print("UNAUTHORIZED")
    403 -> print("FORBIDDEN")
    else -> print("UNKNOWN")
}
fun minof(c:Int){
    minof(c,0)
}
fun minof(a:Int, b:Int) = if (a>b) b else a

fun helle(): Unit = println ("Bonsoir")
fun test():Unit{print ("Bonne nuit ")
println("Arnaud")}

var hello: Int = minof(15,25)

