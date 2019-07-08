package com.example.cherrygingericedteatostayhealthy;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class Activity1 extends AppCompatActivity {

    private InterstitialAd interstitialAd, interstitialAd2;
    private AdView adView, adView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        //Initialize Ad
        AudienceNetworkAds.initialize(this);

        //Banner Ad 1
        adView = new com.facebook.ads.AdView(this, "520210448517491_520214265183776", com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.banner_container_main);
        adContainer.addView(adView);
        adView.loadAd();


        //Banner Ad 2
        adView2 = new com.facebook.ads.AdView(this, "520210448517491_520214481850421", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = findViewById(R.id.banner_container_main_1);
        adContainer2.addView(adView2);
        adView2.loadAd();


        //Interstitial Ad 1
        interstitialAd = new InterstitialAd(this, "520210448517491_520214985183704");
        // Set listeners for the Interstitial Ad
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();


        //Interstitial Ad 2
        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, "520210448517491_520215371850332");
        // Set listeners for the Interstitial Ad
        interstitialAd2.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

                interstitialAd2.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }
        });

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd2.loadAd();
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        if (adView2 != null) {
            adView2.destroy();
        }
        super.onDestroy();
    }

}

