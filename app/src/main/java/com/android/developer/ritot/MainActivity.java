    package com.android.developer.ritot;
    import android.content.Intent;
    import android.speech.RecognizerIntent;
    import android.support.v7.app.ActionBarActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.MotionEvent;
    import android.view.View;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.Toast;


    public class MainActivity extends ActionBarActivity {


        public void startWatchFace(View v) {

            Intent intent = new Intent(MainActivity.this, WatchFaceActivity.class);
            startActivity(intent);
        }

        public void startSettings(View v) {

            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        }

        public void startProjectionColor(View v) {
            Intent intent = new Intent(MainActivity.this, ProjectionColorActivity.class);
            startActivity(intent);
        }

        public void startNotification(View w) {
            Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(intent);
        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            configureWatchFaceButton();
            configureSettingsButton();
            configurePJColorButton();
            configureNotificationsButton();

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == 1234 && resultCode == RESULT_OK) {
                String voice_text = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS).get(0);
                Toast.makeText(getApplicationContext(), voice_text, Toast.LENGTH_LONG).show();

            }
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    finish();
                    return true;
            }

            return super.onOptionsItemSelected(item);
        }

        private void configureWatchFaceButton() {
            Button WatchFaceButton = (Button) findViewById(R.id.btnWatchFace);
            final ImageView ImageViewWatchFace = (ImageView) findViewById(R.id.ivWatchFace);

            WatchFaceButton.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        ImageViewWatchFace.setImageResource(R.drawable.watchface_blur);

                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        ImageViewWatchFace.setImageResource(R.drawable.watchface);
                    }
                    return false;
                }

            });

        }

        private void configureSettingsButton() {
            Button SettingsButton = (Button) findViewById(R.id.btnSettings);
            final ImageView ImageViewSettings = (ImageView) findViewById(R.id.ivSettings);

            SettingsButton.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        ImageViewSettings.setImageResource(R.drawable.settings_blur);

                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        ImageViewSettings.setImageResource(R.drawable.settings);
                    }
                    return false;
                }

            });

        }

        private void configurePJColorButton() {
            Button PJColorButton = (Button) findViewById(R.id.btnProjectionColor);
            final ImageView ImageViewPJColor = (ImageView) findViewById(R.id.ivPJColor);

            PJColorButton.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        ImageViewPJColor.setImageResource(R.drawable.colors_blur);

                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        ImageViewPJColor.setImageResource(R.drawable.colors);
                    }
                    return false;
                }

            });

        }

        private void configureNotificationsButton() {
            Button NotificationsButton = (Button) findViewById(R.id.btnNotifications);
            final ImageView ImageViewNotifications = (ImageView) findViewById(R.id.ivNotifications);

            NotificationsButton.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        ImageViewNotifications.setImageResource(R.drawable.notifications_blur);

                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        ImageViewNotifications.setImageResource(R.drawable.notifications);
                    }
                    return false;
                }

            });
        }
    }