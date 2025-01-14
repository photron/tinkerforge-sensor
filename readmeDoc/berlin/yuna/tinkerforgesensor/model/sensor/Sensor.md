## berlin.yuna.tinkerforgesensor.model.sensor.Sensor
###### Navigation
* [⌂ Start](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/README.md) · [sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/README.md) · [exception](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/exception/README.md) · [type](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/README.md) · [logic](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/logic/README.md) · [model](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/README.md) · [builder](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/builder/README.md) · [util](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/util/README.md)

---
Generic wrapper for *Device* to have generic methods and behavior on all sensors **Parameter**

--- 
List of [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)  for getting all {@link Sensor

--- 
**Parameter** *consumer* to notify [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)  with {@link Sensor

--- 
Creates new [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  **Parameter** *device* *Device* to wrap with [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  **Parameter** *uid*    for unique identifier *Return* [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))

--- 
Creates new [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  **Parameter** *deviceIdentifier* *Device* identifier **Parameter** *uid*              for unique identifier like [DEVICE_IDENTIFIER](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  **Parameter** *connection*       *IPConnection* for *Device* *Return* [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))

--- 
Constructor **Parameter** *device* connected original *Device* **Parameter** *uid*    cached uid of *getIdentity() (Device)*

--- 
Tells if the sensor is real/present. The sensors are fake sensors as long as the connection is not established *Return* true if the sensor is present

--- 
This method should not be called to often as this slows down the sensors Checks if the sensor is [isPresent()](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  and checks the connection by [port](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  *Return* true if the sensor is present and the port refresh was successfully as the refresh needs that the *Device* is answering

--- 
*Return* [Compare](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/builder/Compare.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/builder/Compare.java))  with predefined compare methods

--- 
For automation to know if its worth to call ledStatus_setStatus functions. Value is taken from [initLedConfig()](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  *Return* true if the Sensor *Device* has ledStatus_setStatus

--- 
For automation to know if its worth to call ledAdditional functions. Value is taken from [initLedConfig()](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  *Return* true if the Sensor *Device* has ledAdditional

--- 
Tells if the Sensor is a brick or bricklet calculated from {@link Sensor

--- 
Same method as [valueMap](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  with limitation of 1 call per millisecond **Parameter** *limitPerSec* sets message limit per seconds (hast to be > 0 and < 1000000000) else default method [send(Object...)](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  will be called **Parameter** *values*      some objects like a "howdy", 123, Color.GREEN which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
**Parameter** *value* some object like a "howdy" string for [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Sets the refresh rate for the sensor values (e.g. for power issues) **Parameter** *perSec* hast to be in range of 0 to 1000 (0 = listen only on changes)               
 Some old *Device* does't have the option 0 and will fall back to period callback *Return* current {@link Sensor

--- 
Sets the refresh period directly to the *Device* - its safer to use the method [refreshLimit(int)](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  **Parameter** *milliseconds* callBack period *Return* current {@link Sensor

--- 
**Parameter** *values* some objects like a "howdy", "howdy2" string for [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Loads the led configurations for ledStatus_setStatus and ledAdditional *Return* current {@link Sensor

--- 
*Return* [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  state or null if ledStatus_setStatus is not present

--- 
*Return* [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  state or null if ledAdditional is not present

--- 
**Parameter** *ledStatusType* for status led like [LED_STATUS_HEARTBEAT](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
**Parameter** *value* for status led like [LED_STATUS_HEARTBEAT](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
**Parameter** *ledStatusType* additional led like [LED_ADDITIONAL_ON](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
**Parameter** *value* additional led like [LED_ADDITIONAL_ON](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Status led try to show [LED_STATUS](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Status led try to show [LED_STATUS_HEARTBEAT](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Status led try to show [LED_STATUS_ON](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Status led try to show [LED_STATUS_OFF](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
led try to show [LED_ADDITIONAL_ON](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the display of [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
led try to show [LED_ADDITIONAL_HEARTBEAT](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the flash led of [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Additional led try to show [LED_ADDITIONAL_HEARTBEAT](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Additional led try to show [LED_ADDITIONAL_STATUS](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like the [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
led try to show [LED_ADDITIONAL_ON](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  like display of [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  which the sensor could process - else it just should ignore it *Return* current {@link Sensor

--- 
Gets the send of [ValueType](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  **Parameter** *valueType* to get from {@link Sensor

--- 
Gets the send of [ValueType](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/type/ValueType.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/type/ValueType.java))  **Parameter** *valueType* to get from {@link Sensor

--- 
Connected port first number represents the brick and the second the connected port *Return* port starts at 0

--- 
Refreshes/Searches the {@link Sensor

--- 
Relink parent and sets port if given Sensor were the parent **Parameter** *sensorList* of possible parents

--- 
Relink parent and sets port if given Sensor were the parent **Parameter** *sensor* to link as parent

--- 
Internal api to send {@link Sensor

--- 
Compares the sensor with *Device* *Return* true if the is connected with class type of *Device*

--- 
Compares the sensor with {@link Sensor

--- 
*Return* class type of *Device*

--- 
Flashing status led *Return* {@link Sensor

--- 
This is needed for the [SensorRegistry](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/SensorRegistry.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/SensorRegistry.java))  to instantiate [newInstance(Integer, String, IPConnection)](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  new [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))

--- 
Generic led function enum for all [Sensor](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  types, can be used also in [setLedStatus(Integer)](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))  or [ledAdditional(Integer)](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/readmeDoc/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.md) ([source](https://github.com/YunaBraska/tinkerforge-sensor/blob/master/src/main/java/berlin/yuna/tinkerforgesensor/model/sensor/Sensor.java))

--- 
