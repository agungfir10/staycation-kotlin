package com.agungfir.staycation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agungfir.staycation.databinding.ItemHotelListBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class AdapterListHotel :
    RecyclerView.Adapter<AdapterListHotel.ViewHolder>() {

    private var hotels: List<Hotel> = listOf()

    class ViewHolder(private val binding: ItemHotelListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hotel: Hotel) {
            Glide.with(binding.root.context)
                .load(hotel.coverHotel)
                .transform(CenterCrop(), RoundedCorners(34))
                .override(500)
                .into(binding.coverHotel)

            binding.nameHotel.text = hotel.name
            binding.locationHotel.text = hotel.location
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemHotelListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(hotels[position])
    }

    override fun getItemCount(): Int = hotels.size

    fun setData(hotels: List<Hotel>) {
        this.hotels = hotels
    }

}