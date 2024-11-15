package com.example.sleeptracking

//interface TimeLogDao {
   // package com.example.

    import androidx.room.Dao
    import androidx.room.Insert

    @Dao
    interface TimeLogDao {
        @Insert
        suspend fun insert(timeLog: TimeLog)

    }
//}