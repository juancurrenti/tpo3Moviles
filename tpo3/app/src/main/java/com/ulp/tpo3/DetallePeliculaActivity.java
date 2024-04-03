package com.ulp.tpo3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetallePeliculaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pelicula);

        ImageView detalleImagen = findViewById(R.id.detalleImagen);
        TextView detalleTitulo = findViewById(R.id.detalleTitulo);
        TextView detalleDescripcion = findViewById(R.id.detalleDescripcion);
        TextView detalleActores = findViewById(R.id.detalleActores);
        TextView detalleDirector = findViewById(R.id.detalleDirector);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            detalleTitulo.setText(extras.getString("TITULO"));
            detalleImagen.setImageResource(extras.getInt("IMAGEN"));
            detalleDescripcion.setText(extras.getString("DESCRIPCION"));
            detalleActores.setText(extras.getString("ACTORES"));
            detalleDirector.setText(extras.getString("DIRECTOR"));
        }
    }
}

