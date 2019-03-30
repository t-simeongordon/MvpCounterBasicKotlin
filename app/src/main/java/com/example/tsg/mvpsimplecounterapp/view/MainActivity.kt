package com.example.tsg.mvpsimplecounterapp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tsg.mvpsimplecounterapp.R
import com.example.tsg.mvpsimplecounterapp.contract.ContractInterface
import com.example.tsg.mvpsimplecounterapp.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
