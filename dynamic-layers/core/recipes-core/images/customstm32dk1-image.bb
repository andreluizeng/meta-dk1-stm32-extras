SUMMARY = "An custom image for testing purpose"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append:custom-stm32-dk1 = " \
	kernel-modules u-boot-default-env libubootenv-bin mtd-utils \
	ca-certificates iw dropbear iproute2 init-ifupdown \
	i2c-tools canutils systemd-conf openssl-engines  \
	\
	iperf3 stress-ng ethtool \
	\
	nano evtest libgpiod libgpiod-tools beep \
	"

IMAGE_FEATURES:append:custom-stm32-dk1 = " \
	dev-pkgs tools-sdk tools-debug tools-profile debug-tweaks \
	"

