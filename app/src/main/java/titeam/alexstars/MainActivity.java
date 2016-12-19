package titeam.alexstars;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import titeam.alexstars.sidemenu.testFragment;
import titeam.alexstars.sidemenu.testTabFragment;


public class MainActivity extends AppCompatActivity {
    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);



        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.nvView);

        //set navigationView item selected
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //init fragment manager object
                fragmentTransaction = getSupportFragmentManager().beginTransaction();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.nav_first_fragment:
                        //Toast.makeText(getApplicationContext(),"Inbox Selected",Toast.LENGTH_SHORT).show();
                        testFragment fragment = new testFragment();
                        fragmentTransaction.replace(R.id.flContent,fragment);
                        fragmentTransaction.commit();
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.nav_second_fragment:
                        testTabFragment testTabFragment = new testTabFragment();
                        fragmentTransaction.replace(R.id.flContent,testTabFragment);
                        fragmentTransaction.commit();
                        //Toast.makeText(getApplicationContext(),"Stared Selected",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_third_fragment:
                       // Toast.makeText(getApplicationContext(),"Send Selected",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_fourth_fragment:
                        //Toast.makeText(getApplicationContext(),"Drafts Selected",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_fifth_fragment:
                        //Toast.makeText(getApplicationContext(),"All Mail Selected",Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                       // Toast.makeText(getApplicationContext(),"Somethings Wrong", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

//        // Set a Toolbar to replace the ActionBar.
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Find our drawer view
//        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Find our drawer view
//        nvDrawer = (NavigationView) findViewById(R.id.nvView);
//        // Setup drawer view
//        setupDrawerContent(nvDrawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


    // Initializing Drawer Layout and ActionBarToggle
//
    ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open, R.string.close){

        @Override
        public void onDrawerClosed(View drawerView) {
            // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
            super.onDrawerClosed(drawerView);
        }

        @Override
        public void onDrawerOpened(View drawerView) {
            // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

            super.onDrawerOpened(drawerView);
        }
    };

    //Setting the actionbarToggle to drawer layout
    drawerLayout.setDrawerListener(actionBarDrawerToggle);

    //calling sync state is necessay or else your hamburger icon wont show up
    actionBarDrawerToggle.syncState();






}

}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}

