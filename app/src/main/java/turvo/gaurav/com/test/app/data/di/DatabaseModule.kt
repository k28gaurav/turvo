package turvo.gaurav.com.test.app.data.di

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import turvo.gaurav.com.test.app.data.db.UserDatabse
import turvo.gaurav.com.test.app.utils.Constants
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideCartDatabase(context: Context): UserDatabse {
        return Room.databaseBuilder(context.applicationContext,
                UserDatabse::class.java,
                Constants.DB_NAME).build()
    }
}