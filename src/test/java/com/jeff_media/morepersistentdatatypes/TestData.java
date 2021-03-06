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

import org.bukkit.attribute.AttributeModifier;

import java.nio.file.StandardCopyOption;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.UUID;

public final class TestData {

    public static final UUID[] UUID_ARRAY = new UUID[32];
    public static final short[] SHORT_PRIMITIVE_ARRAY = new short[] {0,1,1,2,3,5,8,13,21,34,55,89};
    public static final float[] FLOAT_PRIMITIVE_ARRAY = new float[] {Float.MIN_VALUE, 0f, Float.MAX_VALUE};
    public static final EnumMap<StandardCopyOption, String> ENUM_MAP = new EnumMap<>(StandardCopyOption.class);
    public static final EnumSet<StandardCopyOption> ENUM_SET = EnumSet.noneOf(StandardCopyOption.class);
    public static final HashMap<String, Integer> HASH_MAP = new HashMap<>();
    public static final AttributeModifier ATTRIBUTE_MODIFIER = new AttributeModifier("name",69.420d, AttributeModifier.Operation.ADD_NUMBER);
    public static final Integer[] NULLABLE_INTEGER_ARRAY = new Integer[] {1, 2, 3, null, 5, 6};
    public static final String[] NULLABLE_STRING_ARRAY = new String[] {"a", "b", "c", null, "e", null, "g"};

    static {

        // UUID_ARRAY
        for(int i = 0; i < UUID_ARRAY.length; i++) {
            UUID_ARRAY[i] = new UUID(0L,i);
        }

        // ENUM_MAP
        for (final StandardCopyOption value : StandardCopyOption.values()) {
            ENUM_MAP.put(value, value.name());
        }

        // HASH_MAP
        HASH_MAP.put("a", 1);
        HASH_MAP.put("b", 2);
        HASH_MAP.put("d", 4);
        HASH_MAP.put("c", 3);

        // ENUM_SET
        ENUM_SET.add(StandardCopyOption.ATOMIC_MOVE);
    }
}
