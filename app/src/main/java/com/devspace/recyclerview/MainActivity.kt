package com.devspace.recyclerview

import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Create data class
        // Create list from data class type
        //Create Adapter
        //Set Adapter
        //Linear layout manager

        val rvList = findViewById<RecyclerView>(R.id.rv_list)


    }
}

val contacts = listOf(
    Contact(
        name = "Maria",
        phone = "(55) 351 9103 635 965",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Roque",
        phone = "(55) 11 987 478 965",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Matilde",
        phone = "(351) 9135 478 965",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Afonso",
        phone = "(351) 9035 438 061",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Leonor",
        phone = "(351) 9107 478 763",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "João",
        phone = "(351) 9035 078 356",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Paula",
        phone = "(351) 9035 578 765",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Rodrigo",
        phone = "(351) 9635 278 731",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Ana",
        phone = "(351) 9105 378 330",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Diogo",
        phone = "(351) 9003 100 932",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Miguel",
        phone = "(351) 9010 350 291",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Madalena",
        phone = "(351) 9010 350 291",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Rita",
        phone = "(351) 9110 650 691",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Diego",
        phone = "(55) 11 931 578 265",
        icon = R.drawable.sample13

    ),
    Contact(
        name = "Nuno",
        phone = "(351) 901 138 119",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Miguel",
        phone = "(351) 910 694 701",
        icon = R.drawable.sample15
    ),
)

