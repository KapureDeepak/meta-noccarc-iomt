#!/bin/bash

Path=/etc/NetworkManager/system-connections
Eth0_File="nm.eth0.v730i"
Wlan0_File="nm.wlan0.v730i"

if [ -e "${Path}/"${Eth0_File}"" ] || [ -e "${Path}/"${Wlan0_File}"" ]
then

        mv "${Path}/"${Eth0_File}"" "${Path}/nm.eth0" && chmod 0600 "${Path}/nm.eth0"

        mv "${Path}/"${Wlan0_File}"" "${Path}/nm.wlan0" && chmod 0600 "${Path}/nm.wlan0"
	
	nmcli connection reload
	
	sleep 1
fi
