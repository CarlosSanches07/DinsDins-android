package com.example.dindins;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface PagamentoDao {

    @Insert
    Long insert(Pagamento p);

    @Query("select * from `Pagamento` order by `id`")
    List<Pagamento> getAllPagamento();

    @Query("select * from `Pagamento` where `id`=:id")
    List<Pagamento>  getPagamento(int id);

    @Update
    void update(Pagamento p);

    @Delete
    void delete(Pagamento p);
}
