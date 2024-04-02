//Exercices class Nombre

class Voiture {
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0

    constructor() {
    }

    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }

    fun accelerer(vitesse: Int): String {
        this.vitesse += vitesse
        return "La vitesse est a $vitesse km/h"
    }
}
