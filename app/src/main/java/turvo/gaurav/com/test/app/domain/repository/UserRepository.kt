package turvo.gaurav.com.test.app.domain.repository

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import io.reactivex.Single
import turvo.gaurav.com.test.app.data.db.entities.Item

interface UserRepository {
    fun getItems(): LiveData<PagedList<Item>>

    fun fetchItems(): Single<List<Item>>

    fun saveAllItems(items: List<Item>)

}