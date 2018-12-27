package turvo.gaurav.com.test.app.data.service

import android.arch.lifecycle.LiveData
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList

import io.reactivex.Single
import turvo.gaurav.com.test.app.SchedulersFacade
import turvo.gaurav.com.test.app.data.db.UserDatabse
import turvo.gaurav.com.test.app.data.db.entities.Item
import turvo.gaurav.com.test.app.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val cartDatabase: UserDatabse, private val apiService: ApiService,
                                             private val schedulersFacade: SchedulersFacade) : UserRepository {

    override fun fetchItems(): Single<List<Item>> {
        return apiService.getAllItems()
    }

    override fun saveAllItems(items: List<Item>) {
        cartDatabase.itemDao().insertItems(items)
    }

    override fun getItems(): LiveData<PagedList<Item>> {
        return LivePagedListBuilder(cartDatabase.itemDao().getItems(), 20).build()
    }

}