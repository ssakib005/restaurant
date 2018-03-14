package View.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDetailsAdapter extends FragmentPagerAdapter {

    private List<Fragment> myFragmentList = new ArrayList<>();
    private List<String> myFragmentTitleList = new ArrayList<>();

    public RestaurantDetailsAdapter(FragmentManager fm, List<Fragment> listFragment, List<String> titleList) {
        super(fm);
        this.myFragmentList = listFragment;
        this.myFragmentTitleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return myFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return myFragmentList == null ? 0 : myFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitleList.get(position);
    }
}
