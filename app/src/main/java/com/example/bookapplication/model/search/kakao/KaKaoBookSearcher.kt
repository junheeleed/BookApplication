package com.example.bookapplication.model.search.kakao

import com.example.bookapplication.model.search.WebBookSearchable
import com.example.bookapplication.model.search.data.Book
import retrofit2.GsonConverterFactory
import retrofit2.Response
import retrofit2.Retrofit

class KaKaoBookSearcher: WebBookSearchable {

    private val service: KaKaoBookApiService by lazy {
        Retrofit.Builder().baseUrl("https://dapi.kakao.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KaKaoBookApiService::class.java)
    }

    override fun getByTitle(title: String, callback: WebBookSearchable.Callback) {
        getBooks(service.getData(title, Target.TITLE.value).execute(), callback)
    }

    override fun getByPublisher(publisher: String, callback: WebBookSearchable.Callback) {
        getBooks(service.getData(publisher, Target.PUBLISHER.value).execute(), callback)
    }

    override fun getByPerson(person: String, callback: WebBookSearchable.Callback) {
        getBooks(service.getData(person, Target.PERSON.value).execute(), callback)
    }

    private fun getBooks(response: Response<ResponseData>, callback: WebBookSearchable.Callback) {
        if (response.isSuccessful) {
            callback.succeed(response.body().map())
        } else {
            callback.failed(response.code())
        }
    }

    private fun ResponseData.map(): List<Book> = this.documents.map { it.map() }

    private fun Document.map(): Book {
        return Book(
            this.title,
            this.contents,
            this.url,
            this.isbn,
            this.datetime,
            this.authors,
            this.publisher,
            this.translators,
            this.price,
            this.salePrice,
            this.thumbnail,
            this.status
        )
    }
}