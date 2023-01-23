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

import org.typelevel.sbt.gha.GenerativePlugin.autoImport.JavaSpec

object JavaVersions {
  final val Java8 = JavaSpec.temurin("8")
  final val Java11 = JavaSpec.temurin("11")
  final val Java17 = JavaSpec.temurin("17")

  final val All = Seq(Java8, Java11, Java17)
}
