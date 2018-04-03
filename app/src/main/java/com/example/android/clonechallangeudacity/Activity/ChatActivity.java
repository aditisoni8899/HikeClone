package com.example.android.clonechallangeudacity.Activity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.clonechallangeudacity.BottomNavigationViewHelper;
import com.example.android.clonechallangeudacity.Fragment.MeFragment;
import com.example.android.clonechallangeudacity.R;
import com.example.android.clonechallangeudacity.Fragment.TimeLine;
import com.example.android.clonechallangeudacity.Data.ViewPagerAdapter;

public class ChatActivity extends AppCompatActivity {

    //This is our viewPager
    private ViewPager viewPager;
    TimeLine chatFragment;
    TimeLine chatFragment1;
    MeFragment chatFragment2;
    MenuItem prevMenuItem;


    @SuppressLint({"NewApi", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);// Setting/replace toolbar as the ActionBar

        Drawable drawable = getResources().getDrawable(R.drawable.hike_logo);
        Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
        Drawable finalDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap,80,80,true));
        toolbar.setLogo(finalDrawable);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setElevation(0);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.action_item2:
                                viewPager.setCurrentItem(1);

                                break;
                            case R.id.action_item3:
                                viewPager.setCurrentItem(2);
                                break;
                        }
                        return true;
                    }
                });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: "+position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        setupViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        chatFragment=new TimeLine();
        chatFragment1=new TimeLine();
        chatFragment2=new MeFragment();
        adapter.addFragment(chatFragment);
        adapter.addFragment(chatFragment1);
        adapter.addFragment(chatFragment2);
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_search:
                break;
            case R.id.menu_add:
                break;
            default:
                break;
        }
        return true;
    }
}
