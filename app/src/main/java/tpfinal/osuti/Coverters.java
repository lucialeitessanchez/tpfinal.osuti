package tpfinal.osuti;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.TypeConverter;

import java.util.Date;

public class Coverters {
    //convierto el tipo date a long y viceversa para la bd
    @TypeConverter
    public static Date fromTimestamp(Long value){
        return value == null ? null : new Date(value);
    }
    @TypeConverter
    public static Long dateToTimestamp(Date date){
        return date == null ? null : date.getTime();
    }

    public static class menuUsuario extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_usuario);
        }
    }
}
