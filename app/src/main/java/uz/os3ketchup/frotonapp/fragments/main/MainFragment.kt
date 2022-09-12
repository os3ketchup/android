package uz.os3ketchup.frotonapp.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.os3ketchup.frotonapp.R
import uz.os3ketchup.frotonapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentMainBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            mainToolbar.setNavigationOnClickListener {
                drawerLayout.open()
                navigationView.setNavigationItemSelectedListener { menuItem ->
                    when (menuItem.itemId) {
                        R.id.mainFragment -> {
                            findNavController().navigate(R.id.mainFragment)
                            drawerLayout.close()
                        }
                        R.id.friendsFragment->{
                            findNavController().navigate(R.id.friendsFragment)
                            drawerLayout.close()
                        }
                        R.id.settingsFragment ->{
                            findNavController().navigate(R.id.settingsFragment)
                            drawerLayout.close()
                        }
                        R.id.postsFragment->{
                            findNavController().navigate(R.id.postsFragment)
                            drawerLayout.close()
                        }
                    }
                    true
                }
            }

        }
    }

}