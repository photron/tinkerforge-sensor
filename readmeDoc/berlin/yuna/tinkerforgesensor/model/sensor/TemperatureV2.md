## berlin.yuna.tinkerforgesensor.model.sensor.Temperature
###### Navigation
* [⌂ Start](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/README.md) · [sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/README.md) · [exception](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/exception/README.md) · [type](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/README.md) · [logic](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/logic/README.md) · [model](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/README.md) · [builder](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/builder/README.md) · [util](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/util/README.md)

---
######  *([V1](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Temperature.java), [V2](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/TemperatureV2.java))*


---
### [TemperatureV2](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/TemperatureV2.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/TemperatureV2.java))

 *Measures ambient temperature with 0.2°C accuracy*
 
### Values
 * [TEMPERATURE](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  [x / 100.0 = °C] 
### Technical Info
 * [Official documentation](https://www.tinkerforge.com/de/doc/Hardware/Bricklets/Temperature_V2.html) 
###### Getting temperature examples
 
```java
stack.values().temperature();
stack.values().temperature_Avg();
stack.values().temperature_Min();
stack.values().temperature_Max();
stack.values().temperature_Sum();
```

--- 
