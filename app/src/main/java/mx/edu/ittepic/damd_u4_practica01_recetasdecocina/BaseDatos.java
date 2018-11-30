package mx.edu.ittepic.damd_u4_practica01_recetasdecocina;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BaseDatos extends SQLiteOpenHelper { //Clase BaseDatos, //SuperClase es SQLiteopenHelper y es como el phpmyadmin pero sin interfaz grafica.


    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta cuando la aplicacion (Ejercicio1) se ejecuta en el CEL.
        //Sirve para contruir en el sqlite que esta en el celular las tablas que la app requeiere para funcionar.

        db.execSQL("CREATE TABLE RECETA (ID INTEGER PRIMARY KEY NOT NULL , NOMBRE VARCHAR(200), INGREDIENTES VARCHAR(1000), PREPARACION VARCHAR(1000), OBSERVACIONES VARCHAR(500))"); //Funciona para insert, create table, delete, update.

        //db.rawQuery();




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
