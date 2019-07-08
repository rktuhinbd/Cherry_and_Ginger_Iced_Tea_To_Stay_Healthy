package com.example.cherrygingericedteatostayhealthy;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class Activity2 extends AppCompatActivity {

    private InterstitialAd interstitialAd, interstitialAd2;
    private AdView adView3, adView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        AudienceNetworkAds.initialize(this);

        //Banner Ad 1
        adView3 = new AdView(this, "520210448517491_520216051850264", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.banner_container);
        adContainer.addView(adView3);
        adView3.loadAd();
        Log.d("", "" + adView3.getPlacementId());

        //Banner Ad 2
        adView4 = new AdView(this, "520210448517491_520216411850228", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = findViewById(R.id.banner_container2);
        adContainer2.addView(adView4);
        adView4.loadAd();

        //Interstitial Ad 1
        interstitialAd = new com.facebook.ads.InterstitialAd(this, "520210448517491_520216941850175");
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

        //Interstitial  Ad 2
        interstitialAd2 = new com.facebook.ads.InterstitialAd(this, "520210448517491_520217118516824");
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
        if (adView3 != null) {
            adView3.destroy();
        }
        if (adView4 != null) {
            adView4.destroy();
        }
        super.onDestroy();
    }

}
