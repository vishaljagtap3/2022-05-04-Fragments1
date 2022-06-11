package com.bitcode.fragments1.fragments

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bitcode.fragments1.R
import com.bitcode.fragments1.databinding.CurrencyFragmentBinding
import org.w3c.dom.Text
import kotlin.random.Random

class CurrencyFragment : Fragment() {

    private lateinit var binding: CurrencyFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = CurrencyFragmentBinding.inflate(inflater)

        setUpListeners()

        return binding.root
    }

    private fun setUpListeners() {

        binding.btnRefresh.setOnClickListener {
            var random = Random(System.currentTimeMillis())

            var inrValue = Math.abs(random.nextFloat() * 100)
            binding.txtINR.setText("INR $inrValue")
        }

    }

    //2
    /*private lateinit var txtUSD : TextView
    private lateinit var txtINR : TextView
    private lateinit var btnRefresh : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.currency_fragment, null)

        initViews(view)
        setUpListeners()

        return view
    }

    private fun setUpListeners() {
        btnRefresh.setOnClickListener(BtnRefreshClickListener())
    }

    private inner class BtnRefreshClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            var random = Random(System.currentTimeMillis())

            var inrValue = Math.abs(random.nextFloat())
            txtINR.setText("INR $inrValue")
        }
    }

    private fun initViews(view : View) {
        txtUSD = view.findViewById(R.id.txtUSD)
        txtINR = view.findViewById(R.id.txtINR)
        btnRefresh = view.findViewById(R.id.btnRefresh)
    }*/


    //1
    /*override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var txtTitle = TextView(activity)

        txtTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
        txtTitle.setText("Currency Fragment")

        txtTitle.setOnClickListener(TxtTitleClickListener())

        return txtTitle
    }*/

    private inner class TxtTitleClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            Toast.makeText(activity, "Currency Title Clicked", Toast.LENGTH_LONG)
                .show()
        }
    }

}