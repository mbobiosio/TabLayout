package com.mbobiosio.navigationdrawerwithtablayout.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mbobiosio.navigationdrawerwithtablayout.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mbuodile Obiosio Jul 10, 2018
 */

public class FragmentOne extends Fragment {

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    View mView;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_one, container, false);
        ButterKnife.bind(this, mView);

        mViewPager.setAdapter(new FragmentsAdapter(getChildFragmentManager(), getActivity()));

        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }
        });

        return mView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private class FragmentsAdapter extends FragmentStatePagerAdapter {

        /*This is a better way to set Tab Titles. Get titles from String Array.*/
        private String title[] = getActivity().getResources().getStringArray(R.array.tab_titles);

        public FragmentsAdapter(FragmentManager supportFragmentManager, Context context) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TabOne();
                case 1:
                    return new TabTwo();
                case 2:
                    return new TabThree();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            /*Depending on which string array you're using, you choose here*/
            return title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            /*Same for here too if you want to using stringarrays from resources*/
            return title[position];
        }
    }

}
