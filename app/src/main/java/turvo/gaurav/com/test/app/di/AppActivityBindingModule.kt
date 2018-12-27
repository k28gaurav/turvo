package turvo.gaurav.com.test.app.di


import com.gallery.app.di.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector
import turvo.gaurav.com.test.app.ui.MainActivity
import turvo.gaurav.com.test.app.module.UserDetailsModule
import turvo.gaurav.com.test.app.module.UserModule
import turvo.gaurav.com.test.app.ui.UserDetailsActivity

@Module
abstract class AppActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun userActivity(): MainActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [UserDetailsModule::class])
    abstract fun userDetailsActivity(): UserDetailsActivity
}