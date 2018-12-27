package turvo.gaurav.com.test.app.domain.interactor

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import turvo.gaurav.com.test.app.data.db.entities.Item
import turvo.gaurav.com.test.app.domain.repository.UserRepository

import javax.inject.Inject

class GetItemsUseCase @Inject constructor(private val userRepository: UserRepository){
    fun execute(): LiveData<PagedList<Item>> {
        return userRepository.getItems()
    }
}