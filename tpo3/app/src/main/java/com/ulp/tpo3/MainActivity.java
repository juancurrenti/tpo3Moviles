package com.ulp.tpo3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PeliculasAdapter adapter;
    private List<Pelicula> peliculaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        peliculaList = new ArrayList<>();
        peliculaList.add(new Pelicula("Cars", R.drawable.img1, "Un pequeño y nuevo coche de carreras, llamado Rayo McQueen, se está preparando para ser un experto corredor y convertirse en uno de los automóviles más respetados en el panorama internacional. Un día toma la decisión de cambiar por completo su vida y se dirige a Radiator Springs, un pequeño y desértico pueblo donde hace nuevos amigos y comprenderá el verdadero sentido de su existencia. Allí entablará una buena relación con el Porsche Sally, Doc Hudson y Mater, una vieja camioneta que le hará comprender que hay cosas más importantes que los trofeos y la fama, algo que sin duda había sido el propósito del protagonista desde que se comprometió a participar en el mundo de las carreras. ¿Podrá Rayo McQueen dejar de lado todas estas cosas y centrarse en lo que de verdad merece la pena?", " Owen Wilson, Paul Newman, Bonnie Hunt", " John Lasseter"));
        peliculaList.add(new Pelicula("Piratas del Caribe: La maldición de la Perla Negra", R.drawable.img2, "Pelicula no recomendada a menores de 7\n" +
                "En el mar Caribe, en el S. XVII, Jack Sparrow, de profesión pirata, ve tambalearse su vida idílica el día que su antiguo subordinado, el pérfido Barbossa, se amotina junto al resto de la tripulación y le roba su barco, la Perla Negra. \n" +
                "\n" +
                "Tiempo después, Sparrow llega a Port Royal, donde se topa con la hermosa hija del gobernador, Elizabeth Swann. Los acontecimientos se precipitan y, cuando Barbossa ataca por sorpresa la ciudad, Elizabeth es secuestrada. Will Turner, el herrero de la zona, y profundamente enamorado de ella, decide partir en su busca, y en su aventura cuenta con la ayuda del propio Sparrow, que ve una oportunidad para recuperar su preciada nave.\n" +
                "\n" +
                "Pero lo que tanto Sparrow como Will ignoran es que Barbossa y el resto de los piratas están malditos: cuando la Luna brilla se transforman en muertos vivientes. La clave para ponerle fin a su situación parece radicar en Elizabeth, y en su sangre...\n" +
                "\n" +
                "Película de aventuras súper taquillera que supuso la consagración de Johnny Depp como héroe popular en su inolvidable composición de Jack Sparrow. Le secundan en el reparto Orlando Bloom, Geoffrey Rush y Keira Knightley. Dirige Gore Verbinski.\n" +
                "\n", "Johnny Depp, Geoffrey Rush, Keira Knightley", "Gore Verbinski"));
        peliculaList.add(new Pelicula("Toy Story", R.drawable.img3, "Cuando el pequeño Andy se va de su habitación, sus juguetes cobran vida y forman toda una sociedad bajo el liderazgo de su muñeco favorito, Woody el vaquero. El chico también ignora que cada cumpleaños es un momento de angustia para sus juguetes, debido a que se sienten realmente aterrados al pensar que pueden ser suplantados por unos nuevos. Woody es el único juguete al que esto no le preocupa, pues cree asegurado su estatus de mejor amigo de Andy.\n" +
                "\n" +
                "Sin embargo, el mudno del vaquero se derrumba cuando uno de los regalos del último cumpleaños de Andy es un Buzz Lightyear, un sofisticado y moderno juguete espacial que está teniendo gran éxito en ese momento. Este intrépido aventurero del espacio, casi sin proponérselo, se granjea el cariño total de Andy, por lo que éste pasa a prácticamente sólo jugar con él y marginar a Woody. El vaquero, tremendamente resentido, fraguará un plan para deshacerse de Buzz Lightyear, pero ése solo será el principio de unas intensas aventuras en las que ambos juguetes, irónicamente, acabarán convirtiéndose en los mejores amigos del mundo.", "Tim Allen, Don Rickles, Jim Varney", "John Lasseter"));
        peliculaList.add(new Pelicula("Toy Story 2", R.drawable.img4, "Woody, el vaquero con andar particular, sigue siendo el juguete favorito de Andy, incluso aunque hoy comparta su amistad con Buzz. En su papel de jefe de la banda, Woody protege y tranquiliza a todos los juguetes de la habitación porque todavía permanecen asustados ante la posibilidad de ser reemplazados por otros más novedosos tarde o temprano.\n" +
                "\n" +
                "Secuestrado por un coleccionista sin escrúpulos, Woody descubre que antes fue una verdadera estrella y se da cuenta de la enorme repercusión que alcanzó durante una época realmente gloriosa. Tras un sinfín de peripecias, se va a tener que enfrentar a la decisión más importante de su vida: volver con Andy y los juguetes o quedarse para convertirse en una rara pieza de museo. Sin lugar a dudas, el futuro de este entrañable personaje se encuentra totalmente en sus manos.", "Tom Hanks, Tim Allen, Joan Cusack", "John Lasseter, Ash Brannon, Lee Unkrich"));
        adapter = new PeliculasAdapter(this, peliculaList);
        recyclerView.setAdapter(adapter);
    }
}