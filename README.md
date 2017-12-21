# GeorgePermission

```GeorgePermission``` can easily handle the permissions in the Android M.

## Download

Grab via Maven:

```Maven
<dependency>
  <groupId>net.george.permission</groupId>
  <artifactId>george-permission</artifactId>
  <version>0.0.2</version>
  <type>pom</type>
</dependency>
```

or Gradle:

```Gradle
compile 'net.george.permission:george-permission:0.0.2'
```

## Usage
When you request permissions

```java
GeorgePermission.with(MainActivity.this).addRequestCode(100).permissions(
                Manifest.permission.READ_CALENDAR,
                Manifest.permission.CAMERA,
                Manifest.permission.READ_CONTACTS,
                Manifest.permission.READ_EXTERNAL_STORAGE).request();
```
## License
```
Copyright 2017 George

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
