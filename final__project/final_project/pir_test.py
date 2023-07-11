import RPi.GPIO as GPIO
import time
import os

pirPin = 7
GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(pirPin, GPIO.IN)

counter = 1

try:
    while True:
        if GPIO.input(pirPin) == 1:
            #os.system("dd if=/dev/video0 of=snapshot%s.jpeg bs=11M count=1" % counter)
            #counter = counter + 1
            print("1")
        time.sleep(1)
        
except KeyBoardInterrupt:
    print("0")
    GPIO.clanup()
