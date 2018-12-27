package turvo.gaurav.com.test.app.ui

import android.app.Activity
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import io.reactivex.disposables.CompositeDisposable
import turvo.gaurav.com.test.R
import turvo.gaurav.com.test.app.base.DaggerBaseActivity
import turvo.gaurav.com.test.app.ui.adapter.AllItemsAdapter
import turvo.gaurav.com.test.app.utils.Constants
import turvo.gaurav.com.test.app.viewmodel.UserDetailsViewModel
import java.lang.ref.WeakReference
import javax.inject.Inject

class UserDetailsActivity : DaggerBaseActivity<UserDetailsViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var allItemsAdapter: AllItemsAdapter

    private val PERCENTAGE_TO_ANIMATE_AVATAR = 20
    private var mIsAvatarShown = true
    private var mMaxScrollSize: Int = 0
    private var timerDisposable: CompositeDisposable? = null


    companion object {
        fun startActivity(activity: WeakReference<Activity>, userName: String) {
            val intent = Intent(activity.get(), UserDetailsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            activity.get()?.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserDetailsViewModel::class.java]
        timerDisposable = CompositeDisposable()
        initViews()
        observeViewModel()
    }
}