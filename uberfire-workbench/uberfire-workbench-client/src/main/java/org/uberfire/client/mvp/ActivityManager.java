/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uberfire.client.mvp;

import java.util.Set;

import org.uberfire.mvp.PlaceRequest;

public interface ActivityManager {

    <T extends Activity> Set<T> getActivities( final Class<T> abstractScreenActivityClass );

    SplashScreenActivity getSplashScreenInterceptor( PlaceRequest placeRequest );

    Set<Activity> getActivities( final PlaceRequest placeRequest );

    boolean containsActivity( final PlaceRequest placeRequest );

    Activity getActivity( final PlaceRequest placeRequest );

    <T extends Activity> T getActivity( final Class<T> clazz,
                                        final PlaceRequest placeRequest );

    void destroyActivity( final Activity activity );

}
