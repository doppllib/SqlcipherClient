# Doppl Fork

This is a fork of the SQLCipher Android interface library to provide tests and modifications to support 
iOS development with J2objc using the [Doppl build framework](http://doppl.co/).

The current version is deployed for usage in the sample app. [See that for basic usage](https://github.com/doppllib/PartyClickerSample/tree/greendaoencrypted).

This repo is new rather than a fork of the original [Android SQLCipher repo](https://github.com/sqlcipher/android-database-sqlcipher). The Android project in that repo has the "old style" folders.

## Versions

[3.5.7](https://www.zetetic.net/sqlcipher/sqlcipher-for-android/)

## Usage

```groovy
dependencies {
    compile 'net.zetetic:android-database-sqlcipher:3.5.7@aar'
    doppl 'co.doppl.net.zetetic:android-database-sqlcipher:3.5.7.0'
}
```

You'll need to include the SQLCipher runtime in Xcode, which is described in the []SQLCipher iOS docs](https://www.zetetic.net/sqlcipher/ios-tutorial/).

## Status

**Tests need integration!!!**. No known memory or functionality issues, but we should get tests integrated before serious production use.

## Library Development

See [docs](http://doppl.co/docs/createlibrary.html) for an overview of our setup and repo org for forked library development.


*** License

The Android support libraries are licensed under Apache 2.0, in line with the Android OS code on which they are based. The SQLCipher code itself is licensed under a BSD-style license from Zetetic LLC. Finally, the original SQLite code itself is in the public domain.
g