package complex.digital.gangneung.festivals;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import complex.digital.gangneung.festivals.VO.Event_VO;
import complex.digital.gangneung.festivals.dummy.DummyContent;

public class DetailActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        DetailFragment.OnFragmentInteractionListener,
        NotificationFragment.OnListFragmentInteractionListener,
        InformationFragment.OnFragmentInteractionListener,
        SurveyFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Intent intent = getIntent();
        String para = intent.getStringExtra("para");
        Event_VO vo = new Event_VO(para);

        toolbar.setTitle(vo.getTitle());
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimary));

        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


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


        /*엑티비티 이제 안써!
        ImageView mainImage = (ImageView)findViewById(R.id.d_main_image);
        int mainImg = context.getResources().getIdentifier(vo.getMain_image(), "drawable", context.getPackageName());
        mainImage.setImageResource(mainImg);
        TextView sd = (TextView)findViewById(R.id.short_description);
        TextView ld = (TextView)findViewById(R.id.long_description);
        sd.setText(vo.getEvent_short_description());
        ld.setText(vo.getEvent_long_description());*/

        DetailFragment df = new DetailFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_detail, df).commit();

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
            NotificationFragment nf = new NotificationFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_detail, nf).commit();

        } else if (id == R.id.event_info_tab) {
            /*액티비티 이제 안써!
            Toast.makeText(getApplicationContext(), "축제정보", Toast.LENGTH_LONG).show();
            Intent intent = getIntent();
            String para = intent.getStringExtra("para");
            Intent next = new Intent(this, InformationActivity.class);
            next.putExtra("para", para);
            startActivity(next);*/
            InformationFragment inf = new InformationFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_detail, inf).commit();

        } else if (id == R.id.survey_tab) {
            Toast.makeText(getApplicationContext(), "서베이", Toast.LENGTH_LONG).show();
            SurveyFragment sf = new SurveyFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_detail, sf).commit();


        } else if (id == R.id.go_home_tab) {
            Toast.makeText(getApplicationContext(), "메인화면", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item){

    }
}
