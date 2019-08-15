package com.example.dindins;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface GastoCartaoDao {
    @Insert
    Long insert(GastoCartao gc);

    @Query("select * from `GastoCartao` order by `id` desc")
    List<GastoCartao> getAllGastoCartao();

    @Query("select * from `GastoCartao` where `id` =:id")
    List<GastoCartao> getGastoCartao(int id);

    @Update
    void update(GastoCartao gc);

    @Delete
    void delete(GastoCartao gc);
}
