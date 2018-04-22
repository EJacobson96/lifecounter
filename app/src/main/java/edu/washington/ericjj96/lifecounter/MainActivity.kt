package edu.washington.ericjj96.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        when (view.id) {
            p1Add1.id -> updateHealth(p1Health, p1, 1)
            p1Minus1.id -> updateHealth(p1Health, p1, -1)
            p1Add5.id -> updateHealth(p1Health, p1, 5)
            p1Minus5.id -> updateHealth(p1Health, p1, -5)
            p2Add1.id -> updateHealth(p2Health, p2, 1)
            p2Minus1.id -> updateHealth(p2Health, p2, -1)
            p2Add5.id -> updateHealth(p2Health, p2, 5)
            p2Minus5.id -> updateHealth(p2Health, p2, -5)
            p3Add1.id -> updateHealth(p3Health, p3, 1)
            p3Minus1.id -> updateHealth(p3Health, p3, -1)
            p3Add5.id -> updateHealth(p3Health, p3, 5)
            p3Minus5.id -> updateHealth(p3Health, p3, -5)
            p4Add1.id -> updateHealth(p4Health, p4, 1)
            p4Minus1.id -> updateHealth(p4Health, p4, -1)
            p4Add5.id -> updateHealth(p4Health, p4, 5)
            p4Minus5.id -> updateHealth(p4Health, p4, -5)
        }
    }

    fun updateHealth(health: TextView, player: TextView, amount: Int) {
        val newLife: Int = health.text.toString().toInt() + amount
        health.text = newLife.toString()

        if (newLife <= 0) {
            gameOver.text = player.text.toString() + " LOSES"
            gameOver.visibility = View.VISIBLE
        } else {
            gameOver.visibility = View.INVISIBLE
        }
    }
}
