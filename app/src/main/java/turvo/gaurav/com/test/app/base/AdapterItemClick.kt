package turvo.gaurav.com.test.app.base

interface AdapterItemClick<T> {

    fun onItemClick(viewType: Int, data:T)
}