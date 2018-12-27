package turvo.gaurav.com.test.app.data.service

import io.reactivex.Single
import retrofit2.http.GET
import turvo.gaurav.com.test.app.data.ItemModel
import turvo.gaurav.com.test.app.data.db.entities.Item

interface ApiService {

    @GET("/k28gaurav/demo/blob/master/db.json")
    fun getAllItems(): Single<ItemModel>
}



// JSON would be like  at url https://github.com/k28gaurav/demo/edit/master/db.json
/*{"profile":[
    {
        "id": 1,
        "name": "Leanne Graham",
        "username": "Bret",
        "email": "Sincere@april.biz",
        "address": {
        "street": "Kulas Light",
        "suite": "Apt. 556",
        "city": "Gwenborough",
        "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
    }
    },
        "phone": "7304244873",
        "img_url":"https://images.pexels.com/photos/248795/pexels-photo-248795.jpeg"
    }
    ]
}
    */