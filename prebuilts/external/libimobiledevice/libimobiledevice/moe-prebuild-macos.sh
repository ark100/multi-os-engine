#!/bin/bash

set -e

if [ -z "$MOE_PREBUILTS_DIR" ]; then
    echo "MOE_PREBUILTS_DIR env var is not set" 1>&2
    exit 1
fi
echo "MOE_PREBUILTS_DIR=$MOE_PREBUILTS_DIR"

if [ -z "$MOE_PREBUILTS_TARGET_DIR" ]; then
    echo "MOE_PREBUILTS_TARGET_DIR env var is not set" 1>&2
    exit 1
fi
echo "MOE_PREBUILTS_TARGET_DIR=$MOE_PREBUILTS_TARGET_DIR"

# Clean old build
rm -rf "$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"

__MOE_TARGET="$MOE_PREBUILTS_DIR/$MOE_PREBUILTS_TARGET_DIR"
__MOE_PREBUILTS_DIR="$MOE_PREBUILTS_DIR/external/libimobiledevice/libxml2/build/macos/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libplist/build/macos/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/libusbmuxd/build/macos/lib/pkgconfig"
__MOE_PREBUILTS_DIR="$__MOE_PREBUILTS_DIR:$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/lib/pkgconfig"

./autogen.sh \
--prefix="$__MOE_TARGET" \
--disable-shared \
CFLAGS="-DMOE -I$MOE_PREBUILTS_DIR/external/libimobiledevice/openssl/build/macos/include" \
--without-cython \
PKG_CONFIG_LIBDIR="$__MOE_PREBUILTS_DIR"
make
make install
