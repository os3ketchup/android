package uz.os3ketchup.frotonapp.fragments.myprofile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.os3ketchup.frotonapp.MainActivity
import uz.os3ketchup.frotonapp.R
import uz.os3ketchup.frotonapp.databinding.FragmentMainBinding
import uz.os3ketchup.frotonapp.databinding.FragmentMyProfileBinding


class MyProfileFragment : Fragment() {
    private var binding: FragmentMyProfileBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentMyProfileBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnShare?.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }


}