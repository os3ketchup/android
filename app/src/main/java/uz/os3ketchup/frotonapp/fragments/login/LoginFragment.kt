package uz.os3ketchup.frotonapp.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.os3ketchup.frotonapp.R
import uz.os3ketchup.frotonapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
private var binding: FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentLoginBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnConfirm?.setOnClickListener {
            findNavController().navigate(R.id.profileEditFragment)
        }
    }


}