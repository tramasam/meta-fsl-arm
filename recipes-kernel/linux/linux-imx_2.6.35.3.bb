# Copyright (C) 2011-2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

PR = "${INC_PR}.24"

include linux-imx.inc

COMPATIBLE_MACHINE = "(mx28|mx5)"

# Revision of imx_2.6.35_maintain branch
SRCREV = "0f7b03c410f5baf1055a66860acc78d5b28a836d"
LOCALVERSION = "-maintain+yocto"

SRC_URI += "file://NFS-Fix-nfsroot-support.patch \
            file://NFS-allow-nfs-root-mount-to-use-alternate-rpc-ports.patch \
            file://perf-avoid-use-sysroot-headers.patch \
"

SRC_URI_append_mx28 = " \
           file://mxs-duart-use-ttyAMA-for-device-name.patch \
"
