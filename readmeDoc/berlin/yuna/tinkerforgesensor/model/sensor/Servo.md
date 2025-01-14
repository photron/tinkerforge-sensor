## berlin.yuna.tinkerforgesensor.model.sensor.Servo
###### Navigation
* [⌂ Start](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/README.md) · [sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/README.md) · [exception](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/exception/README.md) · [type](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/README.md) · [logic](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/logic/README.md) · [model](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/README.md) · [builder](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/builder/README.md) · [util](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/util/README.md)

---
### [Servo](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Servo.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Servo.java))
 *Drives up to 7 RC Servos with up to 3A* 
### Values
 * [MOTOR_POSITION](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  reached position
 * [MOTOR_VELOCITY](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  reached velocity
 * [UNDER_VOLTAGE](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  [x = mV] voltage too low
 * [VOLTAGE](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  [x = mV] output voltage change 
### Technical Info
 * [Official documentation](href=) 
###### Set servo voltage 5V
 
```java
servo.send(-99, 5000);
```
 
###### Set servo voltage 7V, minimal voltage 6V
 
```java
servo.send(-99, 7000, 6000);
```
 
###### Turn on servo 3
 
```java
servo.send(2, true);
```
 
###### Turn on servo 4 and invert position
 
```java
servo.send(3, true, true);
```
 
###### Turn on all Servos
 
```java
servo.send(-1, true);
```
 
###### Set servo 2 to position/degree 3000 (min -9000 max 9000)
 
```java
servo.send(1, 3000);
```
 
###### Set servo 3 to position 4000, velocity 10000
 
```java
servo.send(2, 3000, 10000);
```
 
###### Set servo 4 to position 5000, velocity 20000, acceleration 10000
 
```java
servo.send(3, 5000, 20000, 10000);
```
 
###### Set servo 5 to position 5000, velocity 20000, acceleration 10000. period 19500
 
```java
servo.send(4, 5000, 20000, 10000, 19500);
```

--- 
