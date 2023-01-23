/*
 * Copyright 2023 Reda Semlal
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

import sbt._

object Dependencies {
  object V {
    final val cats = "2.9.0"
    final val catsEffect = "3.4.5"

    final val munit = "0.7.29"
    final val munitEffects = "1.0.7"
  }

  object Libraries {
    final val cats = "org.typelevel" %% "cats-core" % V.cats
    final val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect

    // testing libraries
    final val munitCore = "org.scalameta" %% "munit" % V.munit
    final val munitEffects = "org.typelevel" %% "munit-cats-effect-3" % V.munitEffects

  }
}
