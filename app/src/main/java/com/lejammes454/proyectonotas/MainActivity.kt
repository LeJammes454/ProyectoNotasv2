package com.lejammes454.proyectonotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.lejammes454.proyectonotas.adaptadores.AdaptadorFragmentos
import com.lejammes454.proyectonotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adaptadorFragmentos by lazy { AdaptadorFragmentos(this) }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // ActivityMain
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.viewfragment.adapter=adaptadorFragmentos
        val tabLayoutMediator = TabLayoutMediator(binding.tabPrincipal,binding.viewfragment,TabLayoutMediator.TabConfigurationStrategy{
            tab, position -> when(position+1){
                1->{
                    tab.text="Notas"
                }
                2->{
                    tab.text="Tareas"
                }
            }
        })
        tabLayoutMediator.attach()
    }


}