package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //On Create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create () : es llamado justo cuando se lanza la actividad. Dentro de este método es donde se coloca el código que inicializa las principales funciones", Toast.LENGTH_SHORT).show();
    }

    //on Start
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start () : es llamado después de onCreate() y es el momento en el que la actividad está a punto de volverse visible al usuario", Toast.LENGTH_SHORT).show();
    }

    //on Resume
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume () : es llamado después de onCreate() y es el momento en el que la actividad está a punto de volverse visible al usuario", Toast.LENGTH_SHORT).show();
    }

    //on Pause
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause () : \nes llamado cuando la actividad pierde el foco o deja de estar en primer plano. \nEsto puede ser causado por dos acciones:\n" +
                "El usuario presiona el botón Home\n" +
                "El usuario presiona el botón de aplicaciones recientes", Toast.LENGTH_SHORT).show();
    }

    //on Stop
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop () : \nes llamado cuando la actividad deja de ser visible, puede ser causado porque la actividad ha sido destruida, una nueva actividad está siendo lanzada o una actividad existente vuelve a estar en primer plano. Éste método puede tomar dos caminos:\n" +
                "onRestart() si la actividad vuelve a ser visible para el usuario.\n" +
                "onDestroy() si la actividad es destruida.", Toast.LENGTH_SHORT).show();
    }

    //on Restart
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart () : es llamado después de onStop() si es que el usuario eligió poner nuevamente la actividad en primer plano.", Toast.LENGTH_SHORT).show();
    }

    //on Destroy
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy () : es llamado cuando el usuario elige dar por finalizada su interacción con la actividad. Este método permite liberar recursos que se han estado utilizando por la actividad.", Toast.LENGTH_SHORT).show();
    }
}