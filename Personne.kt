//class personne

class Personne {
    var nom: String = ""
    var taille: Double = 0.0
    var poids: Double = 0.0
    var age: Int = 0


    constructor(nom: String, taille: Double, poids: Double,age: Int) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
        this.age = age
    }

    fun calculImc(): Double {
        val IMC: Double = poids / (taille * taille)
        return IMC
    }

    override fun toString(): String {
        return "Personne(nom='$nom', taille=$taille, poids=$poids)"
        }     
}

