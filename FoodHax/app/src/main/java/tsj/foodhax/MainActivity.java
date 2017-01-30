package tsj.foodhax;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by Sallie on 15/11/2016.
 */
public class MainActivity extends FragmentActivity{
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        swipeAdapter SA = new swipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(SA);
    }
}
