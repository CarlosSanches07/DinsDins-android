package com.example.dindins;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface GastoDinheiroDao {

    @Insert
    Long insert(GastoDinheiro gd);


    @Query("Select * from `GastoDinheiro` order by `id` desc")
    List<GastoDinheiro> getAllGastoDinheiro();

    @Query("Select * from `GastoDinheiro` where `id`=:id")
    List<GastoDinheiro> getGastoDinheiro(int id);

    @Update
    void update(GastoDinheiro gd);

    @Delete
    void delete(GastoDinheiro gd);
}
