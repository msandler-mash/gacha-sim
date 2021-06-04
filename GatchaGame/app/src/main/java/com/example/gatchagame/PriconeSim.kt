package com.example.gatchagame

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PriconeSim : Activity(){
    lateinit var storyGatcha: GatchaSim

    val THREE_STAR_STORY_RATE = 1389
    val THREE_STAR_STORY_RATE2 = 1388
    val THREE_STAR_BOOST_RATE = 7000
    val THREE_STAR_NO_BOOST_RATE = 1059
    val THREE_STAR_NO_BOOST_RATE2 = 1058
    val TWO_STAR_STORY_RATE = 9474
    val TWO_STAR_STORY_RATE2 = 9473
    val TWO_STAR_BOOST_RATE = 0
    val TWO_STAR_NO_BOOST_RATE = 0
    val TWO_STAR_10_ROLL_RATE = 51316
    val TWO_STAR_10_ROLL_RATE2 = 51315
    val TWO_STAR_10_ROLL_BOOST_RATE = 0
    val ONE_STAR_RATE = 79500

    val THREE_STAR_POOL_STORY = listOf("Anna", "Maho", "Rino", "Hatsune", "Io", "Saren", "Nozomi", "Ninon", "Akino",
    "Makoto", "Shizuru", "Monika", "Djeeta", "Jun", "Arisa", "Kyoka")
    val THREE_STAR_POOL_STORY2 = listOf("Illya", "S. Pecorine")

    val TWO_STAR_POOL_STORY = listOf("Akari", "Miyako", "Yuki", "Suzuna", "Kaori", "Mimi", "Ayane", "Eriko", "Shinobu", "Mahiru",
    "Shiori", "Chika", "Kuka")
    val TWO_STAR_POOL_STORY2 = listOf("Tamaki", "Mifuyu", "Mitsuki", "Rin", "Misato", "Tsumugi")

    val ONE_STAR_POOL_STORY = listOf("Hiyori", "Rei", "Misogi", "Kurumi", "Yori", "Suzume", "Yukari", "Aoi", "Misaki", "Lima")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spin_layout)

        var titleText = findViewById<TextView>(R.id.gameTitle);
        titleText.text = "Princess Connect"

        setupStoryGatcha()
        var resultsText = findViewById<TextView>(R.id.resultsText)
        var singleSummonButton = findViewById<Button>(R.id.singleSummon)
        singleSummonButton.setOnClickListener {
            var result = storyGatcha.spin()
            resultsText.text = result.name

        }

    }

    fun setupStoryGatcha(){
        var namePool = ArrayList<String>()
        var ratePool = ArrayList<Int>()
        var i = 0

        while(i < THREE_STAR_POOL_STORY.size){
            namePool.add(THREE_STAR_POOL_STORY.get(i))
            ratePool.add(THREE_STAR_STORY_RATE)
            i++
        }
        i=0
        while(i < THREE_STAR_POOL_STORY2.size){
            namePool.add(THREE_STAR_POOL_STORY2.get(i))
            ratePool.add(THREE_STAR_STORY_RATE2)
            i++
        }
        i=0
        while(i < TWO_STAR_POOL_STORY.size){
            namePool.add(TWO_STAR_POOL_STORY.get(i))
            ratePool.add(TWO_STAR_STORY_RATE)
            i++
        }
        i=0
        while(i < TWO_STAR_POOL_STORY2.size){
            namePool.add(TWO_STAR_POOL_STORY2.get(i))
            ratePool.add(TWO_STAR_STORY_RATE2)
            i++
        }
        i=0
        while(i < ONE_STAR_POOL_STORY.size){
            namePool.add(ONE_STAR_POOL_STORY.get(i))
            ratePool.add(ONE_STAR_RATE)
            i++
        }

        storyGatcha = GatchaSim(namePool, ratePool)
        storyGatcha.makeGatcha()
    }
}
