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
import androidx.navigation.fragment.findNavController


class CineYaFragment : Fragment() {
    private var _binding: FragmentCineYaBinding? =null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentCineYaBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val toolbar = rootView.findViewById<Toolbar>(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            val drawerLayout = activity?.findViewById<DrawerLayout>(R.id.drawer_layout)
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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener{
            val action3 = CineYaFragmentDirections.actionCineYaFragmentToDetallePelicula()
            findNavController().navigate(action3)

        }
        binding.btnSocio.setOnClickListener {
            val action4 =CineYaFragmentDirections.actionCineYaFragmentToHazteSocioFragment3()
            findNavController().navigate(action4)
        }
    }




    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}