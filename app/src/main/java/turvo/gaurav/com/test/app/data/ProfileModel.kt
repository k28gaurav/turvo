package turvo.gaurav.com.test.app.data

import android.location.Address
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose




data class ProfileModel(
        @SerializedName("id")
        private val id: Int? = null,
        @SerializedName("name")
        private val name: String? = null,
        @SerializedName("username")
        private val username: String? = null,
        @SerializedName("email")
        private val email: String? = null,
        @SerializedName("phone")
        private val phone: String? = null,
        @SerializedName("img_url")
        private val imgUrl: String? = null,
        @SerializedName("address")
        private val address:Address? =null
)

data class ItemModel(
        @SerializedName("profile")
        var profile: List<ProfileModel>? = null
)

