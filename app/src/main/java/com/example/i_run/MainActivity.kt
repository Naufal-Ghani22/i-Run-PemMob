package com.example.i_run

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Kenalan dulu sama tombol Login yang ada di XML tadi
        val tombolLogin = findViewById<Button>(R.id.btnLogin)

        // 2. Suruh tombolnya ngapain kalau diklik
        tombolLogin.setOnClickListener {
            // 3. Siapkan "niat" (Intent) untuk pindah dari sini ke BerandaActivity
            val intentMenujuBeranda = Intent(this, Beranda::class.java)

            // 4. Jalankan niatnya!
            startActivity(intentMenujuBeranda)

            // Opsional: Tambahkan finish() jika kamu tidak ingin user bisa kembali
            // ke halaman welcome saat menekan tombol back di HP.
            // finish()
        }
    }
}
