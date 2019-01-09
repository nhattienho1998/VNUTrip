package com.nth.nhattien.visitvnu;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ViewPager viewPager;

    private Integer[] imagesUniversity = {R.drawable.img_uit,R.drawable.img_bku,R.drawable.img_us,R.drawable.img_iu,R.drawable.uel1,R.drawable.img_ussh};
    private Integer [] imagesFood = {R.drawable.img_canteen_iu,R.drawable.img_lauca,R.drawable.img_lauchay1,R.drawable.img_ngoquyen1,R.drawable.comque,R.drawable.img_quanpho1,R.drawable.miquang,R.drawable.img_binhdinhquan,R.drawable.img_namnho,R.drawable.quan76};
    private Integer [] imagesDrinks = {R.drawable.img_feel1,R.drawable.img_zero2,R.drawable.img_bobapop,R.drawable.img_sky,R.drawable.img_bonbon1,R.drawable.sonata1};
    private Integer [] imagesTakePhotos = {R.drawable.chupanh_trungtamquocphong1,R.drawable.img_ngaba,R.drawable.congbeniu,R.drawable.chupanh_duongtinhyeu,R.drawable.chupanh_kitucxab,R.drawable.chupanh_tunhien};

    private Integer [] stringUni = {R.string.uit,R.string.bku,R.string.us,R.string.iu,R.string.uel,R.string.ussh};
    private Integer[] stringFood = {R.string.canteeniu,R.string.lauca,R.string.lauchay,R.string.ngoquyen,R.string.comque,R.string.pho,R.string.miquang,R.string.binhdinhquan,R.string.nhahangnamnho,R.string.quannhau76};
    private Integer [] stringDrinks = {R.string.feel,R.string.zero,R.string.bobapop,R.string.sky,R.string.bonbon,R.string.sonata};
    private Integer [] stringPhotos = {R.string.qs,R.string.ngaba,R.string.congbeniu,R.string.conduong,R.string.ktxB,R.string.meomeo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent = getIntent();
        viewPager = (ViewPager) findViewById(R.id.ViewpagerDetail);
        final DetailViewPagerAdapter detailViewPagerAdapter;
        int pos = Integer.parseInt(intent.getStringExtra("pos"));
        if(pos == 0){
            detailViewPagerAdapter = new DetailViewPagerAdapter(this,pos,imagesUniversity,stringUni);
            viewPager.setAdapter(detailViewPagerAdapter);

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    if(i==0){
                        LatLng UIT=new LatLng(10.870346, 106.803416);
                        MarkerOptions markerOptions = (new MarkerOptions().position(UIT).title("UIT"));
                        //markerUIT.icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder));
                        mMap.addMarker(markerOptions);

                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(UIT)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);

                    }
                    if(i==1){

                        LatLng BKU=new LatLng(10.880595, 106.805430);

                        mMap.addMarker(new MarkerOptions().position(BKU).title("BKU"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BKU)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);


                    }
                    if(i==2){
                        LatLng US=new LatLng(10.875574, 106.799097);

                        mMap.addMarker(new MarkerOptions().position(US).title("US"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(US)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==3){
                        LatLng IU=new LatLng(10.877625, 106.801587);

                        mMap.addMarker(new MarkerOptions().position(IU).title("IU"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(IU)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }

                    if(i==4){
                        LatLng UEL=new LatLng(10.870765,106.778227);

                        mMap.addMarker(new MarkerOptions().position(UEL).title("UEL"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(UEL)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==5){
                        LatLng USSH=new LatLng(10.872096, 106.8019797);

                        mMap.addMarker( new MarkerOptions().position(USSH).title("USSH"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(USSH)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });
        }
        else if(pos == 1){
            detailViewPagerAdapter = new DetailViewPagerAdapter(this,pos,imagesFood,stringFood);
            viewPager.setAdapter(detailViewPagerAdapter);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    if(i==0){
                        LatLng CIU=new LatLng(10.877678, 106.800648);
                        MarkerOptions markerCIU=new MarkerOptions().position(CIU).title("Canteen IU");
                        //markerUIT.icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder));
                        mMap.addMarker(markerCIU);

                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(CIU)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==1){
                        LatLng Lau44=new LatLng(10.876924, 106.804762);
                        mMap.addMarker(new MarkerOptions().position(Lau44).title("Lẫu Cá 44"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(Lau44)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);

                    }
                    if(i==2){
                        LatLng LC = new LatLng(10.887702, 106.783350);
                        mMap.addMarker(new MarkerOptions().position(LC).title("Lẫu chay Hoằng Đạt"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(LC)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==3){
                        LatLng NQ=new LatLng(10.871691, 106.798139);
                        mMap.addMarker(new MarkerOptions().position(NQ).title("Cơm Tấm Ngô Quyền"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(NQ)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }

                    if(i==4){
                        LatLng CQ=new LatLng(10.877673,106.809716);
                        mMap.addMarker(new MarkerOptions().position(CQ).title("Cơm Quê"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(CQ)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==5) {
                        LatLng BH = new LatLng(10.873379, 106.801000);
                        mMap.addMarker(new MarkerOptions().position(BH).title("Phở Bắc Hải"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BH)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate, 1500, null);
                    }
                    if(i==6){
                        LatLng MQ = new LatLng(10.873163, 106.797708);
                        mMap.addMarker(new MarkerOptions().position(MQ).title("Mì Quảng"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(MQ)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==7){
                        LatLng BD=new LatLng(10.873370, 106.797954);
                        mMap.addMarker(new MarkerOptions().position(BD).title("Bình Định Quán"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BD)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }

                    if(i==8){
                        LatLng NN=new LatLng(10.869698,106.795173);
                        mMap.addMarker(new MarkerOptions().position(NN).title("Nhà hàng Năm Nhỏ"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(NN)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==9) {
                        LatLng QN = new LatLng(10.880392, 106.810487);
                        mMap.addMarker(new MarkerOptions().position(QN).title("Quán Nhậu 76"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(QN)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate, 1500, null);
                    }


                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });
        }
        else if(pos == 2){
            detailViewPagerAdapter = new DetailViewPagerAdapter(this,pos,imagesDrinks,stringDrinks);
            viewPager.setAdapter(detailViewPagerAdapter);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    if(i==0){
                        LatLng FC=new LatLng(10.875935, 106.802101);
                        MarkerOptions markerFC=new MarkerOptions().position(FC).title("Feel Coffee & Tea Express");
                        //markerUIT.icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder));
                        mMap.addMarker(markerFC);

                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(FC)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==1){
                        LatLng ZC=new LatLng(10.877268, 106.800557);
                        mMap.addMarker(new MarkerOptions().position(ZC).title("The Zero Coffee"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(ZC)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);

                    }
                    if(i==2){
                        LatLng BO = new LatLng(10.874768, 106.799379);
                        mMap.addMarker(new MarkerOptions().position(BO).title("Trà Sữa Bobapop"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BO)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==3){
                        LatLng SKY=new LatLng(10.877597, 106.804214);
                        mMap.addMarker(new MarkerOptions().position(SKY).title("Trà Sữa Sky"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(SKY)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }

                    if(i==4){
                        LatLng BB=new LatLng(10.877536,106.804433);
                        mMap.addMarker(new MarkerOptions().position(BB).title("Trà sữa BonBon"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(BB)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==5){
                        LatLng SNT=new LatLng(10.874597,106.799409);
                        mMap.addMarker(new MarkerOptions().position(SNT).title("Sonata Coffee Acoustic"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(SNT)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }


                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });
        }
        else if(pos ==3){
            detailViewPagerAdapter = new DetailViewPagerAdapter(this,pos,imagesTakePhotos,stringPhotos);
            viewPager.setAdapter(detailViewPagerAdapter);
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int i, float v, int i1) {

                }

                @Override
                public void onPageSelected(int i) {
                    if(i==0){
                        LatLng QS=new LatLng(10.890328, 106.801635);
                        MarkerOptions markerQS=new MarkerOptions().position(QS).title("Trung tâm GDQP - An Ninh");
                        //markerUIT.icon(BitmapDescriptorFactory.fromResource(R.drawable.placeholder));
                        mMap.addMarker(markerQS);

                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(QS)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==1){
                        LatLng NGABA=new LatLng(10.877845, 106.789448);
                        mMap.addMarker(new MarkerOptions().position(NGABA).title("Ngã Ba Hồ đá"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(NGABA)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);

                    }
                    if(i==2){
                        LatLng CONGIU = new LatLng(10.878013, 106.802666);
                        mMap.addMarker(new MarkerOptions().position(CONGIU).title("Cổng bên Đại học Quốc tế"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(CONGIU)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==3){
                        LatLng CONDUONG=new LatLng(10.872679, 106.802811);
                        mMap.addMarker(new MarkerOptions().position(CONDUONG).title("Con đường tình yêu"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(CONDUONG)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }

                    if(i==4){
                        LatLng KTXB=new LatLng(10.882258, 106.781532);
                        mMap.addMarker(new MarkerOptions().position(KTXB).title("Ký túc xá khu B"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(KTXB)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate,1500,null);
                    }
                    if(i==5) {
                        LatLng US = new LatLng(10.875574, 106.799097);
                        mMap.addMarker(new MarkerOptions().position(US).title("Khuôn viên trường Đại học Khoa học Tự Nhiên"));
                        CameraPosition cameraPosition = CameraPosition.builder()
                                .target(US)
                                .bearing(9.6f)
                                .tilt(90)
                                .zoom(15).build();
                        CameraUpdate cameraUpdate = CameraUpdateFactory
                                .newCameraPosition(cameraPosition);
                        mMap.animateCamera(cameraUpdate, 1500, null);
                    }
                }

                @Override
                public void onPageScrollStateChanged(int i) {

                }
            });
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
       // mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
