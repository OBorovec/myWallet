package com.mywallet;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.mywallet.R;
import com.mywallet.view.dialogs.NewRecordFragment;
import com.mywallet.view.mainFragments.InProgressFragment;

/**
 * Created by oborovec on 07/03/2018.
 */

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;
    private Fragment topFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        this.fragmentManager = getFragmentManager();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        InProgressFragment welcomePage= new InProgressFragment();
        welcomePage.setText("Welcome page");
        swapContent(welcomePage);
        topFragment = welcomePage;

        initActions();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.drawer_overview) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Overview");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_income) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Income page");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_expenses) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Expenses page");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_analytics) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Analytics page");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_accounts) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Account page");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_budgets) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Budget page");
            swapContent(page);
            topFragment = page;
        } else if (id == R.id.drawer_scheduling) {
            InProgressFragment page= new InProgressFragment();
            page.setText("Scheduling page");
            swapContent(page);
            topFragment = page;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void swapContent(Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void initActions() {
        FloatingActionButton addIncome = findViewById(R.id.action_plus);
        addIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewRecordFragment newFragment = new NewRecordFragment();
                newFragment.setPositiveFocus(true);
                newFragment.show(fragmentManager, "NewRecordFragment");
            }
        });
        FloatingActionButton minusExpense = findViewById(R.id.action_minus);
        minusExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewRecordFragment newFragment = new NewRecordFragment();
                newFragment.setPositiveFocus(false);
                newFragment.show(fragmentManager, "NewRecordFragment");
            }
        });
        FloatingActionButton qmButton = findViewById(R.id.action_gm);
        qmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
