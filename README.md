# brightness-controller
This program helps control brightness of device running Ubuntu 22 LTS if the buttons and slide bar isn't working. <br>

Requirement:<br>
Java JDK <br>
You can install JDK by entering following command: sudo apt install openjdk-8-jdk <br>


Download MaxBr.class file to check maximum brightness supported: <br>
Go to the downloaded folder: cd Downloads <br>
To run program - sudo java MaxBr <br>

Example:<br>
user@pc:~$ java MaxBr  <br>
19200 (Max Brightness)  <br>


Download Br.class to change the brightness: <br>
Go to the downloaded folder: cd Downloads <br>
To run program: sudo java Br <br>
Then enter brightness value you want to set (Cannot be more than maximum value) <br>

Example <br>
user@pc:~$ sudo java Br <br>
700 (User entered value) <br>
