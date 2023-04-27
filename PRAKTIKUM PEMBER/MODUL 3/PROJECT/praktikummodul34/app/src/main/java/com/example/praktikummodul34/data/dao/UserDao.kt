package com.example.praktikummodul34.data.dao

import androidx.room.*
import com.example.praktikummodul34.data.entity.User

@Dao
interface UserDao {
    //untukmengambilsemuadata//
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    //mengambildataberdasarkanuserID
    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM user WHERE uid = :uid")
    fun get(uid: Int) : User

    @Update
    fun update(user: User)
}