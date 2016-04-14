/**
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.location.sample.geofencing;

import android.util.Pair;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */
public final class Constants {

    private Constants() {
    }

    public static class LatLngAndRadius {
        //LatLng latLng;
        double latitude;
        double longitude;
        int radius;

        public LatLngAndRadius (double latitude, double longitude, int radius) {
            //this.latLng = latLng;
            this.latitude = latitude;
            this.longitude = longitude;
            this.radius = radius;
        }
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 300;
    public static final int NOTIFICATION_RESPONSIVENESS_IN_MS = 10000;
    public static final int LOITERING_DELAY_IN_MS = 300000;


    /**
     * Map for storing information about geofences
     */
    public static final HashMap<String, LatLngAndRadius > GEOFENCE_LIST_ENTER = new HashMap<String, LatLngAndRadius>();
    static {
        GEOFENCE_LIST_ENTER.put("Enter_Plot", new LatLngAndRadius(52.343925, 4.916580, 50) );
        GEOFENCE_LIST_ENTER.put("Enter_Biking", new LatLngAndRadius(52.324698, 4.894656, 100));
        GEOFENCE_LIST_ENTER.put("Enter_OnTrain1", new LatLngAndRadius(52.340852, 4.920394, 200));
        GEOFENCE_LIST_ENTER.put("Enter_Highway", new LatLngAndRadius(52.337227, 4.940414, 300));
        GEOFENCE_LIST_ENTER.put("Enter_OnTrain2", new LatLngAndRadius(52.359300, 4.929214, 200));
        GEOFENCE_LIST_ENTER.put("Enter_Center", new LatLngAndRadius(52.372337, 4.893014, 50));
        GEOFENCE_LIST_ENTER.put("Enter_Highway_2", new LatLngAndRadius(52.330802, 4.903421, 300));
        GEOFENCE_LIST_ENTER.put("Enter_Train_3", new LatLngAndRadius(52.356234, 4.920630, 200));
        GEOFENCE_LIST_ENTER.put("Enter_Train_4", new LatLngAndRadius(52.324481, 4.935222, 200));
        GEOFENCE_LIST_ENTER.put("Enter_Biking_2", new LatLngAndRadius(52.322357, 4.887135, 200));
        GEOFENCE_LIST_ENTER.put("False_Positive_Geofence", new LatLngAndRadius(52.346643, 4.912654, 50));
    }

    public static final HashMap<String, LatLngAndRadius> GEOFENCE_LIST_DWELL = new HashMap<String, LatLngAndRadius>();
    static {
        GEOFENCE_LIST_DWELL.put("Dwell_Plot", new LatLngAndRadius(52.343769, 4.916436, 50));
        GEOFENCE_LIST_DWELL.put("Dwell_TrainStation", new LatLngAndRadius(52.346633, 4.917991, 100));
        GEOFENCE_LIST_DWELL.put("Dwell_Center", new LatLngAndRadius(52.372652, 4.893186, 250));
        GEOFENCE_LIST_DWELL.put("Dwell_Center2", new LatLngAndRadius(52.373012, 4.893090, 100));
        GEOFENCE_LIST_DWELL.put("Dwell_Center3", new LatLngAndRadius(52.374561, 4.897558, 150));
    }

    public static final HashMap<String, LatLngAndRadius> GEOFENCE_LIST_EXIT = new HashMap<String, LatLngAndRadius>();
    static {
        GEOFENCE_LIST_EXIT.put("Exit_Plot", new LatLngAndRadius(52.343874, 4.916344, 50));
        GEOFENCE_LIST_EXIT.put("Exit_Biking", new LatLngAndRadius(52.334854, 4.904848, 100));
        GEOFENCE_LIST_EXIT.put("Exit_OnTrain1", new LatLngAndRadius(52.337044, 4.923495, 200));
        GEOFENCE_LIST_EXIT.put("Exit_OnTrain2", new LatLngAndRadius(52.352040, 4.914708, 200));
        GEOFENCE_LIST_EXIT.put("Exit_Highway", new LatLngAndRadius(52.330579, 4.923120, 300));
        GEOFENCE_LIST_EXIT.put("Exit_Center", new LatLngAndRadius(52.374109, 4.894533, 50));
        GEOFENCE_LIST_EXIT.put("Exit_Highway_2", new LatLngAndRadius(52.339639, 4.876728, 300));
        GEOFENCE_LIST_EXIT.put("Exit_Train_3", new LatLngAndRadius(52.366324, 4.932089, 200));
        GEOFENCE_LIST_EXIT.put("Exit_Train_4", new LatLngAndRadius(52.315799, 4.943633, 200));
        GEOFENCE_LIST_EXIT.put("Exit_Biking_2", new LatLngAndRadius(52.327590, 4.896909, 200));
    }
}
