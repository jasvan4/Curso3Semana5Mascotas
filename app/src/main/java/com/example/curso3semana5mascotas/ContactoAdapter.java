package com.example.curso3semana5mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.curso3semana5mascotas.database.ConstructorMascotas;
import com.example.curso3semana5mascotas.db.Mascotas;
import java.util.ArrayList;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.MascotasViewHolder>{
	ArrayList<Mascotas> mascotasx;
	Activity activity;
	
	public ContactoAdapter (ArrayList<Mascotas> mascotas, Activity activity) {
		this.mascotasx = mascotas;
		this.activity = activity;
	}
	
	@NonNull
	@Override
	public MascotasViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType ) {
		View view = LayoutInflater.from(parent.getContext()).inflate (R.layout.cardview_mascotas, parent, false);
		return new MascotasViewHolder (view);
	}
	
	@Override
	public void onBindViewHolder ( @NonNull final MascotasViewHolder mascotasViewHolder, int position ) {
		final Mascotas mascotasy = mascotasx.get (position);
		
		mascotasViewHolder.imgFoto.setImageResource (mascotasy.getFoto ());
		mascotasViewHolder.tvNombre.setText (mascotasy.getNombre ());
		mascotasViewHolder.tvLikes.setText (String.valueOf (mascotasy.getLikes ()));
		
		mascotasViewHolder.btnLikes.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick ( View v ) {
				Toast.makeText (activity, "Diste like a : " + mascotasy.getNombre (), Toast.LENGTH_SHORT).show ();
				ConstructorMascotas constructorMascotas = new ConstructorMascotas (activity);
				constructorMascotas.darLikeMascota (mascotasy);
				mascotasViewHolder.tvLikes.setText (constructorMascotas.obtenerLikesMascota (mascotasy));
				
			}
		});
	}
	
	@Override
	public int getItemCount () {
		return mascotasx.size ();
	}
	
	public static class MascotasViewHolder extends RecyclerView.ViewHolder {
	private ImageView imgFoto;
	private TextView tvNombre;
	private TextView tvLikes;
	private ImageButton btnLikes;
	
		public MascotasViewHolder ( @NonNull View itemView ) {
			super (itemView);
			imgFoto = (ImageView) itemView.findViewById (R.id.imgFoto);
			tvNombre = (TextView) itemView.findViewById (R.id.tvNombre);
			tvLikes = (TextView) itemView.findViewById (R.id.tvLikes);
			btnLikes = (ImageButton) itemView.findViewById (R.id.btnLikes);
		}
  }
}
