package com.example.waveoffood.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.waveoffood.R
import com.example.waveoffood.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater, container, false)
//        return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.menu_banner1,ScaleTypes.FIT))//want to add image
        imageList.add(SlideModel(R.drawable.menubanner2,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.menubanner3,ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
         imageSlider.setItemClickListener(object:ItemClickListener{
             override fun doubleClick(position: Int) {
                 TODO("Not yet implemented")
             }
             override fun onItemSelected(position: Int) {
                 val itemPosition = imageList[position]
                 val itemMessage = "selected image $position"
                 Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
                 
             }
         })
    }

    companion object {

    }
}