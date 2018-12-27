package turvo.gaurav.com.test.app.domain.interactor

import turvo.gaurav.com.test.app.data.db.entities.Item
import turvo.gaurav.com.test.app.domain.repository.UserRepository
import javax.inject.Inject

class SaveItemsUseCase @Inject constructor(private val userRepository: UserRepository) {
    fun execute(items: List<Item>) {
        userRepository.saveAllItems(items)
    }
}