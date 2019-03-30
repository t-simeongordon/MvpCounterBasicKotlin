package com.example.tsg.mvpsimplecounterapp.model

import com.example.tsg.mvpsimplecounterapp.contract.ContractInterface


class MainActivityModel: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
}