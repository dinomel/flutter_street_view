package zyz.flutter.plugin.flutter_google_street_view;

import androidx.annotation.Nullable;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public class FlutterStreetViewPanoramaChangeListener implements StreetViewPanorama.OnStreetViewPanoramaChangeListener {

    private final FlutterGoogleStreetView flutterView;

    public FlutterStreetViewPanoramaChangeListener(FlutterGoogleStreetView flutterView) {
        this.flutterView = flutterView;
    }

    @Override
    public void onStreetViewPanoramaChange(@Nullable StreetViewPanoramaLocation location) {
        // Forward to the safe Kotlin method
        flutterView.onStreetViewPanoramaChangeSafe(location);
    }
}
