package turvo.gaurav.com.test.app.di

import android.app.Application
import android.content.Context


import dagger.Binds
import dagger.Module
import turvo.gaurav.com.test.app.SchedulersFacade
import turvo.gaurav.com.test.app.rx.SchedulerProvider

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(appliction: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulerProvider
}