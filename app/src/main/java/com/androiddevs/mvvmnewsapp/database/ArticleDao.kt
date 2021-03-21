package com.androiddevs.mvvmnewsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androiddevs.mvvmnewsapp.UI.util.Article

@Dao
interface ArticleDao {
    // used suspend because it will be used with coroutines
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article : Article):Long

    //didn't use suspend because it will interact with live data
    @Query("SELECT * FROM articles ")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article : Article)

}