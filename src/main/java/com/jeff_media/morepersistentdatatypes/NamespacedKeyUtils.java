/*
 * Copyright (c) 2022 Alexander Majka (mfnalex) / JEFF Media GbR
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * If you need help or have any suggestions, feel free to join my Discord and head to #programming-help:
 *
 * Discord: https://discord.jeff-media.com/
 *
 * If you find this library helpful or if you're using it one of your paid plugins, please consider leaving a donation
 * to support the further development of this project :)
 *
 * Donations: https://paypal.me/mfnalex
 */

package com.jeff_media.morepersistentdatatypes;

import lombok.experimental.UtilityClass;
import org.bukkit.NamespacedKey;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * For internal use only.
 */
@UtilityClass
public class NamespacedKeyUtils {

    private static final Map<String, NamespacedKey> KEY_KEYS = new HashMap<>();
    private static final Map<String, NamespacedKey> VALUE_KEYS = new HashMap<>();

    public static final NamespacedKey KEY_NULL = getValueKey("n");

    static {
        // Caching the first 100 keys. I think that's reasonable for most use cases
        IntStream.range(0,100).forEach(number -> {
            getValueKey(number);
            getKeyKey(number);
        });
    }

    public static NamespacedKey getKeyKey(final int name) {
        return getKeyKey(String.valueOf(name));
    }

    public static NamespacedKey getKeyKey(final String name) {
        return KEY_KEYS.computeIfAbsent(name, __ -> NamespacedKey.fromString("k:" + name));
    }

    public static NamespacedKey getValueKey(final int name) {
        return getValueKey(String.valueOf(name));
    }

    public static NamespacedKey getValueKey(final String name) {
        return VALUE_KEYS.computeIfAbsent(name, __ -> NamespacedKey.fromString("v:" + name));
    }
}
