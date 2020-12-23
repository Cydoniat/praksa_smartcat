# Internship SmartCat - SmartSky Platform

We need a system which will collect information about flights, collect live feed from airplanes and make reports, and take care of active flights to avoid fatal scenarios. 

Before an airplane wants to fly from city A to B, it is necessary to receive acknowledgement to fly. Acknowledgement will be sent if there are no more then X active flights, and responder will calculate the distance and flight time, and send response back to the airplane. 

While the airplane is flying, it will send coordinates, speed and altitude, which will be collected by the system. Also, we have flight towers listen to airplanes feed in a range of 300 km. If two airplanes are approaching each other in a range of 20 kilometers, it’s necessary to change direction of both planes, to avoid possible collision.

Reports needed:
* For each flight number
* Number of flights in time range
* Number of possible collisions

System should be implemented using following technologies:
* SpringBoot
* Apache Cassandra
* Apache Kafka
* Docker
* Redis
