package kr.ac.kumohs20170334.w0303previewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class LottoViewModel: ViewModel() {
    private var _count =MutableLiveData<Int>(0)


    val count: LiveData<Int>
        get() = _count


    fun add() {
        _count.value = _count.value?.plus(1)
    }

}