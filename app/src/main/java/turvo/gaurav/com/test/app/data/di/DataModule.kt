package turvo.gaurav.com.test.app.data.di


import dagger.Binds
import dagger.Module
import turvo.gaurav.com.test.app.data.service.UserRepositoryImpl
import turvo.gaurav.com.test.app.domain.repository.UserRepository
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun provideUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

}