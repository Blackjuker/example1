class User (email:String, var nom:String,var prenom:String){

    var email:String = email
    get() {
        println("Nous somme entrain de recupere l'email")
        return field
    }
    set(value) {
        println("Nous sommes entrain de mettre l'email")
        field = value
    }
}