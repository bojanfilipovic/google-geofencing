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

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */
public final class Constants {

    private Constants() {
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
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 300;

    /**
     * Map for storing information about geofences
     */
    public static final HashMap<String, LatLng> GEOFENCE_LIST_ENTER = new HashMap<String, LatLng>();
    static {
        GEOFENCE_LIST_ENTER.put("Enter_Plot", new LatLng(52.343925, 4.916580));
        GEOFENCE_LIST_ENTER.put("Enter_Biking", new LatLng(52.324698, 4.894656));
        GEOFENCE_LIST_ENTER.put("Enter_OnTrain1", new LatLng(52.340852, 4.920394));
        GEOFENCE_LIST_ENTER.put("Enter_Highway", new LatLng(52.337227, 4.940414));
        GEOFENCE_LIST_ENTER.put("Enter_OnTrain2", new LatLng(52.359300, 4.929214));
        GEOFENCE_LIST_ENTER.put("Enter_Center", new LatLng(52.372337, 4.893014));
        GEOFENCE_LIST_ENTER.put("Enter_Highway_2", new LatLng(52.330802, 4.903421));
        GEOFENCE_LIST_ENTER.put("Enter_Train_3", new LatLng(52.356234, 4.920630));
        GEOFENCE_LIST_ENTER.put("Enter_Train_4", new LatLng(52.324481, 4.935222));
        GEOFENCE_LIST_ENTER.put("Enter_Biking_2", new LatLng(52.322357, 4.887135));
        GEOFENCE_LIST_ENTER.put("False_Positive_Geofence", new LatLng(52.346643, 4.912654));
    }

    public static final HashMap<String, LatLng> GEOFENCE_LIST_DWELL = new HashMap<String, LatLng>();
    static {
        GEOFENCE_LIST_DWELL.put("Dwell_Plot", new LatLng(52.343769, 4.916436));
        GEOFENCE_LIST_DWELL.put("Dwell_TrainStation", new LatLng(52.346633, 4.917991));
        GEOFENCE_LIST_DWELL.put("Dwell_Center", new LatLng(52.372652, 4.893186));
        GEOFENCE_LIST_DWELL.put("Dwell_Center2", new LatLng(52.373012, 4.893090));
        GEOFENCE_LIST_DWELL.put("Dwell_Center3", new LatLng(52.374561, 4.897558));
    }

    public static final HashMap<String, LatLng> GEOFENCE_LIST_EXIT = new HashMap<String, LatLng>();
    static {
        GEOFENCE_LIST_EXIT.put("Exit_Plot", new LatLng(52.343874, 4.916344));
        GEOFENCE_LIST_EXIT.put("Exit_Biking", new LatLng(52.334854, 4.904848));
        GEOFENCE_LIST_EXIT.put("Exit_OnTrain1", new LatLng(52.337044, 4.923495));
        GEOFENCE_LIST_EXIT.put("Exit_OnTrain2", new LatLng(52.352040, 4.914708));
        GEOFENCE_LIST_EXIT.put("Exit_Highway", new LatLng(52.330579, 4.923120));
        GEOFENCE_LIST_EXIT.put("Exit_Center", new LatLng(52.374109, 4.894533));
        GEOFENCE_LIST_EXIT.put("Exit_Highway_2", new LatLng(52.339639, 4.876728));
        GEOFENCE_LIST_EXIT.put("Exit_Train_3", new LatLng(52.366324, 4.932089));
        GEOFENCE_LIST_EXIT.put("Exit_Train_4", new LatLng(52.315799, 4.943633));
        GEOFENCE_LIST_EXIT.put("Exit_Biking_2", new LatLng(52.327590, 4.896909));
    }
}
