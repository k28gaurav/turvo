package turvo.gaurav.com.test.app.di

import android.app.Application


import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import turvo.gaurav.com.test.app.App
import turvo.gaurav.com.test.app.common.ViewModelModule
import turvo.gaurav.com.test.app.data.di.DataModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
                      AndroidSupportInjectionModule::class,
                      ViewModelModule::class,
                      AndroidInjectionModule::class,
                      AppActivityBindingModule::class, DataModule::class])
interface AppComponent: AndroidInjector<App>{
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}