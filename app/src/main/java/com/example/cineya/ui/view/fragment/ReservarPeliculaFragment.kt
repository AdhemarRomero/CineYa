package com.example.cineya.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cineya.R
import com.example.cineya.databinding.FragmentCineYaBinding
import com.example.cineya.databinding.FragmentReservarPeliculaBinding

class ReservarPeliculaFragment : Fragment() {
    private var _binding: FragmentReservarPeliculaBinding? =null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReservarPeliculaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCompra.setOnClickListener{
            val action6 = ReservarPeliculaFragmentDirections.actionReservarPeliculaFragmentToDetalleCompraFragment()
            findNavController().navigate(action6)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}