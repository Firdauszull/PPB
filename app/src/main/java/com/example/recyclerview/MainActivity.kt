package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact ("Muhammad Firdaus Zulkarnain", "082138953980"),
            MyContact ("Muhammad Syarif Hidayat","081935489684"),
            MyContact ("Achmad Rizal Subkhi","085334942123"),
            MyContact ("Ngabdul Latif","085803572357"),
            MyContact ("Dewi Kusuma","085729390393"),
            MyContact ("Rayhan","082185360181"),
        )
        adapter = MyContactAdapter(listStudent)
        val layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter = adapter
    }
}