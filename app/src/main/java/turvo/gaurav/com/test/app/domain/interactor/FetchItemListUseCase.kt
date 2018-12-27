package turvo.gaurav.com.test.app.domain.interactor


import io.reactivex.Single
import turvo.gaurav.com.test.app.data.db.entities.Item
import turvo.gaurav.com.test.app.domain.repository.UserRepository
import javax.inject.Inject

class FetchItemListUseCase @Inject constructor(private val userRepository: UserRepository) {
    fun execute(): Single<List<Item>> {
        return userRepository.fetchItems()
    }
}