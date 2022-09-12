package com.yavuz.landmarks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.yavuz.landmarks.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark london = new Landmark("Palace of Westminster", "UK", "The Palace of Westminster is famous around the world, and this is more so due to its clock tower – Elizabeth Tower (commonly known as Big Ben). The palace also called the Houses of Parliament is hugely popular for anyone visiting London. A must around sunset is to head across Westminster Bridge for front-facing views where you’ll be sure to see many photographers aiming to capture that perfect shot.", R.drawable.london);
        Landmark paris = new Landmark("Eiffel Tower", "France", "Perhaps the most famous and well-known landmarks in the world is the Eiffel Tower in Paris. This tower which opened in 1889 dominates the skyline and can be seen all over the city. As well as admiring from afar a popular thing to do is to go up to one of the many observations decks. From there you can enjoy far-reaching views of the city and if you like even over a glass of bubbly. At night the Eiffel Tower lights up and every hour even displays a fantastic light show which is dazzling to the eye. For some of the best photo spots of the tower head up the nearby Montparnasse which from the 56th floor will give you incredible views.", R.drawable.paris);
        Landmark york = new Landmark("Statue of Liberty", "USA", "One of the USA’s most iconic landmark – the Statue of Liberty. Gifted to the nation in 1886 from France to represent freedom and democracy, the statue at a height of 93 meters is located on Liberty Island near Manhattan, New York. Ways to see the famous statue includes going on a boat cruise to simply view it from the water, as well as getting a boat directly to the island and visiting the interior.",R.drawable.newyork);
        Landmark india = new Landmark("Taj Mahal", "India", "The beautiful Taj Mahal is a must-visit for those exploring India and you’ll find it in Agra. Built by Mughal Emperor Shah Jahan between 1631 and 1648 as a tomb in memory of his wife, the mausoleum has a white marble design with a central tomb as well as four minarets on each corner. The mausoleum is close to the Indian capital Delhi and a common way to visit the Taj Mahal is via the Golden Triangle Route which also includes Delhi and Jaipur.", R.drawable.india);
        Landmark petra = new Landmark("Petra", "Jordan", "Petra and The Treasury (seen below) is one of the highlights of Jordan. The famous landmark has an intricate facade that is carved into the rock face and reaches almost 40 meters high. A popular way to see The Treasury is a night when the front has hundreds of candles placed, lighting up the front and creating a truly magical experience.", R.drawable.petra);
        Landmark peru = new Landmark("Machu Pichu", "Peru", "Located among mountains at 2,430m, Machu Pichu is the remains of a 15th-century citadel that belonged to an ancient Inca Empire. The landmark is now an important archaeological site and a must-visit for anyone heading to Peru. The site can be visited from the nearby town of Aguas Calientes as well as through tours from Cusco.", R.drawable.peru);
        Landmark rome = new Landmark("Rome Colosseum", "Italy", "The Colosseum in Rome is a bucket list landmark dating back to 72 AD. The building used to serve as an arena for gladiator fights and other activities to entertain the Roman people. The Colosseum has been partially destroyed but the remains can be enjoyed from the outside as well as through visits to walk around some of the internal areas.", R.drawable.rome);
        Landmark dubai = new Landmark("Burj Kalifa", "UAE", "Currently, the tallest building in the world (at time of writing) the Burj Kalifa reaches up to an incredible 830m. Completed in 2010 the tower can be seen for miles in all directions from the popular UAE city. For those with a head for heights it’s possible to visit the observation deck at 555 meters (floor 148) allowing you to gaze out and admire the view.", R.drawable.dubai);
        Landmark osaka = new Landmark("Osaka Castle", "Japan", "Osaka Castle, specifically the Main Tower is a beautiful multi-level building with sloping roofs and an intricate design with white, gold and green colours. It was once the home of warlord Hideyoshi Toyotomi and built in 1583. The tower is also home to an observation deck and a good time to visit the castle is during cherry blossom season when the surrounding park lights up in beautiful colours.", R.drawable.osaka);
        Landmark sydney = new Landmark("Sydney Opera House", "Australia", "Sydney Opera House is one of the most recognizable landmarks in Australia. Designed by architect Jørn Utzon and using a modern architecture style containing interesting shapes. A particular highlight which you’ll find close to this landmark is on New Years day when there is fireworks around here and Sydney Harbour Bridge", R.drawable.sydney);
        Landmark barcelona = new Landmark("Sagrada Familia", "Spain", "A landmark still in construction the Sagrada Familia is a sight to behold. The design of this iconic building was visualised by Antoni Guadi and contains a fantastic combination of unusual shapes, patterns and detailed rock carvings. It’s possible to visit the interior of the building where you’ll be granted to even more visually stunning designs included the famous ceiling, which is also one of the best photo spots in Barcelona.", R.drawable.barcelona);
        Landmark istanbul = new Landmark("Blue Mosque", "Turkey", "The Blue Mosque (officially called Sultan Ahmed Mosque) is a 6 minaret Ottoman-style mosque. Located in Istanbul and completed in 1617 it’s so-called due to its beautiful tiled interior in the upper galleries. The mosque serves as a place of prayer, a social setting, as well as a popular tourist attraction in the city. Opposite the mosque is the Hagia Sophia which is now a museum but was previously a church and mosque. Visit the Sultan Ahmet Park between these two landmarks as an ideal spot to capture shots of these iconic buildings.", R.drawable.istanbul);
        Landmark bhutan = new Landmark("Tigers Nest", "Bhutan", "Perched high in the mountains of Bhutan, Tigers Nest is a famous Buddhist monastery and a national icon for the country. The temple was built in 1962 and is located around 3000m in the upper Paro valley. To visit you’ll need to hike around 2.8km from a parking lot but once there you can enjoy wonderful views of the monastery and surrounding mountains.", R.drawable.bhutan);
        Landmark china = new Landmark("Great Wall of China", "China", "By far the longest landmark in this bucket-list is the Great Wall of China which stretches for an incredible 21,196 km. Constructed from the 3rd century BC up until the 17th century AD (source UNESCO), and complete with watchtowers, the wall was built as a defensive structure against invasions from the north. A popular way to visit the Great Wall is through a tour from Beijing which is approx 100km away.", R.drawable.china);
        Landmark cambodia = new Landmark("Angkor Wat", "Cambodia", "Angkor is a huge 400km2 complex of temples that were part of the Khmer Kingdom in the 9th to the 15th century. The highlight and must-see landmark is the Temple of Angkor Wat (seen below) which was built in the 12th century by Khmer King Suryavarman II. Visit in the morning to enjoy first light over the temple before exploring the complex further.", R.drawable.cambodia);
        Landmark taipei = new Landmark("Taipei 101", "Taiwan", "Taipei 101 is a huge skyscraper reaching up to 508 meters and was once the tallest building in the world until 2010. Designed by architects Chu-Yuan Lee and C. P. Wang and completed in 2004 the building contains 101 floors and includes an observation deck on floors 87, 88 and 91. As well as the observation deck the tower contains restaurants, offices, a shopping mall and food court. A special time to see the tower is at night, as well as during New Years Eve when it becomes part of a fireworks display as the country enters into the new year", R.drawable.taipei);
        Landmark portugal = new Landmark("Pena Palace", "Portugal", "Pena Palace is an eye-catching landmark located in Sintra (close to Lisbon). The colourful palace has been classified as a national monument since 1910 and is also a UNESCO World Heritage Site since 1995. Visit here to enjoy the park surrounding the palace as well as the colourful courtyards and beautiful interiors.", R.drawable.portugal);
        Landmark moscow = new Landmark("St Basil’s Cathedral", "Russia", "St Basil’s Cathedral in Moscow is an incredibly unique landmark comprised of colourful and unique shapes and towers. Completed in 1561 under Ivan IV (Ivan the Terrible), the building now represents 10 churches in one. A particularly magical time to visit is around Christmas when you can enjoy the markets along Red Square with the cathedral in the background. Sometimes complemented with snow seeing the landmark and the city during this time would be a very special experience.", R.drawable.moscow);
        Landmark croatia = new Landmark("Old Town Dubrovnik", "Croatia", "The Old Town of Dubrovnik is a huge walled city reaching out into the Adriatic Sea. The fortress contains stunning streets, a wonderful bay and even has it’s own beaches nearby. Famously used in the fantasy series Game of Thrones a popular attraction is a tour showcasing some of the filming spots. Another popular way to experience the city is to take a walk along the walls that circle 1,940 meters around the outskirts. These offer great views and lots of top photo ops.", R.drawable.croatia);
        Landmark germany = new Landmark("Neuschwanstein Castle", "Germany", "A fairy-tale castle that you’ll find in the southwest Bavaria part of Germany and close to the Austrian Border. Completed in 1892 under the vision of Ludwig II, the King of Bavaria from 1864 to 1886, the castle stands proud in a beautiful valley with mountains all around.The castle has been used as a setting for films in the past including the children’s’ classic Chitty Chitty Bang Bang. Although possible to visit the interior another highlight is the nearby bridge allowing classic views of the castle. See tours from Munich.", R.drawable.germany);
        Landmark thailand = new Landmark("Grand Palace", "Thailand", "The Grand Palace is a stunning complex which you’ll find in Bangkok and a must-visit. The complex is huge at 218,000 square meters and was established in 1782. The landmark is a popular tourist attraction where you’ll find impressive Stupas, The Demon Guadian statues, as well as the sacred Temple of the Emerald Buddha. When visiting be sure to spend a good few hours exploring and admiring the architecture and consider a tour to learn more about the history and things that you see.", R.drawable.thailand);
        Landmark vienna = new Landmark("Schönbrunn Palace", "Austria", "A must-visit in Vienna, Austria – the Schönbrunn is an imperial palace which during historic times was a summer residence of the Habsburgs family. It has everything you might expect from a palace, complete with a grand interior, beautiful exterior, as well as a huge flower garden to top it off. The best time to visit the Schönbrunn is from late Spring to the end of the summer so as to enjoy the wonderful flower arrangements in the gardens. Inside the palace, you can also visit to explore some of the various rooms which are still set up in original designs and allow you to imagine what life was like for the royals that have lived there.", R.drawable.vienna);
        Landmark budapest = new Landmark("Hungarian Parliament", "Hungary", "The Hungarian Parliament found in Budapest is easily one of the most visually stunning and impressive parliaments in the world. Using a grand design and powerful shapes the true beauty of the building is emphasised at night when lit up in a warm golden glow. To truly appreciate the landmark head across the River Danube to relax and soak up the view. This also makes for one of the best spots to capture photographs and if you visit in the early morning you may even get perfect reflections in the water.", R.drawable.budapest);
        Landmark brazil = new Landmark("Christ the Redeemer", "Brazil", "You’ll find this monumental statue, Christ the Redeemer, in Rio de Janeiro and the landmark is a sight to behold. Located at the top of Corcovado mountain at 710 meters, the 30-meter high statue was completed in 1931 and is a global symbol of Christianity and a national icon of Brazil. Also from here as well as appreciating views of the landmark you can enjoy incredible views of the surrounding city and hills.", R.drawable.brazil);
        Landmark mexico = new Landmark("Chichen Itza", "Mexico", "Chichen Itza located in Mexico is a complex of Maya ruins and a UNESCO World Heritage Site since 1988. The landmark seen below is El Castillo (Temple of Kukulkan), which has 4 sides in the shape of a pyramid with 365 steps in total. This includes 91 steps on each side as well as the top platform to total 365. Places nearby include Pisté as well as Cancun which is 2 and a half hours away.", R.drawable.mexico);


        landmarkArrayList.add(london);
        landmarkArrayList.add(paris);
        landmarkArrayList.add(york);
        landmarkArrayList.add(india);
        landmarkArrayList.add(petra);
        landmarkArrayList.add(peru);
        landmarkArrayList.add(rome);
        landmarkArrayList.add(dubai);
        landmarkArrayList.add(osaka);
        landmarkArrayList.add(sydney);
        landmarkArrayList.add(barcelona);
        landmarkArrayList.add(istanbul);
        landmarkArrayList.add(bhutan);
        landmarkArrayList.add(china);
        landmarkArrayList.add(cambodia);
        landmarkArrayList.add(taipei);
        landmarkArrayList.add(portugal);
        landmarkArrayList.add(moscow);
        landmarkArrayList.add(croatia);
        landmarkArrayList.add(germany);
        landmarkArrayList.add(thailand);
        landmarkArrayList.add(vienna);
        landmarkArrayList.add(budapest);
        landmarkArrayList.add(brazil);
        landmarkArrayList.add(mexico);



        binding.recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2, LinearLayoutManager.VERTICAL, false));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
        binding.recyclerView.setHasFixedSize(true);

        binding.recyclerView.setItemViewCacheSize(20);
        binding.recyclerView.setDrawingCacheEnabled(true);
        binding.recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

    }


}