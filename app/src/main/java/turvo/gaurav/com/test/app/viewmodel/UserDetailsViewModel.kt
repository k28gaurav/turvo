package turvo.gaurav.com.test.app.viewmodel

import android.arch.lifecycle.MutableLiveData
import timber.log.Timber
import turvo.gaurav.com.test.app.SchedulersFacade
import turvo.gaurav.com.test.app.base.BaseViewModel
import turvo.gaurav.com.test.app.domain.interactor.FetchItemListUseCase
import turvo.gaurav.com.test.app.domain.interactor.GetItemsUseCase
import turvo.gaurav.com.test.app.domain.interactor.SaveItemsUseCase
import javax.inject.Inject

class UserDetailsViewModel @Inject constructor(getItemsUseCase: GetItemsUseCase,
                                              schedulersFacade: SchedulersFacade) : BaseViewModel(schedulersFacade) {

    val itemsLiveData = getItemsUseCase.execute()



}