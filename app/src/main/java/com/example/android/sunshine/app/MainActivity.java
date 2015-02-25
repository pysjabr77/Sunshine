package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.example.android.sunshine.app.fragment.ForecastFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        // getMenuInflater().inflate(R.menu.main, menu);
//        getMenuInflater().inflate(R.menu.forecastfragment, menu);
//        return true;
//    }

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

//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class ForecastFragment extends Fragment {
//
//        public ForecastFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//
//            String[] forecastArray = {
//                "Today - Sunny 88/63",
//                "Tomorrow - Foggy 70/46",
//                "Weds - Cloudy 72/63",
//                "Thurs - Asteroids 64/51",
//                "Fri - Heavy Rain 70/46",
//                "Sat - HELP TRAPPED IN WEATHERSTATION 60/51",
//                "Sun - Sunny 76/68"
//            };
//
//            List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
//
//            ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(this.getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
//
//            ListView lst = (ListView) rootView.findViewById(R.id.listview_forecast);
//
//            lst.setAdapter(mForecastAdapter);
//
//            //----------------------------------------------------------------------------------------
//
//            // These two need to be declared outside the try/catch
//            // so that they can be closed in the finally block.
//            HttpURLConnection urlConnection = null;
//            BufferedReader reader = null;
//
//            // Will contain the raw JSON response as a string.
//            String forecastJsonStr = null;
//
//            try {
//                // Construct the URL for the OpenWeatherMap query
//                // Possible parameters are available at OWM's forecast API page, at
//                // http://openweathermap.org/API#forecast
//                URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=74810070&mode=json&units=metric&cnt=7");
//
//                // Create the request to OpenWeatherMap, and open the connection
//                urlConnection = (HttpURLConnection) url.openConnection();
//                urlConnection.setRequestMethod("GET");
//                urlConnection.connect();
//
//                // Read the input stream into a String
//                InputStream inputStream = urlConnection.getInputStream();
//                StringBuffer buffer = new StringBuffer();
//                if (inputStream == null) {
//                    // Nothing to do.
//                    forecastJsonStr = null;
//                }
//                reader = new BufferedReader(new InputStreamReader(inputStream));
//
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    // Since it's JSON, adding a newline isn't necessary (it won't affect parsing)
//                    // But it does make debugging a *lot* easier if you print out the completed
//                    // buffer for debugging.
//                    buffer.append(line + "\n");
//                }
//
//                if (buffer.length() == 0) {
//                    // Stream was empty.  No point in parsing.
//                    forecastJsonStr = null;
//                }
//                forecastJsonStr = buffer.toString();
//            } catch (IOException e) {
//                Log.e("PlaceholderFragment", "Error ", e);
//                // If the code didn't successfully get the weather data, there's no point in attempting
//                // to parse it.
//                forecastJsonStr = null;
//            } finally{
//                if (urlConnection != null) {
//                    urlConnection.disconnect();
//                }
//                if (reader != null) {
//                    try {
//                        reader.close();
//                    } catch (final IOException e) {
//                        Log.e("PlaceholderFragment", "Error closing stream", e);
//                    }
//                }
//            }
//
//            //----------------------------------------------------------------------------------------
//
//            return rootView;
//        }
//    }
}
