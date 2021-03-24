open class Pokemon(var name: String, var hp: Double, var atk: Double) {
    // pas besoin du toString() ni du constructeur généré auto avec data class
    fun isDead(hp: Double): Boolean {
        return hp <= 0
    }

    open fun attaquer(p: Pokemon) {
//        return "'$p.name' Health Point :" p.hp - atk
        p.hp -= atk
//        println("'${p.name}' Health Point :" + p.hp)
    }

    fun watchHealthPoints(p: Pokemon){
        println("${p.name} Health Points : ${p.hp}")
    }

    override fun toString(): String {
        return "Pokemon(name='$name', hp=$hp, atk=$atk)"
    }
}

// vérification de type -> when
class Feu(name: String, hp: Double, atk: Double) : Pokemon(name, hp, atk) {
    override fun attaquer(p: Pokemon) {
        if (p is Plante) {
            p.hp -= atk*2
        } else if (p is Eau || p is Feu) {
            p.hp -= atk*0.5
        }
        if (p.hp <= 0){
            println("${p.name} is dead")
        }

        super.watchHealthPoints(p) // -> pas besoin du open
//        println("${p.name} Health Points : ${p.hp}")
    }
}

class Eau(name: String, hp: Double, atk: Double) : Pokemon(name, hp, atk) {
    override fun attaquer(p: Pokemon) {
        when (p) {
            is Plante -> p.hp -= atk*0.5
            is Feu -> p.hp -= atk*2
            is Eau -> p.hp -= atk*0.5
        }
        println("${p.name} Health Points : ${p.hp}")
        if (p.hp <= 0){
            println("${p.name} is dead")
        }
    }
}

class Plante(name: String, hp: Double, atk: Double) : Pokemon(name, hp, atk) {
    override fun attaquer(p: Pokemon) {
        when (p) {
            is Plante -> p.hp -= atk*0.5
            is Eau -> p.hp -= atk*2
            is Feu -> p.hp -= atk*0.5
        }
        println("${p.name} Health Points : ${p.hp}")

        if (p.hp <= 0){
            println("${p.name} is dead")
        }
    }
}

fun main(){
    val p1 = Pokemon("p1", 100.0, 40.0)
    val p2 = Feu("p2", 100.0, 40.0)
    val p3 = Eau("p3", 100.0, 40.0)
    val p4 = Plante("p4", 100.0, 40.0)

    p1.attaquer(p2)
    p2.attaquer(p1)

    p3.attaquer(p4)
    p3.attaquer(p2)

    p4.attaquer(p3)
    p4.attaquer(p1)

    p4.attaquer(p2)
    p4.attaquer(p2)
    p4.attaquer(p2)
    p4.attaquer(p2)

    println(p1.toString())
    println(p2.toString())
    println(p3)
    println(p4)
}





