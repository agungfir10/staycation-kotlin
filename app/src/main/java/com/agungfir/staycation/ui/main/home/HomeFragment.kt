package com.agungfir.staycation.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.agungfir.staycation.AdapterCardHotel
import com.agungfir.staycation.AdapterListHotel
import com.agungfir.staycation.DataDummy
import com.agungfir.staycation.databinding.FragmentHomeBinding
import com.bumptech.glide.Glide

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapterCardHotel = AdapterCardHotel()
        adapterCardHotel.setData(DataDummy.getHotels())
        binding.rvTopPicks.adapter = adapterCardHotel

        val adapterListHotel = AdapterListHotel()
        adapterListHotel.setData(DataDummy.getHotels())
        binding.rvNearYou.adapter = adapterListHotel

        Glide.with(requireContext())
            .load("https://d2qp0siotla746.cloudfront.net/img/use-cases/profile-picture/template_3.jpg")
            .circleCrop()
            .into(binding.profileImage)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}