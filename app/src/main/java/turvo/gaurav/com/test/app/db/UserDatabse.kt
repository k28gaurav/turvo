package turvo.gaurav.com.test.app.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import turvo.gaurav.com.test.app.data.db.entities.Item
import turvo.gaurav.com.test.app.db.dao.ItemDao


@Database(entities = [Item::class], version = 1)
abstract class UserDatabse: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}