package com.svalero.gym.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.svalero.gym.dao.PerfilDao;
import com.svalero.gym.dao.RutinaDao;
import com.svalero.gym.dao.UsuarioDao;
import com.svalero.gym.domain.Perfil;
import com.svalero.gym.domain.Rutina;
import com.svalero.gym.domain.Usuario;

@Database(entities = {Usuario.class, Rutina.class, Perfil.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDao usuarioDao();
    public abstract RutinaDao rutinaDao();
    public abstract PerfilDao perfilDao();

}
