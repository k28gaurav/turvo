package turvo.gaurav.com.test.app.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import turvo.gaurav.com.test.R
import turvo.gaurav.com.test.app.base.DaggerBaseActivity
import turvo.gaurav.com.test.app.viewmodel.UserViewModel
import javax.inject.Inject

class MainActivity : DaggerBaseActivity<UserViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserViewModel::class.java]
        initViews()
    }

}
