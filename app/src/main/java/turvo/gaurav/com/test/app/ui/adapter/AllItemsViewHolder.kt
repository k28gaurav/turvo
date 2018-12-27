package turvo.gaurav.com.test.app.ui.adapter

import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.all_item_adapter.view.iv_item
import kotlinx.android.synthetic.main.all_item_adapter.view.tv_name
import turvo.gaurav.com.test.app.base.BaseViewHolder
import turvo.gaurav.com.test.app.data.db.entities.Item


class AllItemsViewHolder(val view: View, val onClick : (position:Int) -> Unit): BaseViewHolder<Item>(view) {

    init {
        view.setOnClickListener {
            onClick.invoke(adapterPosition)
        }
    }

    override fun setData(data: Item) {
        Glide.with(view.context)
                .load(data.url)
                .apply(RequestOptions().centerCrop())
                .into(view.iv_item)

        view.tv_name.text = data.name
       // val decimalFormat = DecimalFormat("#,###,##0.00")

    }
}