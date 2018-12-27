package turvo.gaurav.com.test.app.viewmodel


import android.arch.lifecycle.MutableLiveData
import timber.log.Timber
import turvo.gaurav.com.test.app.SchedulersFacade
import turvo.gaurav.com.test.app.base.BaseViewModel
import turvo.gaurav.com.test.app.domain.interactor.FetchItemListUseCase
import turvo.gaurav.com.test.app.domain.interactor.GetItemsUseCase
import turvo.gaurav.com.test.app.domain.interactor.SaveItemsUseCase
import javax.inject.Inject

class UserViewModel @Inject constructor(
        private val fetchItemListUseCase: FetchItemListUseCase,
        private val saveItemsUseCase: SaveItemsUseCase, schedulersFacade: SchedulersFacade) : BaseViewModel(schedulersFacade) {


    fun fetchItemList() {

        // TODO have to create mapper to convert ItemModel to Item that will render from Database
        val fetchItemListDisposal = fetchItemListUseCase.execute()
                .subscribeOn(schedulers.io())
                .map { items ->
                    items.forEach { item ->

                    }
                    saveItemsUseCase.execute(items)
                }
                .observeOn(schedulers.ui())
                .subscribe({

                }, { err ->
                    Timber.e(err)
                    //TODO: Show error  toast and stop loading
                })

        getCompositeDisposable().add(fetchItemListDisposal)
    }
}