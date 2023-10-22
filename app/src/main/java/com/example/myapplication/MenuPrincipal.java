package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TableLayout;
import android.widget.Toast;

public class MenuPrincipal extends Activity implements SearchView.OnQueryTextListener {

    private SearchView buscador;
    private TableLayout header;

    private ImageView carroCompras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_principal);

        buscador = findViewById(R.id.sv_buscador_comida);
        header = findViewById(R.id.layoutCategorias);

        carroCompras = findViewById(R.id.img_cart);

        carroCompras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Carro de compras vacío", Toast.LENGTH_SHORT).show();
            }
        });

        buscador.setOnQueryTextListener(this);
    }



    @Override
    public boolean onQueryTextSubmit(String query) {
        // Este método se llama cuando el usuario presiona Enter en el cuadro de búsqueda.
        // Aquí puedes realizar acciones relacionadas con la búsqueda, como iniciar una nueva actividad.
        Toast.makeText(this, "Búsqueda enviada: " + query, Toast.LENGTH_SHORT).show();
        // Por ejemplo, puedes iniciar una nueva actividad para mostrar resultados de búsqueda:
        // Intent intent = new Intent(this, ResultadosBusquedaActivity.class);
        // intent.putExtra("query", query);
        // startActivity(intent);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // Este método se llama cuando el texto en el cuadro de búsqueda cambia.
        // Puedes realizar acciones en tiempo real, como filtrar resultados a medida que el usuario escribe.
        // Por ejemplo, podrías actualizar una lista de resultados basada en newText.
        return false;
    }
}
