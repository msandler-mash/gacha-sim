package com.example.gatchagame

import java.util.ArrayList


class GatchaSim (val names: ArrayList<String>, val rates: ArrayList<Float> ){
    lateinit var gatcha: ArrayList<Character>
    fun makeGatcha(){
        var i = 0
        while(i < names.size){
            var toAdd: Character
            if(i == 0){
                toAdd = Character(names.get(i), rates.get(i))
            } else {
                toAdd = Character(names.get(i), rates.get(i) + rates.get(i-1))
            }
            gatcha.add(toAdd);
        }
    }

    class Character (val name: String, val rate: Float){
    }
}