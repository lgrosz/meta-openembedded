SUMMARY = "JWT C Library"
HOMEPAGE = "https://benmcollins.github.io/libjwt/"
SECTION = "libs"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f75d2927d3c1ed2414ef72048f5ad640"

SRC_URI = "git://github.com/benmcollins/libjwt.git;branch=master;protocol=https"

SRCREV = "43dde348283ec6ba0050f2da3184594d1650d657"

S = "${WORKDIR}/git"

DEPENDS = "jansson openssl"

inherit authtools pkgconfig

BBCLASSEXTEND = "nativesdk"
