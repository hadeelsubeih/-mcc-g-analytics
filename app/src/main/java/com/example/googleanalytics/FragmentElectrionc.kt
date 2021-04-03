package com.example.googleanalytics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleanalytics.db.Adapter
import com.example.googleanalytics.model.head
import kotlinx.android.synthetic.main.electroinclayout.view.*
import kotlinx.android.synthetic.main.foodlayout.view.*

class FragmentElectrionc : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.electroinclayout, container, false)
        val dataelectroinc = mutableListOf<head>()
        fun dataelectroinc() {


            dataelectroinc.add(
                head(   0,
                    "HP",
                    4F,
                    30.0,
                    "electroinc",
                    R.drawable.el1
                )
            )
            dataelectroinc.add(
                head(
                    0,
                    "Toshiba",
                    4F,
                    20000.2,
                    "electroinc",
                    R.drawable.el2               )
            )
            dataelectroinc.add(
                head(
                    0,
                    "Apple",
                    4F,
                    50000.0,
                    "electroinc",
                    R.drawable.el3                )
            )
            dataelectroinc.add(
                head(
                    0,
                    "Hp",
                    4F,
                    8000.0,
                    "electroinc",
                    R.drawable.el4                )
            )

        }
        dataelectroinc()
        root.food.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val Electronic =
            Adapter(activity!!,dataelectroinc)
        root.electroinc.adapter = Electronic
        return root
    }


}