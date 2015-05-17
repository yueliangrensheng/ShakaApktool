/**
 *  Copyright 2015 Rover12421 <rover12421@163.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.rover12421.shaka.lib;

import com.rover12421.shaka.lib.ShakaProperties;

/**
 * Created by rover12421 on 12/25/13.
 */
public class DebugInfo {
    private static Boolean DEBUG = null;

    public static boolean isDEBUG() {
        if (DEBUG == null) {
            DEBUG = ShakaProperties.isDebug();
        }
        return DEBUG;
    }

    public static void info(String info) {
        if (isDEBUG()) {
            System.out.println(info);
        }
    }

    public static void error(String info) {
        if (isDEBUG()) {
            System.err.println(info);
        }
    }
}