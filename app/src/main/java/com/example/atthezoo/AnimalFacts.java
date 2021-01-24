package com.example.atthezoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalFacts extends AppCompatActivity {

    String animalName;

    TextView animal;
    ImageView animalPicture;
    TextView facts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_facts);

        Bundle bundle = getIntent().getExtras();
        animalName = bundle.getString("name");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About the Animal");

        animal = findViewById(R.id.textViewName);
        animalPicture = findViewById(R.id.imageView);
        facts = findViewById(R.id.textViewFacts);

        animalFacts();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void animalFacts() {

        if (animalName.equals("Emu")) {

            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.emu);
            facts.setText("• Emus are the second largest bird in the world. " +
                    "\n• They can live ten and twenty years in the wild. " +
                    "\n• They have two sets of eyelids, one for blinking and the other for keeping " +
                    "dust out. \n• They eat plants nd insects like grasshoppers, beetles, and cockroaches.");
        }

        if (animalName.equals("Koala")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.koala);
            facts.setText("• Koalas are native to Australia. \n• Koalas are nocturnal so are mainly " +
                    "active at night. \n• Koalas have very sharp claws which help them climb high " +
                    "into the trees. \n• Koalas have similar fingerprints to humans. \n• Koalas " +
                    "can live for 10-15 years. \n• Koalas live in eucalypt forests and eat gum " +
                    "leaves which are usually toxic to other animals.");
        }

        if (animalName.equals("Kangaroo")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.kangaroo);
            facts.setText("• Kangaroos use their strong tails for balance while jumping." +
                    "\n• They live in small groups called troops or herds (“mobs” by Australians), " +
                    "typically made up of 50 or more animals. \n• Female kangaroos sport a " +
                    "pouch on their belly, made by a fold in the skin, to cradle baby kangaroos " +
                    "called joeys.");
        }

        if (animalName.equals("Ring-Tailed Lemur")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.lemur);
            facts.setText("• The ring tailed lemur’s tail is longer than its body. \n• Ring tailed " +
                    "lemurs mostly eat fruit and leaves. \n• A group of ring tailed lemurs is often " +
                    "known as a ‘troop'. \n• Ring tailed lemurs make all kinds of noises from wails " +
                    "to howls, from purrs to chirps. \n• Ring tailed lemurs usually have just one " +
                    "baby at a time, although they can have twins.");
        }

        if (animalName.equals("Jaguar")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.jaguar);
            facts.setText("• The jaguar is the 3rd largest of the big cats after the tiger and the" +
                    "lion and it is the largest of all the big cats in the Americas. " +
                    "\n• The jaguar's preferred habitat is dense rainforest, but they are also " +
                    "found across other forested areas and open plains. \n• Jaguars enjoy water " +
                    "and are good at swimming. \n• The jaguar has a very powerful jaw, its bite " +
                    "exerts more force than that of a lion. \n• Jaguars live in the wild for 11-15 " +
                    "years, in captivity they can live over 20 years.");
        }

        if (animalName.equals("Howler Monkey")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.howler);
            facts.setText("• Howler Monkeys are the loudest animal in the New World and their sound" +
                    "can travel for up to three miles of thick forest. \n• Their tails are " +
                    "‘prehensile’, which means they are able to grip.  \n• Howler monkey species " +
                    "vary in colour, and can either be black or various shades of brown and orange. " +
                    "\n• Howler monkeys live in troops of between 10 and 20 monkeys. " +
                    "\n• Howler monkeys are ‘diurnal’, which means they are active during the day " +
                    "and sleep at night.");
        }

        if (animalName.equals("Orinoco Crocodile")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.croc);
            facts.setText("• It is the largest of the South American’s crocodiles. \n• Orinoco " +
                    "crocodiles love to eat fish. \n• Female lays up to 40 eggs and cover them in " +
                    "a dug. She lays eggs in the dry season into the riverbanks. \n• Orinoco " +
                    "crocodiles have a lifespan of about 70 – 80 years.");
        }

        if (animalName.equals("Giant River Otter")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.otter);
            facts.setText("• The otter is a carnivorous mammal in a branch of the weasel family" +
                    "called Lutrinae. \n• An otter's den is called a 'holt' or a 'couch' " +
                    "\n• Otters live up to 16 years in the wild. \n• The Giant otter is found " +
                    "in South America around the Amazon river basin.");
        }

        if (animalName.equals("Black Rhino")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.rhino);
            facts.setText("• Rhinoceros is a Greek word. ‘Rhino’ means ‘nose’ and ‘ceros’ " +
                    "means ‘horn’ \n• Black rhinos have a ‘prehensile’, meaning hooked, lip for " +
                    "pulling leaves off branches. \n• Rhinos run on their toes. \n• Rhinos do " +
                    "have thick skin, but they can still get sun burnt. \n• Black rhinos are the " +
                    "third biggest of the five types of rhino. \n• Black rhinos love eating plants. " +
                    "Up to 220 different types.");
        }

        if (animalName.equals("African Elephant")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.african_ele);
            facts.setText("• Elephants suck as much as 2 gallons (7.5 liters) of water into its " +
                    "trunk at a time. \n• African elephants live where the sun is usually blazing " +
                    "hot, they use their trunks to help them keep cool. \n• Elephants also use " +
                    "their trunks as snorkels when they wade in deep water. " +
                    "\n• Elephants are social creatures. \n• Just as a human baby sucks its thumb," +
                    " an elephant calf often sucks its trunk for comfort.");
        }

        if (animalName.equals("Giraffe")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.giraffe);
            facts.setText("• Giraffes are the tallest mammals on Earth. Their legs alone are taller" +
                    "than many humans—about 6 feet. \n• They can run as fast as 35 miles an hour " +
                    "over short distances, or cruise at 10 mph over longer distances. " +
                    "\n• A giraffe's neck is too short to reach the ground. \n• Giraffes only " +
                    "need to drink once every few days. Most of their water comes from all the " +
                    "plants they eat. \n• A giraffe’s spots are much like human fingerprints. " +
                    "No two individual giraffes have exactly the same pattern. \n• Giraffes only " +
                    "need 5 to 30 minutes of sleep in a 24-hour period.");
        }

        if (animalName.equals("Zebra")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.zebra);
            facts.setText("• Every zebra has a unique pattern of black and white stripes. " +
                    "\n• Zebras run from side to side to being chased by a predator. " +
                    "\n• Zebras have excellent eyesight and hearing. \n• Zebras stand up while " +
                    "sleeping. \n• Zebras eat mostly grass. \n• The ears of a zebra show its mood.");
        }

        if (animalName.equals("Lowland Gorilla")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.gorilla);
            facts.setText("• Gorillas are the largest primates in the world. \n• Adult males can " +
                    "weigh 500 pounds. \n• Gorillas are very gentle animals. \n• The troop " +
                    "travels around the forest together looking for food during the day. " +
                    "\n• Each gorilla makes a nest to sleep in on the ground or up in a tree. " +
                    "\n• A baby gorilla sleeps in its mother's nest until it is 4 to 6 years old.");
        }

        if (animalName.equals("Chimpanzee")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.chimpanzee);
            facts.setText("• Chimpanzees have almost the same DNA as humans. \n• Chimps like to " +
                    "hug, play, and laugh, just like us. \n• Chimpanzees are social creatures that " +
                    "live in large communities. \n• Chimpanzees are also one of the most " +
                    "intelligent animals on the planet. \n• Chimps are masters of communications.");
        }

        if (animalName.equals("African Lion")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.lion);
            facts.setText("• Lions are the only cats that live in groups. \n• Female lions are the" +
                    "main hunters. While they’re out looking for food, the males guard the pride’s " +
                    "territory and their young. \n• A lion’s roar can be heard up to eight " +
                    "kilometres (4.3 miles) away. \n• Lions scent mark their territory, using " +
                    "their wee, to create a border.");
        }

        if (animalName.equals("Asian Elephant")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.asian_ele);
            facts.setText("• Asian elephanta are much smaller than the African elephant and is " +
                    "found primarily in India and China. \n• Asian elephants have very small ears " +
                    "in comparison to the African. \n• Female Asian elephants do not have tusks. " +
                    "\n• Female elephants spend their entire lives living together with other " +
                    "females and calves, led by a single elephant known as the matriarch, who is " +
                    "usually the oldest female.");
        }

        if (animalName.equals("Greater One-Horned Rhino")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.one_horned_rhino);
            facts.setText("• Greater one-horned rhinos are good swimmers and can dive and feed " +
                    "underwater. \n• The Greater one-horned rhino can be found in India and Nepal, " +
                    "particularly in the foothills of the Himalayas. \n• Greater one-horned rhinos " +
                    "are usually solitary, except for females with small calves. \n• Creating " +
                    "folds that look like armor, the skin of the greater one-horned rhinoceros is " +
                    "brownish-gray with raised wart-like bumps on the neck, shoulders, and legs.");
        }

        if (animalName.equals("Sloth Bear")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.sloth_bear);
            facts.setText("• Sloth Bears have long and shaggy black fur, but its fur can also be " +
                    "brown. \n• Sloth Bears have a white or yellow mark on their chest, which is " +
                    "usually shaped like a Y or V. \n• Sloth Bears eat insects, like termites, " +
                    "they also eat fruit, honey, eggs, and meat. \n• Female Sloth Bears usually " +
                    "have 1-2 babies, sometimes 3.");
        }

        if (animalName.equals("Sumatran Tiger")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.tiger);
            facts.setText("• Sumatran tigers are the smallest of the six kinds of tigers on Earth. " +
                    "\n• The Sumatran tiger has orange fur like many other kinds of tigers, but " +
                    "its fur is a darker orange and has more black stripes, though each tiger has " +
                    "its own unique stripe pattern. \n• Sumatran tigers live on the island of " +
                    "Sumatra, which is in the country of Indonesia on the continent of Asia." +
                    " \n• Sumatran tigers are carnivores and eat meat. \n•  They have great" +
                    " eyesight, a strong sense of smell and really long whiskers which act like " +
                    "fingers and help them get around in thick forests.");
        }

        if (animalName.equals("Clouded Leopard")) {
            animal.setText(animalName);
            animalPicture.setImageResource(R.drawable.leopard);
            facts.setText("• Clouded leopards have great eyesight, but their eyes are different " +
                    "from other cats. \n Clouded loepards aren't seen very often in their natural " +
                    "habitat. \n Clouded leopards hunt in trees as well as on the ground.");
        }

    }
}
