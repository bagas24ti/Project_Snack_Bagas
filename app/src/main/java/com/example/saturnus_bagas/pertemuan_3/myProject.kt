package com.example.saturnus_bagas.pertemuan_3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.saturnus_bagas.R
import com.example.saturnus_bagas.databinding.ActivityThirdBinding

class myProject : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_third)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Inisialisasi komponen
        val inputNoTujuan: EditText = findViewById(R.id.inputNoTujuan)
        val btnKirim: Button = findViewById(R.id.btnKirim)

        binding.btnKirim.setOnClickListener {

            val intent = Intent(this, ThirdResultActivity::class.java)
            startActivity(intent)
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val nomor = inputNoTujuan.text
            Log.e("Klik btnSubmit","Pesan barhasil dikirim ke $nomor")

            Toast.makeText(this, "Pesan barhasil dikirim ke $nomor",
                Toast.LENGTH_SHORT).show()
        }
    }
}