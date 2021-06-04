package com.example.gatchagame

import java.util.ArrayList
import kotlin.random.Random


class GatchaSim (val names: ArrayList<String>, val rates: ArrayList<Int> ) {
    lateinit var gatcha: ArrayList<Character>
    fun makeGatcha() {
        gatcha = ArrayList<Character>()
        var i = 0
        while (i < names.size) {
            var toAdd: Character
            if (i == 0) {
                toAdd = Character(names.get(i), 0)
            } else {
                toAdd = Character(names.get(i), rates.get(i) + gatcha.get(i - 1).rate)
            }
            gatcha.add(toAdd);
            i++
        }
    }

    fun spin(): Character {
        var roll = Random.nextInt(0,1000000)
        var i = 0
        lateinit var toReturn: Character
        while (i < names.size) {
            if (gatcha.get(i).rate < roll) {
                if (i == names.size - 1) {
                    toReturn = gatcha.get(i)
                    break
                }
                if (gatcha.get(i + 1).rate > roll) {
                    toReturn = gatcha.get(i)
                    break
                }
            }
            i++
        }
        return toReturn
    }

    class Character(val name: String, val rate: Int) {
    }
}
