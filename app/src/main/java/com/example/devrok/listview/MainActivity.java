package com.example.devrok.listview;
;

        import android.graphics.Color;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Adapter;
        import android.widget.ArrayAdapter;
        import android.widget.BaseAdapter;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier", "Yann", "Zoé"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);

        afficherListeTweets();
    }


    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.BLACK, "Florent", "Mon premier tweet !"));
        tweets.add(new Tweet(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        tweets.add(new Tweet(Color.GREEN, "Logan", "Que c'est beau..."));
        tweets.add(new Tweet(Color.RED, "Mathieu", "Il est quelle heure ??"));
        tweets.add(new Tweet(Color.GRAY, "Willy", "On y est presque"));
        return tweets;
    }

    private void afficherListeTweets(){
        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(MainActivity.this, tweets);
        mListView.setAdapter(adapter);
    }
}