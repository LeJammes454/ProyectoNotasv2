package com.lejammes454.proyectonotas.adaptadores

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lejammes454.proyectonotas.NotasFragment
import com.lejammes454.proyectonotas.TareasFragment

class AdaptadorFragmentos(fa:FragmentActivity) :FragmentStateAdapter(fa){

    companion object{
        private  const val ARG_OBJECT = "object"
    }

    //Se colcoa el numero el numero de paginas que se usaran en el view page
    override fun getItemCount(): Int =2

    override fun createFragment(position: Int): Fragment {
        val fragment = NotasFragment()
        fragment.arguments = Bundle().apply { putInt(ARG_OBJECT,position+1) }
        return when(position){
            0-> {NotasFragment()}
            1-> {TareasFragment()}
            else-> {NotasFragment()}
        }
    }
}