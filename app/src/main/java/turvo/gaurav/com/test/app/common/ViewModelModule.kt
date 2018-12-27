package turvo.gaurav.com.test.app.common

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import turvo.gaurav.com.test.app.viewmodel.UserDetailsViewModel
import turvo.gaurav.com.test.app.viewmodel.UserViewModel

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun userViewModel(viewModel: UserViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(UserDetailsViewModel::class)
    abstract fun userDetailsViewModel(viewModel: UserDetailsViewModel): ViewModel

}