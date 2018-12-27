package turvo.gaurav.com.test.app.base

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import turvo.gaurav.com.test.app.rx.SchedulerProvider

open class BaseViewModel constructor(val schedulers: SchedulerProvider): ViewModel() {

    private val disposables: CompositeDisposable = CompositeDisposable()

    protected fun getCompositeDisposable(): CompositeDisposable {
        return disposables
    }

    override fun onCleared() {
        disposables.clear()
    }

}