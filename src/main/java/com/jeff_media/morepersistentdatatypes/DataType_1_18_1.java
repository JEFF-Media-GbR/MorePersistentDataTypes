/*
 * Copyright (c) 2022 Alexander Majka (mfnalex) / JEFF Media GbR
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.jeff_media.morepersistentdatatypes;

import com.jeff_media.morepersistentdatatypes.datatypes.serializable.ConfigurationSerializableArrayDataType;
import com.jeff_media.morepersistentdatatypes.datatypes.serializable.ConfigurationSerializableDataType;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.profile.PlayerProfile;

/**
 * Custom {@link PersistentDataType}s for versions 1.18.1 and later
 */
public interface DataType_1_18_1 {
    /**
     * DataType for {@link PlayerProfile}s
     */
    PersistentDataType<byte[], PlayerProfile> PLAYER_PROFILE = new ConfigurationSerializableDataType<>(PlayerProfile.class);
    /**
     * DataType for {@link PlayerProfile} arrays
     */
    PersistentDataType<byte[], PlayerProfile[]> PLAYER_PROFILE_ARRAY = new ConfigurationSerializableArrayDataType<>(PlayerProfile[].class);
}