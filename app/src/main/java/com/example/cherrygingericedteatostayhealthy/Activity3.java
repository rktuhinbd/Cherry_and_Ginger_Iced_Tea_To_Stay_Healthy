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

public class Activity3 extends AppCompatActivity {

    private InterstitialAd interstitialAd, interstitialAd2;
    private AdView adView5, adView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //Initialize Ad
        AudienceNetworkAds.initialize(this);

        adView5 = new com.facebook.ads.AdView(this, "520210448517491_520217665183436", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.banner_container5);
        adContainer.addView(adView5);
        adView5.loadAd();


        adView6 = new com.facebook.ads.AdView(this, "520210448517491_520217958516740", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = findViewById(R.id.banner_container6);
        adContainer2.addView(adView6);
        adView6.loadAd();


        //Interstitial Ad 1
        interstitialAd = new com.facebook.ads.InterstitialAd(this, "520210448517491_520218338516702");
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
        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, "520210448517491_520219051849964");
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
        if (adView5 != null) {
            adView5.destroy();
        }
        if (adView6 != null) {
            adView6.destroy();
        }
        super.onDestroy();
    }
}
