package com.goka.sample;

import com.goka.flickableview.FlickableImageView;
import com.squareup.picasso.Picasso;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FlickableImageView flickableImageView = (FlickableImageView) findViewById(R.id.fiv);

        // Resource
        flickableImageView.setImageResource(R.drawable.travel);

        // Http Request
        // String url = "http://www.frenchrevolutionfood.com/wp-content/uploads/2009/04/Twitter-Bird.png";
        // Picasso.with(this).load(url).tag(TAG).into(flickableImageView);

        final TextView nameTextView = (TextView) findViewById(R.id.tv);
        flickableImageView.setOnFlickListener(new FlickableImageView.OnFlickableImageViewFlickListener() {
            @Override
            public void onStartFlick() {

            }

            @Override
            public void onFinishFlick() {
                nameTextView.setVisibility(View.GONE);
                flickableImageView.setVisibility(View.GONE);
            }
        });

        final float translationY = 50;
        final float invisible = 0.0f;
        final float visible = 1.0f;

        flickableImageView.setOnDraggingListener(new FlickableImageView.OnFlickableImageViewDraggingListener() {
            @Override
            public void onStartDrag() {
                animateTextView(nameTextView, invisible, translationY);
            }

            @Override
            public void onCancelDrag() {
                animateTextView(nameTextView, visible, -translationY);
            }
        });

        flickableImageView.setOnSingleTapListener(new FlickableImageView.OnFlickableImageViewSingleTapListener() {
            @Override
            public void onSingleTapConfirmed() {
                float alpha = ViewCompat.getAlpha(nameTextView);
                if (alpha == visible) {
                    animateTextView(nameTextView, invisible, translationY);
                } else {
                    animateTextView(nameTextView, visible, -translationY);
                }
            }
        });

        flickableImageView.setOnDoubleTapListener(new FlickableImageView.OnFlickableImageViewDoubleTapListener() {
            @Override
            public void onDoubleTap() {
                float alpha = ViewCompat.getAlpha(nameTextView);
                if (alpha == visible) {
                    animateTextView(nameTextView, invisible, translationY);
                }
            }
        });

        flickableImageView.setOnZoomListener(new FlickableImageView.OnFlickableImageViewZoomListener() {
            @Override
            public void onStartZoom() {
                animateTextView(nameTextView, invisible, translationY);
            }

            @Override
            public void onBackScale() {
                animateTextView(nameTextView, visible, -translationY);
            }
        });
    }

    private void animateTextView(View view, float alpha, float translationY) {
        final long duration = 200;

        ViewCompat.animate(view)
                .setDuration(duration)
                .translationY(translationY)
                .alpha(alpha);
    }

    @Override
    public void onDestroy() {
        Picasso.with(this).cancelTag(TAG);
        super.onDestroy();
    }
}
