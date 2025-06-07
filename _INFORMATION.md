# How to Install Redis ?
You need Enable Virtualization :=> 

How To Enable Virtualization Technology In BIOS
https://www.youtube.com/watch?v=FLymh2dAB_E


Steps to Install Redis Cache in Windows 10
PowerShell Admin 
wsl --install

username : nishant
password : nishant

sudo apt update

sudo apt install redis-server -y

sudo systemctl start redis
redis-cli
ping
PONG

If You see PONG, Then redis is successfully installed.


---
Window -> Linux -> Redis

Window -> Linux
wsl

Linux -> Redis
redis-cli

Verify
ping => PONG

info-

wsl stand for : Windows Subsystem for Linux.


---

SpringBoot Default serializer.
Redis Default serializer.
Both are different.
That's why we are facing issue.