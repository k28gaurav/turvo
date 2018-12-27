package turvo.gaurav.com.test.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber
import turvo.gaurav.com.test.app.di.AppComponent
import turvo.gaurav.com.test.app.di.DaggerAppComponent

class App : DaggerApplication() {

    lateinit var appComponent: AppComponent
        private set

    companion object {
        lateinit var app: App
            internal set
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent =  DaggerAppComponent.builder().application(this).build()
        return appComponent
    }
}