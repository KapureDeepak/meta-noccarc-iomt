SUMMARY = "The AWS SDK for Python"
HOMEPAGE = "https://github.com/boto/boto3"
AUTHOR = "Amazon Web Services <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://files.pythonhosted.org/packages/cd/16/90930985c3f2db2a8d412f6f05b68c80ee7417d8a630c27f94bb032131c1/boto3-1.17.98.tar.gz"
SRC_URI[md5sum] = "89b046023f1d05e4c2573fad5ea6c020"
SRC_URI[sha256sum] = "fccfa81cda69bb2317ed97e7149d7d84d19e6ec3bfbe3f721139e7ac0c407c73"

S = "${WORKDIR}/boto3-1.17.98"

RDEPENDS_${PN} = "python3-botocore python3-jmespath python3-s3transfer"

inherit setuptools3
