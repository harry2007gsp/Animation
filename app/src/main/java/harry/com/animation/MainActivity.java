package harry.com.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ListView list;
    String[] arr = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        list = (ListView) findViewById(R.id.list);
//        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr));
        imageView = (ImageView) findViewById(R.id.imageView);


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.right_in);
//        AnimationSet animationSet = new AnimationSet(true);
//        animationSet.addAnimation(animation);
//        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationSet);
//        list.setLayoutAnimation(layoutAnimationController);
        imageView.setAnimation(animation);
    }



}
