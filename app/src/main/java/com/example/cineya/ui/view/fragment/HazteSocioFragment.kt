package com.example.cineya.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cineya.R
import com.example.cineya.databinding.FragmentDetallePeliculaBinding
import com.example.cineya.databinding.FragmentHazteSocioBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HazteSocioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HazteSocioFragment : Fragment() {
    private var _binding: FragmentHazteSocioBinding?=null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHazteSocioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSocio.setOnClickListener {
            val action = HazteSocioFragmentDirections.actionHazteSocioFragmentToPerfilFragment()
            findNavController().navigate(action)
        }
    }
    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}