IMAGE_INSTALL += " \
	cppzmq-dev \
	python3-pyzmq \
	czmq \
	python3-pip \
	python3-boto3 \
	python3-botocore \
	python3-jmespath \ 
	python3-s3transfer \			
	python3-dateutil \
	python3-urllib3 \
	tzdata \
	systemd-fota \
	systemd-v730i-init \
	usb-udev \
	network-config \
	openssh \
"
IMAGE_FEATURES_append = "ssh-server-openssh"

IMAGE_FEATURES_remove += "ssh-server-dropbear \
			 debug-tweaks \
			 "
