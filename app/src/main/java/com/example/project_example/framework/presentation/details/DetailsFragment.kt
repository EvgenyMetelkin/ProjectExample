package com.example.project_example.framework.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.project_example.R
import com.example.project_example.business.domain.model.DataItem
import com.example.project_example.databinding.FragmentDetailsBinding
import com.example.project_example.framework.base.navArgsSafe
import com.squareup.picasso.Picasso

class DetailsFragment : Fragment() {

    private var fragmentDetailsBinding: FragmentDetailsBinding? = null

    private val args by navArgsSafe<DetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentDetailsBinding = FragmentDetailsBinding.inflate(inflater, container, false)
        return fragmentDetailsBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentDetailsBinding?.sourceName?.text = args.dataItem.name
        fragmentDetailsBinding?.imageView?.run { loadImage(this, args.dataItem.imageUrl) }
        fragmentDetailsBinding?.description?.text = args.dataItem.description
        fragmentDetailsBinding?.addToFavorites?.setFill(args.dataItem.getIsFavorite())
    }


    private fun loadImage(view: ImageView, url: String?) =
        Picasso.get()
            .load(url)
            .placeholder(R.drawable.shadow)
            .error(R.drawable.ic_launcher_background)
            .into(view)
}