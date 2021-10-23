package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)

        binding.LoginButtonID.setOnClickListener{
            if(binding.editTextTextEmailAddress.text.isEmpty()&& binding.editTextTextPassword.text.isEmpty()){
                Toast.makeText(requireContext(),"Please Enter all the field",Toast.LENGTH_LONG).show()
            }else{
                findNavController().navigate(R.id.action_loginFragment_to_onboardingFragment)
            }

        }
        binding.RegisterButtonID.setOnClickListener{
            if(binding.editTextTextEmailAddress.text.isEmpty()&& binding.editTextTextPassword.text.isEmpty()){
                Toast.makeText(requireContext(),"Please Enter all the field",Toast.LENGTH_LONG).show()
            }else{
                findNavController().navigate(R.id.action_loginFragment_to_onboardingFragment)
            }

        }
       // binding.RegisterButtonID.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_onboardingFragment, null))



        return binding.root
    }



}