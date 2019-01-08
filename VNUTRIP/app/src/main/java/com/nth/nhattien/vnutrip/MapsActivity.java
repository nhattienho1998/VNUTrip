package com.nth.nhattien.vnutrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ViewPager viewPager;
    private Integer[] imagesUniversity = {R.drawable.img_uit,R.drawable.img_bku,R.drawable.img_us,R.drawable.img_iu,R.drawable.uel1,R.drawable.img_ussh};
    private Integer [] imagesFood = {R.drawable.img_canteen_iu,R.drawable.img_binhdinhquan,R.drawable.img_bone};
    private Integer [] imagesDrinks = {R.drawable.img_pey,R.drawable.img_bobapop,R.drawable.img_bonbon,R.drawable.img_feel1};
    private Integer [] imagesTakePhotos = {R.drawable.img_trungtamquocphong,R.drawable.img_ngaba,R.drawable.congbeniu};
    private Integer [] stringUni = {R.string.uit,R.string.bku,R.string.us,R.string.iu,R.string.uel,R.string.ussh};
    private Integer[] stringFood = {R.string.canteeniu,R.string.binhdinhquan,R.string.lauca};
    private Integer [] stringDrinks = {R.string.bobapop,R.string.bobapop,R.string.sonata,R.string.feel};
    private Integer [] stringPhotos = {R.string.hoda,R.string.ngaba,R.string.congbeniu};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //getActionBar().setDisplayShowHomeEnabled(true);
        Intent intent = getIntent();
        viewPager = (ViewPager) findViewById(R.id.ViewpagerDetail);
        DeTailViewPagerAdapter deTailViewPagerAdapter;
        int pos = Integer.parseInt(intent.getStringExtra("pos"));
        if(pos == 0){
            deTailViewPagerAdapter = new DeTailViewPagerAdapter(this,pos,imagesUniversity,stringUni);
            viewPager.setAdapter(deTailViewPagerAdapter);

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    if(i==0){
                        LatLng UIT=new LatLng(10.870311,106.803470);
                        mMap.addMarker(new MarkerOptions().position(UIT).title("Marker in UIT"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(UIT)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);
                    }
                    if(i==1){
                        LatLng BKU=new LatLng(10.3880515,106.805591);
                        mMap.addMarker(new MarkerOptions().position(BKU).title("Marker in BKU"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BKU)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);

                    }
                    if(i==2){
                        LatLng US=new LatLng(10.874366,106.798255);
                        mMap.addMarker(new MarkerOptions().position(US).title("Marker in US"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(US)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);
                    }
                    if(i==3){
                        LatLng IU=new LatLng(10.877841,106.801573);
                        mMap.addMarker(new MarkerOptions().position(IU).title("Marker in IU"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(IU)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);
                    }

                    if(i==4){
                        LatLng UEL=new LatLng(10.870765,106.778227);
                        mMap.addMarker(new MarkerOptions().position(UEL).title("Marker in UEL"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(UEL)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);
                    }
                    if(i==5){
                        LatLng USSH=new LatLng(10.872334,106.801877);
                        mMap.addMarker(new MarkerOptions().position(USSH).title("Marker in USSH"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(USSH)
                                .bearing(8.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,3000,null);
                    }
                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });
        }
        else if(pos == 1){
            deTailViewPagerAdapter = new DeTailViewPagerAdapter(this,pos,imagesFood,stringFood);
            viewPager.setAdapter(deTailViewPagerAdapter);
        }
        else if(pos == 2){
            deTailViewPagerAdapter = new DeTailViewPagerAdapter(this,pos,imagesDrinks,stringDrinks);
            viewPager.setAdapter(deTailViewPagerAdapter);
        }
        else if(pos ==3){
            deTailViewPagerAdapter = new DeTailViewPagerAdapter(this,pos,imagesTakePhotos,stringPhotos);
            viewPager.setAdapter(deTailViewPagerAdapter);
        }
        Button backbutton1 = (Button) findViewById(R.id.backbutton1);
        backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;




        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
