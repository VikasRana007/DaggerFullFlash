package com.vikas.myapplicationusingdagger.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.vikas.myapplicationusingdagger.MyApplication
import com.vikas.myapplicationusingdagger.R
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    companion object {
        const val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }

    }

    @Inject
    lateinit var viewModel: HomeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)
        tvMessage.text = viewModel.getSomeData()
    }

    private fun getDependencies(){
        DaggerFragmentComponent
            .build()
            .applicationComponent((requireContext().applicationContext as MyApplication).applicationComponent)

    }


}