/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.common.sdk;

import java.io.Serializable;

public class Sdk implements Serializable {
    private String version;
    private static final String outputFormat = "iOS %s";

    public Sdk(String version) {
        this.version = version;
    }

    public String version() {
        return this.version;
    }

    public static String getFormattedOutput(String version) {
        return String.format(outputFormat, version);
    }
}