package com.example.coba

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        action()
    }

    fun action() {
        btn_masuk.setOnClickListener{
            var i = Intent(activity, MasukActivity::class.java)
            startActivity(i)
        }

        btn_keluar.setOnClickListener{
            Toast.makeText(activity, "yahh kok keluar sih, ayok masuk aja", Toast.LENGTH_SHORT).show()
        }
    }

}