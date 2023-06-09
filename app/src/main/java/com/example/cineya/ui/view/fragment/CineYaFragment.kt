package com.example.cineya.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.cineya.R
import com.example.cineya.databinding.FragmentCineYaBinding
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout



class CineYaFragment : Fragment() {
    private var _binding: FragmentCineYaBinding? =null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_cine_ya, container, false)

        val toolbar = rootView.findViewById<Toolbar>(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            val drawerLayout = activity?.findViewById<DrawerLayout>(R.id.drawer_layout) // Reemplaza "drawer_layout" con el ID de tu DrawerLayout
            drawerLayout?.let {
                if (it.isDrawerOpen(GravityCompat.START)) {
                    it.closeDrawer(GravityCompat.START)
                } else {
                    it.openDrawer(GravityCompat.START)
                }
            }
        }

        return rootView
    }




    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}