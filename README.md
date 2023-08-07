# brightness-controller
This program helps control brightness of device running Ubuntu 22 LTS if the buttons and slide bar isn't working.

Requirement:
Java JDK
You can install JDK by entering following command: sudo apt install openjdk-8-jdk


Download MaxBr.class file to check maximum brightness supporte:
Go to the downloaded folder: cd Downloads
To run program - sudo java MaxBr

Example:<br>
user@pc:~$ java MaxBr  <br>
19200 (Max Brightness)  <br>


Download Br.class to change the brightness:
Go to the downloaded folder: cd Downloads
To run program: sudo java Br
Then enter brightness value you want to set (Cannot be more than maximum value)

Example
user@pc:~$ sudo java Br
700 (User entered value)
