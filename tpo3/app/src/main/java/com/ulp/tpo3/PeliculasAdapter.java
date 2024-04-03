package com.ulp.tpo3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculaViewHolder> {

    private List<Pelicula> listaPeliculas;
    private Context context;

    public PeliculasAdapter(Context context, List<Pelicula> listaPeliculas) {
        this.context = context;
        this.listaPeliculas = listaPeliculas;
    }

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_item, parent, false);
        return new PeliculaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int position) {
        Pelicula pelicula = listaPeliculas.get(position);
        holder.tvTitulo.setText(pelicula.getTitulo());
        holder.imgPortada.setImageResource(pelicula.getImagenId());

        holder.btnDetalle.setOnClickListener(v -> {

            Intent intent = new Intent(context, DetallePeliculaActivity.class);

            intent.putExtra("TITULO", pelicula.getTitulo());
            intent.putExtra("IMAGEN_ID", pelicula.getImagenId());
            intent.putExtra("DESCRIPCION", pelicula.getDescripcion());
            intent.putExtra("ACTORES", pelicula.getActoresPrincipales());
            intent.putExtra("DIRECTOR", pelicula.getDirector());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    static class PeliculaViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitulo;
        ImageView imgPortada;
        Button btnDetalle;

        PeliculaViewHolder(View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            imgPortada = itemView.findViewById(R.id.imgPortada);
            btnDetalle = itemView.findViewById(R.id.btnDetalle);
        }
    }
}

