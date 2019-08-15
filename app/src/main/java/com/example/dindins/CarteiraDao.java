package com.example.dindins;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface CarteiraDao {
    @Insert
    Long insert(Carteira c);

    @Query("select * from `Carteira` where `id` =:id")
    List<Carteira> getCarteira(int id);

    @Update
    void update(Carteira c);

    @Delete
    void delete(Carteira c);
}
