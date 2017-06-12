package co.touchlab.test;
import android.app.Application;
import android.util.Log;

import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;

import java.io.File;

/**
 * Created by kgalligan on 5/6/17.
 */

public class TestDb
{
    public static void testDb(Application application)
    {
        SQLiteDatabase.nativeInit();
        File databaseFile = application.getDatabasePath("demo.db");
//        databaseFile.mkdirs();
//        databaseFile.delete();
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, "test123", null);
//        database.execSQL("create table t1(a, b)");
        database.execSQL("insert into t1(a, b) values(?, ?)", new Object[]{"asdf",
                "qwert"});

        Cursor cursor = database.query("t1", new String[] {"a", "b"}, null, null, null, null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Log.w(TestDb.class.getSimpleName(), "a: "+ cursor.getString(0));
            Log.w(TestDb.class.getSimpleName(), "b: "+ cursor.getString(1));
            cursor.moveToNext();
        }
        cursor.close();
    }
}
