Multi-OS Engine
===============

Overview
--------
[Multi-OS Engine](http://multi-os-engine.org/) provides a Java runtime and Java interfaces to iOS platform API to develop native iOS applications with native look and feel, native performance, and portability of common Java logic modules from your Android Apps. It comes fully integrated with Android* Studio hosted on Mac* OS or Windows* and contains all the development tools needed to develop an iOS* app and publish to the App store.

Getting Started
---------------

- Visit [Multi-OS Engine](TBD) page to download binary packages
- Walk through our [Quick Start Tutorials](http://multi-os-engine.github.io/doc) to configure your development environment and learn hwo to develop applications using Multi-OS Engine.
- Ask questions on the [Multi-OS Engine Forum](https://discuss.multi-os-engine.org/)


System Requirements
-------------------

**Requirements for Apple* Mac OS X* hosts:**

- Operating System: Apple macOS 10.10 or later
- Android Studio 1.5 or later, Android Platform SDK
- Java Development Kit (JDK) version 8
- Apple Xcode 7.x

**Requirements for Windows* hosts:**

- Operating System: Microsoft Windows 7 x64 edition or later
- Android Studio 1.5 or later, Android Platform SDK
- Java Development Kit (JDK) version 8
- Apple iTunes
- Apple macOS host in LAN that has Multi-OS Engine installed and can be accessed using SSH

Installation on macOS
----------------------

Download binary package here (TBD) and run moe_install.sh script in the root folder.

Installation on Windows
-----------------------

- Download binary package here (TBD) and unzip it
- TBD

Building from source code
-------------------------

Get the source code from mainline branch:
```
repo init -u https://github.com/multi-os-engine/manifest.git
repo sync
```

Get the source code from development branch with initial support of Windows and Bitcode: 
```
repo init -u https://github.com/multi-os-engine/manifest.git -b moe-windows-bitcode
repo sync
```

Install macOS MinGW build environment:
	
	Install brew from http://brew.sh
```	
	brew tap homebrew/versions
	brew install autogen autoconf automake openssl libtool pkg-config
	brew install wget
	brew install wine
```
	On OS X 10.9, 10.10:
```
	brew install gcc48
```
	On OS X 10.11:
```
	brew install gcc
	brew install cloog
```
Setup MinGW environment:
	On OS X 10.9, 10.10:

```
	cd moe/moe-core/Builder
	chmod +x mingw-w64-3.10-osx10.9.sh
	./mingw-w64-3.10-osx10.9.sh
	Add to your ~/.bash_profile
	export PATH=$PATH:/usr/local/mingw/bin
```
	
	On OS X 10.11:
```
	cd moe/moe-core/Builder
	chmod +x mingw-w64-3.10-osx10.11.sh
	./mingw-w64-3.10-osx10.11.sh
	Add to your ~/.bash_profile
	export PATH=$PATH:/usr/local/mingw/bin
```

Install premake5:
```	
	cp ./premake5.rb /usr/local/Library/Formula
	brew install premake5
```

Install other dependenies
```
  brew install cmake jasmin gpg ant
```

Build all:
```
cd moe/moe-core/Builder
./build-all.sh final <build_number> <maven_repo>
```
where maven_repo is any folder to place the built binaries