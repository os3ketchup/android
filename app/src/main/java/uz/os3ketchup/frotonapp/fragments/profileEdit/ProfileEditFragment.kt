package uz.os3ketchup.frotonapp.fragments.profileEdit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.os3ketchup.frotonapp.MainActivity
import uz.os3ketchup.frotonapp.R
import uz.os3ketchup.frotonapp.databinding.FragmentProfileEditBinding


class ProfileEditFragment : Fragment() {
private lateinit var binding:FragmentProfileEditBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileEditBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener {
            findNavController().navigate(R.id.action_profileEditFragment_to_myProfileFragment)
        }
    }

}