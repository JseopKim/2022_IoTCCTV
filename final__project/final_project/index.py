from flask import Flask, request
from flask import render_template
import RPi.GPIO as GPIO
import time

app = Flask(__name__)
SERVO_PIN = 18


GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(SERVO_PIN, GPIO.OUT)
servo = GPIO.PWM(SERVO_PIN,50)
servo.start(0)


@app.route("/")
def home():
    return render_template("camera.html")

@app.route("/turn/left")
def turn_left():
    try:
        servo.ChangeDutyCycle(10)
        time.sleep(1)
        return "ok"
    except expression as identifier:
        return "fail"

@app.route("/turn/center")
def turn_center():
    try:
        servo.ChangeDutyCycle(7.5)
        time.sleep(1)
    except expression as identifier:
        return "fail"
    
@app.route("/turn/right")
def turn_right():
    try:
        servo.ChangeDutyCycle(4.5)
        time.sleep(1)
        return "ok"
    except expression as identifier:
        return "fail"
    
    
if __name__ == "__main__":
    app.run(host='192.168.97.85')

        