package turvo.gaurav.com.test.app.data.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import turvo.gaurav.com.test.app.data.service.ApiService
import turvo.gaurav.com.test.app.utils.Constants
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    fun provideOkHttpClient( context: Context): OkHttpClient {
        val okHttpBuilder =  OkHttpClient.Builder()
        return  okHttpBuilder.build()
    }


    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder()
                .setLenient()
                .create()
    }


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

    }

    @Provides
    @Singleton
    fun provideCartApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

}