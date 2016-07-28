package complex.digital.gangneung.festivals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Ur Festival On");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimary));
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //Grace: 갤러리
        LinearLayout l;
        l = (LinearLayout) findViewById(R.id.detail_imgGallery);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(600, 450);

        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.VERTICAL);
        ImageView iv1 = new ImageView(this);
        iv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.setTag("coffee");
                goEvent(arg0);
            }
        });
        TextView it1 = new TextView(this);
        TextView it11 = new TextView(this);
        it11.setTextColor(getResources().getColor(R.color.colorPrimary));
        it1.setText("2016 제 8회 강릉커피축제");
        it11.setText("2016.09.30 ~ 2016.10.03");
        iv1.setImageResource(R.drawable.fev2_01);
        iv1.setLayoutParams(layoutParams);
        iv1.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l1.addView(iv1);
        l1.addView(it1);
        l1.addView(it11);
        l.addView(l1);

        LinearLayout l2 = new LinearLayout(this);
        l2.setOrientation(LinearLayout.VERTICAL);
        ImageView iv2 = new ImageView(this);
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.setTag("tanger");
                goEvent(arg0);
            }
        });
        TextView it2 = new TextView(this);
        TextView it22 = new TextView(this);
        it22.setTextColor(getResources().getColor(R.color.colorPrimary));
        it2.setText("삼척 맹방 유채꽃 축제");
        it22.setText("2016.04.08 ~ 2016.04.17");
        iv2.setImageResource(R.drawable.fev3_01);
        iv2.setLayoutParams(layoutParams);
        iv2.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l2.addView(iv2);
        l2.addView(it2);
        l2.addView(it22);
        l.addView(l2);

        LinearLayout l3 = new LinearLayout(this);
        l3.setOrientation(LinearLayout.VERTICAL);
        ImageView iv3 = new ImageView(this);
        iv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                arg0.setTag("squid");
                goEvent(arg0);
            }
        });
        TextView it3 = new TextView(this);
        TextView it33 = new TextView(this);
        it33.setTextColor(getResources().getColor(R.color.colorPrimary));
        it3.setText("오징어 축제");
        it33.setText("2016.09.30 ~ 2016.10.03");
        iv3.setImageResource(R.drawable.fev2_07);
        iv3.setLayoutParams(layoutParams);
        iv3.setPadding(5, 5, 5, 5);
        //iv1.setOnClickListener(1);
        l3.addView(iv3);
        l3.addView(it3);
        l3.addView(it33);
        l.addView(l3);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.notifications_tab) {
            // Handle the camera action
            Toast.makeText(getApplicationContext(), "축제를 선택하세요.", Toast.LENGTH_LONG).show();

        } else if (id == R.id.event_info_tab) {
            Toast.makeText(getApplicationContext(), "축제를 선택하세요.", Toast.LENGTH_LONG).show();

        } else if (id == R.id.survey_tab) {
            Toast.makeText(getApplicationContext(), "축제를 선택하세요.", Toast.LENGTH_LONG).show();


        } else if (id == R.id.go_home_tab) {
            Toast.makeText(getApplicationContext(), "메인화면", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void goEvent(View v){
        String destination = v.getTag().toString();

        Toast.makeText(getApplicationContext(), destination, Toast.LENGTH_LONG).show();

        if(destination.equals("dano")){

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("para", "dano");
            startActivity(intent);
        } else if (destination.equals("coffee")){


            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("para", "coffee");
            startActivity(intent);
        } else if (destination.equals("tanger")){


            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("para", "tanger");
            startActivity(intent);

        } else if (destination.equals("squid")){

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("para", "squid");
            startActivity(intent);

        }
    }
}
