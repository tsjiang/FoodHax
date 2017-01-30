package tsj.foodhax;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sallie on 15/11/2016.
 */
public class swipeAdapter extends FragmentPagerAdapter {
    public swipeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new SummaryFragment();
                return fragment;
            case 1:
                fragment = new MacroFragment();
                return fragment;
            case 2:
                fragment = new RecipeFragment();
                return fragment;
            default:
                fragment = new SummaryFragment();
                return fragment;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
