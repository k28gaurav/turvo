package turvo.gaurav.com.test.app.data.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "items")
data class Item(
        @PrimaryKey
        @SerializedName("id")
        @ColumnInfo(name = "id")
        val id: Int,

        @SerializedName("url")
        @ColumnInfo(name = "url")
        val url: String,

        @SerializedName("name")
        @ColumnInfo(name = "name")
        val name: String

):Parcelable