package complex.digital.gangneung.festivals;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import complex.digital.gangneung.festivals.VO.Event_VO;

public class InformationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Toolbar toolbar = (Toolbar) findViewById(R.id.info_toolbar);

        Intent intent = getIntent();
        String para = intent.getStringExtra("para");
        Event_VO vo = new Event_VO(para);

        toolbar.setTitle(vo.getTitle());
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimary));

        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        //fixed tab

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.info_viewpager);
        setupViewPager(viewPager, para);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.windowBackground));
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimary), getResources().getColor(R.color.colorPrimaryDark));
        tabLayout.setupWithViewPager(viewPager);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View header = navigationView.getHeaderView(0);
        TextView tv = (TextView)header.findViewById(R.id.logo_title);
        tv.setText(vo.getTitle());
        TextView tv1 = (TextView)header.findViewById(R.id.logo_desc);
        tv1.setText(vo.getEvent_short_description());
        ImageView iv = (ImageView)header.findViewById(R.id.logo);
        Context context = iv.getContext();
        int logo = context.getResources().getIdentifier(vo.getLogo(), "drawable", context.getPackageName());
        iv.setImageResource(logo);
        navigationView.setNavigationItemSelectedListener(this);
        //ImageView mainImage = (ImageView)findViewById(R.id.d_main_image);
        //int mainImg = context.getResources().getIdentifier(vo.getMain_image(), "drawable", context.getPackageName());
        //mainImage.setImageResource(mainImg);
        //TextView sd = (TextView)findViewById(R.id.short_description);
        //TextView ld = (TextView)findViewById(R.id.long_description);
        //sd.setText(vo.getEvent_short_description());
        //ld.setText(vo.getEvent_long_description());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.notifications_tab) {
            // Handle the camera action
            Toast.makeText(getApplicationContext(), "공지", Toast.LENGTH_LONG).show();

        } else if (id == R.id.event_info_tab) {
            Toast.makeText(getApplicationContext(), "축제정보", Toast.LENGTH_LONG).show();

        } else if (id == R.id.survey_tab) {
            Toast.makeText(getApplicationContext(), "서베이", Toast.LENGTH_LONG).show();


        } else if (id == R.id.go_home_tab) {
            Toast.makeText(getApplicationContext(), "메인화면", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void setupViewPager(ViewPager viewPager, String para) {

        Log.e("액티비티", para);


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment().newInstance(para, "info"), "정보");
        adapter.addFragment(new TwoFragment().newInstance(para, "hist"), "역사");
        adapter.addFragment(new ThreeFragment().newInstance(para, "prog"), "프로그램");
        adapter.addFragment(new FourFragment().newInstance(para, "loca"), "위치");
        adapter.addFragment(new FiveFragment().newInstance(para, "cont"), "연락처");
        viewPager.setAdapter(adapter);
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
