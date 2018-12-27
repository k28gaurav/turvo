package turvo.gaurav.com.test.app

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import turvo.gaurav.com.test.app.rx.SchedulerProvider
import javax.inject.Inject

class SchedulersFacade @Inject constructor() : SchedulerProvider {
    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun computation(): Scheduler {
        return Schedulers.computation()
    }

    override fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}