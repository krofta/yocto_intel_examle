SUMMARY = "A tiny image just capable of allowing a device to boot from RAM, \
this image recipe generates an image file which rather boots from initrd than \
from storage, it achieves this by using wic to pick up the artifacts generated \
by the core-image-tiny-initramfs image"

# The actual rootfs/initrd will be the one from core-image-tiny-initramfs, so
# we reset IMAGE_INSTALL to avoid building other things that will be pointless
IMAGE_INSTALL = "nano"
IMAGE_INSTALL_remove += "mdev"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_FEATURES += "dev-pkgs"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

IMAGE_ROOTFS_SIZE ?= "8192"

IMAGE_FSTYPES = "wic"
inherit core-image

# We get some parts from image-live that we need in order to boot from initrd
#INITRD_IMAGE_LIVE ?= "core-image-tiny-initramfs"

#WKS_FILE_intel-corei7-64 = "core-image-tiny.wks.in"
#WKS_FILE_intel-core2-32 = "core-image-tiny.wks.in"
