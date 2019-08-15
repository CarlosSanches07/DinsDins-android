package com.example.dindins;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(
        entities = {
            Carteira.class,
            GastoCartao.class,
            GastoDinheiro.class,
            Pagamento.class
        },
        version = 1,
        exportSchema = false
)
public abstract class DinDinsDatabase extends RoomDatabase {
    public abstract CarteiraDao carteiraDao();
    public abstract GastoCartaoDao gastoCartaoDao();
    public abstract GastoDinheiroDao gastoDinheiroDao();

    private static DinDinsDatabase INSTANCE;

    public static DinDinsDatabase getAppDatabase(Context c) {
        if(INSTANCE == null)
            INSTANCE = Room.databaseBuilder(
                    c.getApplicationContext(), DinDinsDatabase.class, "dindinsDatabase"
            ).build();
        return INSTANCE;
    }

    public static void destroyInstace() {
        INSTANCE = null;
    }
}
