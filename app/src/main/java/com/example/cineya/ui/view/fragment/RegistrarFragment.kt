package com.example.cineya.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cineya.R
import com.example.cineya.databinding.FragmentRegistrarBinding


/**
 * A simple [Fragment] subclass.
 * Use the [RegistrarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrarFragment : Fragment() {
    private var _binding: FragmentRegistrarBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentRegistrarBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    binding.btnVolver.setOnClickListener{
        val action = RegistrarFragmentDirections.actionRegistrarFragmentToLoginFragment2()
        findNavController().navigate(action)
    }


    }

}