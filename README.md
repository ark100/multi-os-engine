[![IDE plugin](https://img.shields.io/jetbrains/plugin/v/8559-multi-os-engine-plugin.svg?label=IDE+plugin&maxAge=1800)](https://plugins.jetbrains.com/plugin/8559-multi-os-engine-plugin)
[![Gradle plugin](https://img.shields.io/bintray/v/multi-os-engine/maven/moe-gradle.svg?label=Gradle+plugin&maxAge=1800)](https://bintray.com/multi-os-engine/maven/moe-gradle)

# Multi-OS Engine

## Overview

[Multi-OS Engine](http://multi-os-engine.org/) provides a Java runtime and Java interfaces to iOS platform API to develop native iOS applications with native look and feel, native performance, and portability of common Java logic modules from your Android Apps. It comes fully integrated with Android Studio hosted on macOS or Windows and contains all the development tools needed to develop an iOS app and publish to the App Store.

## Quick Start
(on macOS) IntelliJ IDEA / Android Studio
- Preferences > Plugins > Browse repositories > "Multi-OS Engine Plugin" > Install
- File > New > Multi-OS Engine Project > Multi-OS Engine (Java > Single View Application)

## Getting Started

- [Install Multi-OS Engine](https://multi-os-engine.org/start/)
- Walk through our [Quick Start Tutorials](http://doc.multi-os-engine.org) to configure your development environment and learn how to develop applications using Multi-OS Engine.
- Ask questions on the [Multi-OS Engine Forum](https://discuss.multi-os-engine.org/)
- Submit issues to our [Issue Tracker](https://github.com/multi-os-engine/multi-os-engine/issues)
- The latest information is on the [Blog](https://multi-os-engine.org/blog/) (or [migeran blog](https://www.migeran.com/blog))

## Building from Source Code

### Requirements

- Apple macOS 10.11
- Minimum 8GB RAM

### Install the 'repo' Tool

```
mkdir ~/bin
PATH=~/bin:$PATH
curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
chmod a+x ~/bin/repo
```

You may also install the repo using brew:

```
brew install repo
```

### Get the Source Code

Mainline branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git
repo sync
```

Note: if you want to get the source code from development branch with initial support of Windows and bitcode, switch to "moe-windows-bitcode" branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git -b moe-windows-bitcode
repo sync
```

### Installing Homebrew & Dependencies

Install brew from [brew.sh](http://brew.sh), then you can install MOE's dependencies:

```sh
brew tap homebrew/versions
brew install autogen autoconf automake libtool pkg-config wget gcc@5 cloog cmake jasmin gpg ant maven

cd <repo>/moe/moe-core
brew install file://`pwd`/dependencies/premake5.rb
```

### Building MinGW & LLVM

Building the complete SDK and related tools requires LLVM and MinGW. To build these execute the following:

```sh
cd <repo>/prebuilts
./gradlew mingw llvm
```

This step only needs to be done once (or until MinGW or LLVM components/requirements are changed).

### Building Multi-OS Engine Core

The `moe/moe-core` repo contains the runtime (and some compile time) components of MOE. To build the frameworks and build tools, execute the following:

```sh
cd <repo>/moe/moe-core
./gradlew build
```

### Building Multi-OS Engine Tools

The `moe/tools` repositories contain the tools required to build and run MOE applications.

[SDK Publisher](https://github.com/multi-os-engine/moe-sdk-publisher): creating a developer SDK:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-sdk:devsdk
```

[Gradle Plugin](https://github.com/multi-os-engine/moe-plugin-gradle): building and publishing the Gradle plugin to Maven local:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:publishToMavenLocal
```

[Maven Plugin](https://github.com/multi-os-engine/moe-plugin-maven): building and publishing the Maven plugin to Maven local:

```sh
cd <repo>/moe/tools/moe.plugin.maven
mvn clean install
```

[IDEA Plugin](https://github.com/multi-os-engine/moe-ide-integration): building the IDEA plugin:

```sh
cd <repo>/moe/tools/master
./gradlew :moe.plugin.idea:build
```

[Eclipse Plugin](https://github.com/multi-os-engine/moe-ide-integration-eclipse): building the Eclipse plugin:

```sh
cd <repo>/moe/tools/moe.plugin.eclipse
mvn clean install -DBUILD_NUMBER=1
```
