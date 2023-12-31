package com.example.hommytv.roomdatabase

import kotlinx.coroutines.flow.Flow

class Repository( var databaseMethods:DatabaseMethods) {


    suspend fun addToFav(data:FavTable){

        databaseMethods.addToFav(data)

    }


    suspend fun removeFromFav(data:FavTable){

        databaseMethods.removeFromFav(data)
    }


     fun showFav():Flow<List<FavTable>>{
        return databaseMethods.showFav()
    }




    suspend fun addToWatchLater(data:WatchLaterTable){

        databaseMethods.addToWatchLater(data)

    }


    suspend fun removeFromWatchLater(data:WatchLaterTable){

        databaseMethods.removeFromWatchLater(data)
    }


    fun showWatchLater():Flow<List<WatchLaterTable>>{
        return databaseMethods.showWatchLater()
    }

}