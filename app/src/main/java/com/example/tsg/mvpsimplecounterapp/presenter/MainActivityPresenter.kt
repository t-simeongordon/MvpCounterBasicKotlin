package com.example.tsg.mvpsimplecounterapp.presenter

import com.example.tsg.mvpsimplecounterapp.contract.ContractInterface
import com.example.tsg.mvpsimplecounterapp.model.MainActivityModel


class MainActivityPresenter(_view: ContractInterface.View): ContractInterface.Presenter {

    private var view: ContractInterface.View = _view
    private var model: ContractInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()

}