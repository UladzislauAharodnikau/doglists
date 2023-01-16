/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.rex,
            "Rex",
            "7",
            "haw haw"
        ),
        Dog(
            R.drawable.korgi,
            "Korgi",
            "4",
            "hawwwwww"
        ),
        Dog(
            R.drawable.haski,
            "Haski",
            "2",
            "haw-haw-haw"
        ),
        Dog(
            R.drawable.nox,
            "Black",
            "8",
            "wuf-wuf"
        ),
        Dog(
            R.drawable.faye,
            "Olen",
            "8",
            "haw"
        ),
        Dog(
            R.drawable.bella,
            "Dvornyaga",
            "14",
            "wuf"
        )
    )
}
